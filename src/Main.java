import grammar.*;
import org.antlr.v4.runtime.*;
import java.util.*;

/**
 * Main object.
 *
 * @author Camilo Chacón Sartori
 * @version 0.0.1
 */
public class Main{


    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
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

            //Run program
            parser.program();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class ErrorListener extends BaseErrorListener {
    /**
     * Syntax error.
     *
     * @param recognizer         the recognizer
     * @param offendingSymbol    the offending symbol
     * @param line               the line
     * @param charPositionInLine the char position in line
     * @param msg                the msg
     * @param e                  the e
     */
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

/**
 * The type Parse exception.
 */
class ParseException extends RuntimeException {
    /**
     * The Line.
     */
    int line;

    /**
     * Instantiates a new Parse exception.
     *
     * @param message the message
     * @param cause   the cause
     * @param line    the line
     */
    public ParseException(String message, Throwable cause, int line) {
        super(message, cause);
        this.line = line;
    }
}
