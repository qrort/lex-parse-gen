package templates;

public class ParseException extends Exception {
    public ParseException(String errorMessage) {
        super(errorMessage);
    }
    public ParseException(String errorMessage, int position) {
        super(errorMessage + " at position " + position);
    }
}

