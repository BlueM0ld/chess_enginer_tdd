package exception;

public class IllegalPositionException extends Exception{
    public IllegalPositionException(String invalidPosition) {
        super(invalidPosition);
    }
}