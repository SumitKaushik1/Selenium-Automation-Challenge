package com.extendedreport.four;


// it cannot be inherited or exend bz final clsss

import com.aventstack.extentreports.MediaEntityBuilder;
import enumconstants.MethodPropertiesConstant;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import propertesfilesread.MethodPropertiesPropertyFileRead;
import threadlocal.ThreadLocalWebDriver;

// this class is made to avoid verbosity of the methods manes to hide the names of all methods which are using acctually
public final class ExtendLoggerToAddLogInReportFour {
    private ExtendLoggerToAddLogInReportFour(){}

  public static void pass(String message){
        ExtentManagerThreadLocalFour.getExtentTest().pass(message);

  }
    public static void fail(String message){
        ExtentManagerThreadLocalFour.getExtentTest().fail(message);

    }
    public static void skip(String message){
        ExtentManagerThreadLocalFour.getExtentTest().skip(message);

    }


    public static String getBase64Imgage(){


        //webdriver is the interface and its  impelemention class has also implemented the TakeScrrenshot interface
        //both
        return ((TakesScreenshot) ThreadLocalWebDriver.getDriver()).getScreenshotAs(OutputType.BASE64);
        //directly getdriver() from basetest package

    }



    public static void pass(String message,boolean isScreenshotNeeded)throws Exception{
        if(MethodPropertiesPropertyFileRead.readPropertyFile(MethodPropertiesConstant.PASSEDSTEPSSCREENSHOTS).equalsIgnoreCase("yes")&& isScreenshotNeeded){
            //isScreenshotNeeded is the local variable
            ExtentManagerThreadLocalFour.getExtentTest().pass(message, MediaEntityBuilder.createScreenCaptureFromBase64String(ExtendLoggerToAddLogInReportFour.getBase64Imgage()).build());
        }
        else{
            ExtendLoggerToAddLogInReportFour.pass(message);
        }
    }




    public static void fail(String message,boolean isScreenshotNeeded)throws Exception{
        if(MethodPropertiesPropertyFileRead.readPropertyFile(MethodPropertiesConstant.FAILEDSTEPSSCREENSHOTS).equalsIgnoreCase("yes")&& isScreenshotNeeded){
            //isScreenshotNeeded is the local variable
            ExtentManagerThreadLocalFour.getExtentTest().fail(message, MediaEntityBuilder.createScreenCaptureFromBase64String(ExtendLoggerToAddLogInReportFour.getBase64Imgage()).build());
        }
        else{
            ExtendLoggerToAddLogInReportFour.fail(message);
        }
    }





    public static void skip(String message,boolean isScreenshotNeeded)throws Exception {
        if (MethodPropertiesPropertyFileRead.readPropertyFile(MethodPropertiesConstant.SKIPPEDSTEPSSCREENSHOTS).equalsIgnoreCase("yes") && isScreenshotNeeded) {
            //isScreenshotNeeded is the local variable
            ExtentManagerThreadLocalFour.getExtentTest().fail(message, MediaEntityBuilder.createScreenCaptureFromBase64String(ExtendLoggerToAddLogInReportFour.getBase64Imgage()).build());
        } else {
            ExtendLoggerToAddLogInReportFour.skip(message);
        }
    }





}
