package com.extendedreport.two;

public class ExtentLoggerImpl implements Loggable {
@Override
    public void log(String status,String message){
    if(status.equalsIgnoreCase("pass")){
        ThreadLocalTwoExtentManager.getExtentTest().pass(message);
    }else if(status.equalsIgnoreCase("fail")) {
        ThreadLocalTwoExtentManager.getExtentTest().fail(message);

    }
}
}
