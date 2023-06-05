import org.antlr.v4.runtime.*;

public class customErrorListener extends BaseErrorListener {
    String errorMessage = "";
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        errorMessage = "Error sintáctico en la línea " + line + ":" + charPositionInLine + " - " + msg;
        returnSyntaxError();
    }

    public String returnSyntaxError(){
        return errorMessage;
    }
}
