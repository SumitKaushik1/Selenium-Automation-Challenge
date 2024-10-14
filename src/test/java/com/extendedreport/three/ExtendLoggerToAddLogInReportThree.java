package com.extendedreport.three;


// it cannot be inherited or exend bz final clsss

import com.aventstack.extentreports.MediaEntityBuilder;
import com.basedriver.basetest.three.BaseTestChromeThree;
import com.basedriver.basetest.two.BaseTestChromeTwo;
import com.extendedreport.two.ExtendLoggerToAddLogInReportTwo;
import com.extendedreport.two.ExtentManagerThreadLocalTwo;
import enumconstants.MethodPropertiesConstant;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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



    public static String getBase64Imgage(){
        //webdriver is the interface and its  impelemention class has also implemented the TakeScrrenshot interface
        return ((TakesScreenshot) BaseTestChromeThree.getDriverChrome()).getScreenshotAs(OutputType.BASE64);
    }




    public static void pass(String message,boolean isScreenshotNeeded)throws Exception{
        if(MethodPropertiesPropertyFileRead.readPropertyFile(MethodPropertiesConstant.PASSEDSTEPSSCREENSHOTS).equalsIgnoreCase("yes")&& isScreenshotNeeded){
            //isScreenshotNeeded is the local variable
            ExtentManagerThreadLocalThree.getExtentTest().pass(message, MediaEntityBuilder.createScreenCaptureFromBase64String(ExtendLoggerToAddLogInReportThree.getBase64Imgage()).build());
        }
        else{
            ExtendLoggerToAddLogInReportThree.pass(message);
        }
    }




    public static void fail(String message,boolean isScreenshotNeeded)throws Exception{
        if(MethodPropertiesPropertyFileRead.readPropertyFile(MethodPropertiesConstant.FAILEDSTEPSSCREENSHOTS).equalsIgnoreCase("yes")&& isScreenshotNeeded){
            //isScreenshotNeeded is the local variable
            ExtentManagerThreadLocalThree.getExtentTest().fail(message, MediaEntityBuilder.createScreenCaptureFromBase64String(ExtendLoggerToAddLogInReportThree.getBase64Imgage()).build());
        }
        else{
            ExtendLoggerToAddLogInReportThree.fail(message);
        }
    }





    public static void skip(String message,boolean isScreenshotNeeded)throws Exception {
        if (MethodPropertiesPropertyFileRead.readPropertyFile(MethodPropertiesConstant.SKIPPEDSTEPSSCREENSHOTS).equalsIgnoreCase("yes") && isScreenshotNeeded) {
            //isScreenshotNeeded is the local variable
            ExtentManagerThreadLocalThree.getExtentTest().skip(message, MediaEntityBuilder.createScreenCaptureFromBase64String(ExtendLoggerToAddLogInReportThree.getBase64Imgage()).build());
        } else {
            ExtendLoggerToAddLogInReportThree.skip(message);
        }
    }

}
