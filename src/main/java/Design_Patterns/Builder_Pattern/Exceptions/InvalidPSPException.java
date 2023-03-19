package Design_Patterns.Builder_Pattern.Exceptions;

public class InvalidPSPException extends RuntimeException{
    public InvalidPSPException() {
    }

    public InvalidPSPException(String message) {
        super(message);
    }

    public InvalidPSPException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidPSPException(Throwable cause) {
        super(cause);
    }

    public InvalidPSPException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
