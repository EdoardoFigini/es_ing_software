public class TooOldException extends RuntimeException{
    public TooOldException() {
        super("Too old!");
    }

    public TooOldException(String msg) {
        super(msg);
    }

}
