package customExceptions;


// to give hte customized messag we make the custom excpetion
public class FrameworkException extends RuntimeException {
    public FrameworkException(String message){
        super(message);


    }

    public FrameworkException(String message,Throwable cause){
    super(message,cause);
    }
}
