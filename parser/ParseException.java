package expression.parser;

@SuppressWarnings("serial")
public class ParseException extends RuntimeException {
    public ParseException(final String message) {
        super(message);
    }
}
