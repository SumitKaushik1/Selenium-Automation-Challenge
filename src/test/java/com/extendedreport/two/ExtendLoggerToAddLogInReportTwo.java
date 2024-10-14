package com.extendedreport.two;


// it cannot be inherited or exend bz final clsss

import com.aventstack.extentreports.MediaEntityBuilder;
import com.basedriver.basetest.two.BaseTestChromeTwo;
import com.extendedreport.one.ExtendLoggerToAddLogsInReportOne;
import com.extendedreport.one.ExtentManagerThreadLocalOne;
import enumconstants.MethodPropertiesConstant;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import propertesfilesread.MethodPropertiesPropertyFileRead;
import threadlocal.ThreadLocalWebDriver;

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




    public static String getBase64Imgage(){
        //webdriver is the interface and its  impelemention class has also implemented the TakeScrrenshot interface
        return ((TakesScreenshot) BaseTestChromeTwo.getDriverChrome()).getScreenshotAs(OutputType.BASE64);
        //directly getdriver() from basetest package

    }



    public static void pass(String message,boolean isScreenshotNeeded)throws Exception{
        if(MethodPropertiesPropertyFileRead.readPropertyFile(MethodPropertiesConstant.PASSEDSTEPSSCREENSHOTS).equalsIgnoreCase("yes")&& isScreenshotNeeded){
            //isScreenshotNeeded is the local variable
            ExtentManagerThreadLocalTwo.getExtentTest().pass(message, MediaEntityBuilder.createScreenCaptureFromBase64String(ExtendLoggerToAddLogInReportTwo.getBase64Imgage()).build());
        }
        else{
            ExtendLoggerToAddLogInReportTwo.pass(message);
        }
    }




    public static void fail(String message,boolean isScreenshotNeeded)throws Exception{
        if(MethodPropertiesPropertyFileRead.readPropertyFile(MethodPropertiesConstant.FAILEDSTEPSSCREENSHOTS).equalsIgnoreCase("yes")&& isScreenshotNeeded){
            //isScreenshotNeeded is the local variable
            ExtentManagerThreadLocalTwo.getExtentTest().fail(message, MediaEntityBuilder.createScreenCaptureFromBase64String(ExtendLoggerToAddLogInReportTwo.getBase64Imgage()).build());
        }
        else{
            ExtendLoggerToAddLogInReportTwo.fail(message);
        }
    }





    public static void skip(String message,boolean isScreenshotNeeded)throws Exception {
        if (MethodPropertiesPropertyFileRead.readPropertyFile(MethodPropertiesConstant.SKIPPEDSTEPSSCREENSHOTS).equalsIgnoreCase("yes") && isScreenshotNeeded) {
            //isScreenshotNeeded is the local variable
            ExtentManagerThreadLocalTwo.getExtentTest().fail(message, MediaEntityBuilder.createScreenCaptureFromBase64String(ExtendLoggerToAddLogInReportTwo.getBase64Imgage()).build());
        } else {
            ExtendLoggerToAddLogInReportTwo.skip(message);
        }
    }




}
