package com.extendedreport.two;


// it cannot be inherited or exend bz final clsss

import com.aventstack.extentreports.MediaEntityBuilder;
import com.screenshot.ScreenshotUtilsTwo;
import enumconstants.MethodPropertiesConstant;
import propertesfilesread.MethodPropertiesPropertyFileRead;

// this class is made to avoid verbosity of the methods manes to hide the names of all methods which are using acctually
public final class TwoExtentLogger {
    private TwoExtentLogger(){}

  public static void pass(String message){
        ThreadLocalTwoExtentManager.getExtentTest().pass(message);

  }
    public static void fail(String message){
        ThreadLocalTwoExtentManager.getExtentTest().fail(message);

    }
    public static void skip(String message){
        ThreadLocalTwoExtentManager.getExtentTest().skip(message);

    }






    public static void pass(String message,boolean isScreenshotNeeded)throws Exception{
        if(MethodPropertiesPropertyFileRead.readPropertyFile(MethodPropertiesConstant.PASSEDSTEPSSCREENSHOTS).equalsIgnoreCase("yes")&& isScreenshotNeeded){
            //isScreenshotNeeded is the local variable
            ThreadLocalTwoExtentManager.getExtentTest().pass(message, MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtilsTwo.getBase64Imgage()).build());
        }
        else{
            TwoExtentLogger.pass(message);
        }
    }




    public static void fail(String message,boolean isScreenshotNeeded)throws Exception{
        if(MethodPropertiesPropertyFileRead.readPropertyFile(MethodPropertiesConstant.FAILEDSTEPSSCREENSHOTS).equalsIgnoreCase("yes")&& isScreenshotNeeded){
            //isScreenshotNeeded is the local variable
            ThreadLocalTwoExtentManager.getExtentTest().fail(message, MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtilsTwo.getBase64Imgage()).build());
        }
        else{
            TwoExtentLogger.fail(message);
        }
    }





    public static void skip(String message,boolean isScreenshotNeeded)throws Exception {
        if (MethodPropertiesPropertyFileRead.readPropertyFile(MethodPropertiesConstant.SKIPPEDSTEPSSCREENSHOTS).equalsIgnoreCase("yes") && isScreenshotNeeded) {
            //isScreenshotNeeded is the local variable
            ThreadLocalTwoExtentManager.getExtentTest().fail(message, MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtilsTwo.getBase64Imgage()).build());
        } else {
            TwoExtentLogger.skip(message);
        }
    }




}
