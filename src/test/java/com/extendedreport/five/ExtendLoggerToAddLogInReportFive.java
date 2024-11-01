package com.extendedreport.five;


// it cannot be inherited or exend bz final clsss

import com.aventstack.extentreports.MediaEntityBuilder;
import com.screenshot.ScreenshotUtilsFive;
import enumconstants.MethodPropertiesConstant;
import propertesfilesread.MethodPropertiesPropertyFileRead;

// this class is made to avoid verbosity of the methods manes to hide the names of all methods which are using acctually
public final class ExtendLoggerToAddLogInReportFive {
    private ExtendLoggerToAddLogInReportFive(){}

  public static void pass(String message){
        ThreadLocalFiveExtentManager.getExtentTest().pass(message);

  }
    public static void fail(String message){
        ThreadLocalFiveExtentManager.getExtentTest().fail(message);

    }
    public static void skip(String message){
        ThreadLocalFiveExtentManager.getExtentTest().skip(message);

    }




    public static void pass(String message,boolean isScreenshotNeeded)throws Exception{
        if(MethodPropertiesPropertyFileRead.readPropertyFile(MethodPropertiesConstant.PASSEDSTEPSSCREENSHOTS).equalsIgnoreCase("yes")&& isScreenshotNeeded){
            //isScreenshotNeeded is the local variable
            ThreadLocalFiveExtentManager.getExtentTest().pass(message, MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtilsFive.getBase64Imgage()).build());
        }
        else{
            ExtendLoggerToAddLogInReportFive.pass(message);
        }
    }


    public static void fail(String message,boolean isScreenshotNeeded)throws Exception{
        if(MethodPropertiesPropertyFileRead.readPropertyFile(MethodPropertiesConstant.FAILEDSTEPSSCREENSHOTS).equalsIgnoreCase("yes")&& isScreenshotNeeded){
            //isScreenshotNeeded is the local variable
            ThreadLocalFiveExtentManager.getExtentTest().fail(message, MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtilsFive.getBase64Imgage()).build());
        }
        else{
            ExtendLoggerToAddLogInReportFive.fail(message);
        }
    }


    public static void skip(String message,boolean isScreenshotNeeded)throws Exception{
        if(MethodPropertiesPropertyFileRead.readPropertyFile(MethodPropertiesConstant.SKIPPEDSTEPSSCREENSHOTS).equalsIgnoreCase("yes")&& isScreenshotNeeded){
            //isScreenshotNeeded is the local variable
            ThreadLocalFiveExtentManager.getExtentTest().skip(message, MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtilsFive.getBase64Imgage()).build());
        }
        else{
            ExtendLoggerToAddLogInReportFive.skip(message);
        }
    }



}
