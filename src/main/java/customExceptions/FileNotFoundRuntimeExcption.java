package customExceptions;

import java.io.IOException;

public class FileNotFoundRuntimeExcption extends RuntimeException {
    public FileNotFoundRuntimeExcption(IOException message){
        super(message);//it goes to runtimeExcption class
    }
}
