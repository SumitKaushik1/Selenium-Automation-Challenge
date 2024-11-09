package customExceptions;

public class InvalidPathExcelException extends FrameworkException{
    // to give hte customized messag we make the custom excpetion
    public InvalidPathExcelException(String message){
        super(message);
    }

    public InvalidPathExcelException(String message,Throwable cause){
        super(message,cause);
    }
}
