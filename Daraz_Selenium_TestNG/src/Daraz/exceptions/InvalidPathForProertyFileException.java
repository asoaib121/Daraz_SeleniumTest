package Daraz.exceptions;

@SuppressWarnings("serial")
public class InvalidPathForProertyFileException extends InvalidPathForExcelException {

    public InvalidPathForProertyFileException(String message) {
        super(message);
    }

    public InvalidPathForProertyFileException(String message,Throwable cause) {
        super(message,cause);
    }
}
