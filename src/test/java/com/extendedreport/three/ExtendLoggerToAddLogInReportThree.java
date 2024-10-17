package com.extendedreport.three;


// it cannot be inherited or exend bz final clsss

import com.aventstack.extentreports.MediaEntityBuilder;
import com.screenshot.ScreenshotUtilsThree;
import enumconstants.MethodPropertiesConstant;
import propertesfilesread.MethodPropertiesPropertyFileRead;

// this class is made to avoid verbosity of the methods manes to hide the names of all methods which are using acctually
public final class ExtendLoggerToAddLogInReportThree {
    private ExtendLoggerToAddLogInReportThree(){}

  public static void pass(String message){
        ExtentManagerThreadLocalThree.getExtentTest().pass(message);

  }
    public static void fail(String message){
        ExtentManagerThreadLocalThree.getExtentTest().fail(message);

    }
    public static void skip(String message){
        ExtentManagerThreadLocalThree.getExtentTest().skip(message);

    }







    public static void pass(String message,boolean isScreenshotNeeded)throws Exception{
        if(MethodPropertiesPropertyFileRead.readPropertyFile(MethodPropertiesConstant.PASSEDSTEPSSCREENSHOTS).equalsIgnoreCase("yes")&& isScreenshotNeeded){
            //isScreenshotNeeded is the local variable
            ExtentManagerThreadLocalThree.getExtentTest().pass(message, MediaEntityBuilder.createScreenCaptureFromBase64String( ScreenshotUtilsThree.getBase64Imgage()).build());
        }
        else{
            ExtendLoggerToAddLogInReportThree.pass(message);
        }
    }




    public static void fail(String message,boolean isScreenshotNeeded)throws Exception{
        if(MethodPropertiesPropertyFileRead.readPropertyFile(MethodPropertiesConstant.FAILEDSTEPSSCREENSHOTS).equalsIgnoreCase("yes")&& isScreenshotNeeded){
            //isScreenshotNeeded is the local variable
            ExtentManagerThreadLocalThree.getExtentTest().fail(message, MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtilsThree.getBase64Imgage()).build());
        }
        else{
            ExtendLoggerToAddLogInReportThree.fail(message);
        }
    }





    public static void skip(String message,boolean isScreenshotNeeded)throws Exception {
        if (MethodPropertiesPropertyFileRead.readPropertyFile(MethodPropertiesConstant.SKIPPEDSTEPSSCREENSHOTS).equalsIgnoreCase("yes") && isScreenshotNeeded) {
            //isScreenshotNeeded is the local variable
            ExtentManagerThreadLocalThree.getExtentTest().skip(message, MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtilsThree.getBase64Imgage()).build());
        } else {
            ExtendLoggerToAddLogInReportThree.skip(message);
        }
    }

}
