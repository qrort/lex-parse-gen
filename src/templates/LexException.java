package templates;


public class LexException extends Exception {
    public LexException(String errorMessage) {
        super(errorMessage);
    }
    public LexException(String errorMessage, int position) {
        super(errorMessage + " at position " + position);
    }
}

