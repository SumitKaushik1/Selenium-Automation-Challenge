package com.extendedreport.four;


// it cannot be inherited or exend bz final clsss

import com.aventstack.extentreports.MediaEntityBuilder;
import com.screenshot.ScreenshotUtilsFour;
import enumconstants.MethodPropertiesConstant;
import propertesfilesread.MethodPropertiesPropertyFileRead;

// this class is made to avoid verbosity of the methods manes to hide the names of all methods which are using acctually
public final class ExtendLoggerToAddLogInReportFour {
    private ExtendLoggerToAddLogInReportFour(){}

  public static void pass(String message){
        ThreadLocalFourExtentManager.getExtentTest().pass(message);

  }
    public static void fail(String message){
        ThreadLocalFourExtentManager.getExtentTest().fail(message);

    }
    public static void skip(String message){
        ThreadLocalFourExtentManager.getExtentTest().skip(message);

    }





    public static void pass(String message,boolean isScreenshotNeeded)throws Exception{
        if(MethodPropertiesPropertyFileRead.readPropertyFile(MethodPropertiesConstant.PASSEDSTEPSSCREENSHOTS).equalsIgnoreCase("yes")&& isScreenshotNeeded){
            //isScreenshotNeeded is the local variable
            ThreadLocalFourExtentManager.getExtentTest().pass(message, MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtilsFour.getBase64Imgage()).build());
        }
        else{
            ExtendLoggerToAddLogInReportFour.pass(message);
        }
    }




    public static void fail(String message,boolean isScreenshotNeeded)throws Exception{
        if(MethodPropertiesPropertyFileRead.readPropertyFile(MethodPropertiesConstant.FAILEDSTEPSSCREENSHOTS).equalsIgnoreCase("yes")&& isScreenshotNeeded){
            //isScreenshotNeeded is the local variable
            ThreadLocalFourExtentManager.getExtentTest().fail(message, MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtilsFour.getBase64Imgage()).build());
        }
        else{
            ExtendLoggerToAddLogInReportFour.fail(message);
        }
    }





    public static void skip(String message,boolean isScreenshotNeeded)throws Exception {
        if (MethodPropertiesPropertyFileRead.readPropertyFile(MethodPropertiesConstant.SKIPPEDSTEPSSCREENSHOTS).equalsIgnoreCase("yes") && isScreenshotNeeded) {
            //isScreenshotNeeded is the local variable
            ThreadLocalFourExtentManager.getExtentTest().fail(message, MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtilsFour.getBase64Imgage()).build());
        } else {
            ExtendLoggerToAddLogInReportFour.skip(message);
        }
    }





}
