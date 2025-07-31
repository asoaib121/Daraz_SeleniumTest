package Daraz.exceptions;

@SuppressWarnings("serial")
public class InvalidPathForExcelException extends InvalidPathForFilesException{
    public InvalidPathForExcelException (String massage){
        super(massage);
    }

        public InvalidPathForExcelException (String massage,Throwable cause){
            super(massage,cause);
        }
}
