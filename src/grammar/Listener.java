
package grammar;
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


public class Listener extends PoleLangBaseListener {


    private Map<String, Integer> variables;
    private List<String> buffer  = new ArrayList<>();
    public Listener() {
        variables = new HashMap<>();
    }
    private Path exitsFile(String fileName){
        Path pathFile = Paths.get(fileName);

        if(Files.notExists(pathFile)){
            System.out.println(pathFile.getFileName());
            System.out.println("No found file.");
            return null;
        }
        return pathFile;
    }

    @Override
    public void exitPrintAction(PrintActionContext ctx) {
        Path pathFile = exitsFile(ctx.FileNameText().toString());

        if(pathFile == null) return;

        int indexLine = 1;
        boolean isParams = false;
        boolean isLineActionWithLimit = false;
        boolean isIfAction = false;
        String ifActionSearch = "";
        int startLine = 0, endLine = 0;
        String endLineText = "";
        if(ctx.printActionParameters() != null){
            isParams = true;
            //Line action
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
                    //System.out.println(endLineText);
                    endLine = (endLineText.equals("end")) ? -1 : Integer.parseInt(endLineText);
                }
                //If action
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
                    //System.out.println(endLineText);
                    endLine = (endLineText.equals("end")) ? -1 : Integer.parseInt(endLineText);
                }
                ifActionSearch = existsAction.StringInput().getText().substring(1, existsAction.StringInput().getText().length() - 1);

            }

        }
        try (Stream<String> lines = Files.lines(pathFile)) {
            if(!isParams) lines.forEach(System.out::println);
            else{
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
                    //System.out.println(String.format("Line %d - %s", indexLine++, row));
                }
            }

        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void exitAddAction(AddActionContext ctx) {
        boolean isHead = ctx.headAction() != null;

        Path pathFile = exitsFile(ctx.FileNameText().toString());
        if(pathFile == null) return;
        String textInput = ctx.StringInput().getText().substring(1, ctx.StringInput().getText().length() - 1);

        try (Stream<String> lines = Files.lines(pathFile)) {
            List<String> replaced = lines
                    .map(line-> (isHead) ? textInput + line: line + textInput)
                    .collect(Collectors.toList());

            Files.write(pathFile, replaced);

            buffer = lines.collect(Collectors.toList());

        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    private static boolean isNumeric(String str)
    {
        return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
    }
    @Override
    public void exitSplitAction(SplitActionContext ctx) {

        Path pathFile = exitsFile(ctx.FileNameText().toString());
        if(pathFile == null) return;
        String delimiter = ctx.StringInput().getText().substring(1, ctx.StringInput().getText().length() - 1);

        SplitOperationsContext splitOperations = ctx.splitOperations();

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
                System.out.println("A problem detect in the file");
            }


        }else if(splitOperations.splitSumColumn() != null){
            int indexColumn = Integer.parseInt(splitOperations.splitSumColumn().Number().getText());
            try{
                List<String> data =  Files.lines(pathFile).collect(Collectors.toList());
                Double sumValues = IntStream.range(0, data.size()).boxed()
                        .mapToDouble(i ->  Double.parseDouble(Arrays.asList(data.get(i).split(delimiter)).get(indexColumn-1)))
                        .sum();
                buffer.add(sumValues.toString());
                System.out.println(String.format("Column: %d sum-value: %f", indexColumn, sumValues));
            }catch (Exception ex){
                System.out.println("A problem detect in the file");
            }
        }
    }

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

    @Override
    public void exitIterativeAction(IterativeActionContext ctx) {
        ForActionContext forAction = ctx.forAction();
        if(forAction != null){
            int index = Integer.parseInt(forAction.Number(0).getText());
            int limit = Integer.parseInt(forAction.Number(1).getText());
            variables.put(forAction.ID().getText(), Integer.parseInt(forAction.Number(0).getText()));
            String text = forAction.iterativeOutputAction().StringInput().getText();
            text = text.substring(1, text.length() - 1);

            String indexVariable = String.format("{%s}", forAction.ID().getText());
            while(index < limit){
                if(text.contains(indexVariable)){
                    text = text.replace(indexVariable, String.valueOf(index));
                }
                buffer.add(text);
                System.out.println(text);
                index++;
            }
        }
    }
    /*
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e)
            throws ParseCancellationException {
        throw new ParseCancellationException("line " + line + ":" + charPositionInLine + " " + msg);
    }*/

    @Override
    public void visitErrorNode(ErrorNode node)  throws ParseCancellationException{
        throw new ParseCancellationException("Error");
    }
}
