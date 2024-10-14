package com.extendedreport.five;


// it cannot be inherited or exend bz final clsss

import com.aventstack.extentreports.MediaEntityBuilder;
import com.basedriver.basetest.Five.BaseTestChromeFive;
import enumconstants.MethodPropertiesConstant;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import propertesfilesread.MethodPropertiesPropertyFileRead;

// this class is made to avoid verbosity of the methods manes to hide the names of all methods which are using acctually
public final class ExtendLoggerToAddLogInReportFive {
    private ExtendLoggerToAddLogInReportFive(){}

  public static void pass(String message){
        ExtentManagerThreadLocalFive.getExtentTest().pass(message);

  }
    public static void fail(String message){
        ExtentManagerThreadLocalFive.getExtentTest().fail(message);

    }
    public static void skip(String message){
        ExtentManagerThreadLocalFive.getExtentTest().skip(message);

    }

    public static String getBase64Imgage(){
        //webdriver is the interface and its  impelemention class has also implemented the TakeScrrenshot interface
        return ((TakesScreenshot) BaseTestChromeFive.getDriver()).getScreenshotAs(OutputType.BASE64);
        //directly getdriver() from basetest package
    }


    public static void pass(String message,boolean isScreenshotNeeded)throws Exception{
        if(MethodPropertiesPropertyFileRead.readPropertyFile(MethodPropertiesConstant.PASSEDSTEPSSCREENSHOTS).equalsIgnoreCase("yes")&& isScreenshotNeeded){
            //isScreenshotNeeded is the local variable
            ExtentManagerThreadLocalFive.getExtentTest().pass(message, MediaEntityBuilder.createScreenCaptureFromBase64String(ExtendLoggerToAddLogInReportFive.getBase64Imgage()).build());
        }
        else{
            ExtendLoggerToAddLogInReportFive.pass(message);
        }
    }


    public static void fail(String message,boolean isScreenshotNeeded)throws Exception{
        if(MethodPropertiesPropertyFileRead.readPropertyFile(MethodPropertiesConstant.FAILEDSTEPSSCREENSHOTS).equalsIgnoreCase("yes")&& isScreenshotNeeded){
            //isScreenshotNeeded is the local variable
            ExtentManagerThreadLocalFive.getExtentTest().fail(message, MediaEntityBuilder.createScreenCaptureFromBase64String(ExtendLoggerToAddLogInReportFive.getBase64Imgage()).build());
        }
        else{
            ExtendLoggerToAddLogInReportFive.fail(message);
        }
    }


    public static void skip(String message,boolean isScreenshotNeeded)throws Exception{
        if(MethodPropertiesPropertyFileRead.readPropertyFile(MethodPropertiesConstant.SKIPPEDSTEPSSCREENSHOTS).equalsIgnoreCase("yes")&& isScreenshotNeeded){
            //isScreenshotNeeded is the local variable
            ExtentManagerThreadLocalFive.getExtentTest().skip(message, MediaEntityBuilder.createScreenCaptureFromBase64String(ExtendLoggerToAddLogInReportFive.getBase64Imgage()).build());
        }
        else{
            ExtendLoggerToAddLogInReportFive.skip(message);
        }
    }



}
