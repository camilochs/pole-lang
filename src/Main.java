import grammar.*;
import org.antlr.v4.runtime.*;
import java.util.*;

class ErrorListener extends BaseErrorListener {
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line,
                            int charPositionInLine,
                            String msg,
                            RecognitionException e) {
        throw new ParseException(msg, e, line);
    }
}

class ParseException extends RuntimeException {
    int line;
    public ParseException(String message, Throwable cause, int line) {
        super(message, cause);
        this.line = line;
    }
}
public class Main{


    public static void main(String[] args) {
        try {
            String code = String.join(" ", Arrays.asList(args));
            CharStream cs = CharStreams.fromString(code);

            ErrorListener errorListener = new ErrorListener();
            //Lexer Definition
            PoleLangLexer lexer = new PoleLangLexer(cs);
            lexer.removeErrorListeners();
            lexer.addErrorListener(errorListener);
            
            //Parser Definition
            PoleLangParser parser = new PoleLangParser(new CommonTokenStream(lexer));
            parser.addParseListener(new Listener());
            parser.removeErrorListeners();
            parser.addErrorListener(errorListener);

            parser.program();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}