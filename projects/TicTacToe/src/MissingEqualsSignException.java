public class MissingEqualsSignException extends Exception {
    public MissingEqualsSignException() {
        super("Missing equals sign");
    }

    public MissingEqualsSignException(String message) {
        super(message);
    }
}
