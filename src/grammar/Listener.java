

package grammar;

/**
 * Check packages not used. Avoid *.
 */
import grammar.PoleLangParser.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.tree.ErrorNode;
import java.io.IOException;
import java.util.*;
import java.util.stream.*;
import java.nio.file.*;
import java.nio.charset.*;
import java.io.FileWriter;
import static java.util.Comparator.comparingDouble;


/**
 * Listener object.
 *
 * @author Camilo Chacón Sartori
 * @version 0.0.1
 */
public class Listener extends PoleLangBaseListener {


    private Map<String, Integer> variables;
    private List<String> buffer;

    /**
     * Instantiates a new Listener.
     */
    public Listener() {
        buffer = new ArrayList<>();
        variables = new HashMap<>();
    }

    /**
     * Check if exists a file
     * @param fileName
     * @return
     */
    private Path exitsFile(String fileName){
        Path pathFile = Paths.get(fileName);
        if(Files.notExists(pathFile)){
            System.out.println(pathFile.getFileName());
            System.out.println("No found file.");
            return null;
        }
        return pathFile;
    }

    /**
     * Exit print action. Note: REFACTORING please
     *
     * @param ctx the ctx
     */
    @Override
    public void exitPrintAction(PrintActionContext ctx) {
        Path pathFile = exitsFile(ctx.FileNameText().toString());
        if(pathFile == null) return;

        //Variable exit node
        int indexLine = 1;
        int startLine = 0;
        int endLine = 0;
        boolean isParams = false;
        boolean isLineActionWithLimit = false;
        boolean isIfAction = false;
        String ifActionSearch = "";
        String endLineText = "";
        final String end = "end";

        //Detect a "Print action parameters"
        if(ctx.printActionParameters() != null){
            isParams = true;
            //Detect a "Line action parameters"
            if(ctx.printActionParameters().lineAction() != null){
                LineActionContext actionContext = ctx.printActionParameters().lineAction();
                startLine = Integer.parseInt(actionContext.Number().getText());
                if(actionContext.lineActionWithLimit() != null){
                    isLineActionWithLimit = true;
                    if(actionContext.lineActionWithLimit().Number() != null){
                        endLineText = actionContext.lineActionWithLimit().Number().getText();
                    }else{
                        endLineText = actionContext.lineActionWithLimit().End().getText();
                    }
                    endLine = (endLineText.equals(end)) ? -1 : Integer.parseInt(endLineText);
                }
                //Detect a "If action"
            }else if(ctx.printActionParameters().ifAction() != null){
                isIfAction = true;
                ExitsActionContext existsAction = ctx.printActionParameters().ifAction().logicalAction().exitsAction();
                LineActionContext lineAction = existsAction.lineAction();
                startLine = Integer.parseInt(lineAction.Number().getText());

                if(existsAction.lineAction().lineActionWithLimit() != null){
                    isLineActionWithLimit = true;
                    if(lineAction.lineActionWithLimit().Number() != null){
                        endLineText = lineAction.lineActionWithLimit().Number().getText();
                    }else{
                        endLineText = lineAction.lineActionWithLimit().End().getText();
                    }
                    endLine = (endLineText.equals(end)) ? -1 : Integer.parseInt(endLineText);
                }
                ifActionSearch = existsAction.StringInput().getText()
                        .substring(1, existsAction.StringInput().getText().length() - 1);
            }
        }
        try (Stream<String> lines = Files.lines(pathFile)) {
            if(!isParams) lines.forEach(System.out::println);
            else{
                //Note: refactoring, many if nested
                for(String row : lines.collect(Collectors.toList())){
                    if(isLineActionWithLimit){
                        if ((indexLine >= startLine && endLine >= indexLine) || endLine == -1) {
                            if(!isIfAction){
                                buffer.add(row);
                                System.out.println(row);
                            }else if(row.contains(ifActionSearch)) {
                                buffer.add(row);
                                System.out.println(row);
                            }
                        } else {
                            break;
                        }

                    }else if(indexLine == startLine){
                        if(!isIfAction){
                            buffer.add(row);
                            System.out.println(row);
                        }else if(row.contains(ifActionSearch)) {
                            buffer.add(row);
                            System.out.println(row);
                        }
                        break;
                    }
                    indexLine++;
                }
            }

        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    /**
     * Exit add action.
     *
     * @param ctx the ctx
     */
    @Override
    public void exitAddAction(AddActionContext ctx) {
        boolean isHead = ctx.headAction() != null;
        Path pathFile = exitsFile(ctx.FileNameText().toString());
        if(pathFile == null) return;

        String textInput = ctx.StringInput().getText().substring(1, ctx.StringInput().getText().length() - 1);

        try (Stream<String> lines = Files.lines(pathFile)) {
            //The file is modified.
            List<String> replaced = lines
                    .map(line-> (isHead) ? textInput + line: line + textInput)
                    .collect(Collectors.toList());
            Files.write(pathFile, replaced);

            //Copy list modified to buffer
            buffer = new ArrayList<String>(replaced);

        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    /**
     * Check if string is numeric.
     * @param str
     * @return
     */
    private static boolean isNumeric(String text)
    {
        return text.matches("-?\\d+(\\.\\d+)?");
    }

    /**
     * Exit split action.
     *
     * @param ctx the ctx
     */
    @Override
    public void exitSplitAction(SplitActionContext ctx) {

        Path pathFile = exitsFile(ctx.FileNameText().toString());
        if(pathFile == null) return;

        String delimiter = ctx.StringInput().getText().substring(1, ctx.StringInput().getText().length() - 1);
        SplitOperationsContext splitOperations = ctx.splitOperations();
        //Detect a "Split Max column action"
        if(splitOperations.splitMaxColumn() != null){

            int indexColumn = Integer.parseInt(splitOperations.splitMaxColumn().Number().getText());
            try{
                List<String> data =  Files.lines(pathFile).collect(Collectors.toList());
                Double maxValue = IntStream.range(0, data.size()).boxed()
                        .map(i ->  Double.parseDouble(Arrays.asList(data.get(i).split(delimiter)).get(indexColumn-1)))
                        .max(comparingDouble(a -> a))
                        .get();
                buffer.add(maxValue.toString());
                System.out.println(String.format("Column: %d max-value: %f", indexColumn, maxValue));
            }catch (Exception ex){
                System.out.println("A problem detect in the file");
            }
            //Detect a "Split Min column action"
        }else if(splitOperations.splitMinColumn() != null){

            int indexColumn = Integer.parseInt(splitOperations.splitMinColumn().Number().getText());
            try{
                List<String> data =  Files.lines(pathFile).collect(Collectors.toList());
                Double minValue = IntStream.range(0, data.size()).boxed()
                        .map(i ->  Double.parseDouble(Arrays.asList(data.get(i).split(delimiter)).get(indexColumn-1)))
                        .min(comparingDouble(a -> a))
                        .get();
                buffer.add(minValue.toString());
                System.out.println(String.format("Column: %d min-value: %f", indexColumn, minValue));
            }catch (Exception ex){
                System.out.println("A problem detect in the file.");
            }
            //Detect a "Split Sum column action"
        }else if(splitOperations.splitSumColumn() != null){
            int indexColumn = Integer.parseInt(splitOperations.splitSumColumn().Number().getText());
            try{
                List<String> data =  Files.lines(pathFile).collect(Collectors.toList());
                Double sumValues = IntStream.range(0, data.size()).boxed()
                        .mapToDouble(i ->  Double.parseDouble(Arrays.asList(data.get(i).split(delimiter)).get(indexColumn-1)))
                        .sum();
                buffer.add(sumValues.toString());
                System.out.println(String.format("Column %d: sum-value: %f", indexColumn, sumValues));
            }catch (Exception ex){
                System.out.println("A problem detect in the file.");
            }
        }
    }

    /**
     * Exit copy action.
     *
     * @param ctx the ctx
     */
    @Override
    public void exitCopyAction(CopyActionContext ctx) {
        Path pathFile = Paths.get(ctx.FileNameText().getText());
        if(Files.notExists(pathFile)){
            try {
                Files.write(pathFile, buffer, Charset.forName("UTF-8"));
                System.out.println("Data was copied to " + ctx.FileNameText().getText());
            } catch (IOException e) {
               System.out.println(e.getMessage());
            }
        }else{
            System.out.println("Error. File to try copy already exists.");
        }
    }

    /**
     * Exit iterative action.
     *
     * @param ctx the ctx
     */
    @Override
    public void exitIterativeAction(IterativeActionContext ctx) {
        ForActionContext forAction = ctx.forAction();
        //Detect a "Iterative(For) action"
        if(forAction != null){
            //Select index(start and end).
            int index = Integer.parseInt(forAction.Number(0).getText());
            int limit = Integer.parseInt(forAction.Number(1).getText());
            variables.put(forAction.ID().getText(), Integer.parseInt(forAction.Number(0).getText()));
            String text = forAction.iterativeOutputAction().StringInput().getText();
            text = text.substring(1, text.length() - 1);
            String indexVariable = String.format("{%s}", forAction.ID().getText());
            boolean isExistVariable = false;

            if(text.contains(indexVariable)) {
                isExistVariable = true;
            }

            String tempFormat = "";
            while(index < limit){
                if(isExistVariable){
                    tempFormat = text.replace(indexVariable, Integer.toString(index));
                    buffer.add(tempFormat);
                    System.out.println(tempFormat);
                }else{
                    buffer.add(text);
                    System.out.println(text);
                }
                index++;
            }
        }
    }
    /**
     * Visit error node.
     *
     * @param node the node
     * @throws ParseCancellationException the parse cancellation exception
     */
    @Override
    public void visitErrorNode(ErrorNode node)  throws ParseCancellationException{
        throw new ParseCancellationException("Error");
    }
}
