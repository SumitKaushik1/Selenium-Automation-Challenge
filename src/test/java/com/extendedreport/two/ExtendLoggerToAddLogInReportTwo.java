package com.extendedreport.two;


// it cannot be inherited or exend bz final clsss

import com.aventstack.extentreports.MediaEntityBuilder;
import com.screenshot.ScreenshotUtilsTwo;
import enumconstants.MethodPropertiesConstant;
import propertesfilesread.MethodPropertiesPropertyFileRead;

// this class is made to avoid verbosity of the methods manes to hide the names of all methods which are using acctually
public final class ExtendLoggerToAddLogInReportTwo {
    private ExtendLoggerToAddLogInReportTwo(){}

  public static void pass(String message){
        ExtentManagerThreadLocalTwo.getExtentTest().pass(message);

  }
    public static void fail(String message){
        ExtentManagerThreadLocalTwo.getExtentTest().fail(message);

    }
    public static void skip(String message){
        ExtentManagerThreadLocalTwo.getExtentTest().skip(message);

    }






    public static void pass(String message,boolean isScreenshotNeeded)throws Exception{
        if(MethodPropertiesPropertyFileRead.readPropertyFile(MethodPropertiesConstant.PASSEDSTEPSSCREENSHOTS).equalsIgnoreCase("yes")&& isScreenshotNeeded){
            //isScreenshotNeeded is the local variable
            ExtentManagerThreadLocalTwo.getExtentTest().pass(message, MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtilsTwo.getBase64Imgage()).build());
        }
        else{
            ExtendLoggerToAddLogInReportTwo.pass(message);
        }
    }




    public static void fail(String message,boolean isScreenshotNeeded)throws Exception{
        if(MethodPropertiesPropertyFileRead.readPropertyFile(MethodPropertiesConstant.FAILEDSTEPSSCREENSHOTS).equalsIgnoreCase("yes")&& isScreenshotNeeded){
            //isScreenshotNeeded is the local variable
            ExtentManagerThreadLocalTwo.getExtentTest().fail(message, MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtilsTwo.getBase64Imgage()).build());
        }
        else{
            ExtendLoggerToAddLogInReportTwo.fail(message);
        }
    }





    public static void skip(String message,boolean isScreenshotNeeded)throws Exception {
        if (MethodPropertiesPropertyFileRead.readPropertyFile(MethodPropertiesConstant.SKIPPEDSTEPSSCREENSHOTS).equalsIgnoreCase("yes") && isScreenshotNeeded) {
            //isScreenshotNeeded is the local variable
            ExtentManagerThreadLocalTwo.getExtentTest().fail(message, MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtilsTwo.getBase64Imgage()).build());
        } else {
            ExtendLoggerToAddLogInReportTwo.skip(message);
        }
    }




}
