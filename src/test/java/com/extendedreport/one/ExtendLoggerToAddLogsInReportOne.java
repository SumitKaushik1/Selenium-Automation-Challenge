package com.extendedreport.one;


// it cannot be inherited or exend bz final clsss

import com.aventstack.extentreports.MediaEntityBuilder;
import enumconstants.MethodPropertiesConstant;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import propertesfilesread.MethodPropertiesPropertyFileRead;
import threadlocal.ThreadLocalWebDriver;

// this class is made to avoid verbosity of the methods manes to hide the names of all methods which are using acctually
public final class ExtendLoggerToAddLogsInReportOne {
            private ExtendLoggerToAddLogsInReportOne(){}

          public static void pass(String message){
                ExtentManagerThreadLocalOne.getExtentTest().pass(message);

          }
            public static void fail(String message){
                ExtentManagerThreadLocalOne.getExtentTest().fail(message);

            }
            public static void skip(String message){
                ExtentManagerThreadLocalOne.getExtentTest().skip(message);

            }


    public static String getBase64Imgage(){
                //webdriver is the interface and its  impelemention class has also implemented the TakeScrrenshot interface
         return ((TakesScreenshot) ThreadLocalWebDriver.getDriver()).getScreenshotAs(OutputType.BASE64);
    }



    public static void pass(String message,boolean isScreenshotNeeded)throws Exception{
                if(MethodPropertiesPropertyFileRead.readPropertyFile(MethodPropertiesConstant.PASSEDSTEPSSCREENSHOTS).equalsIgnoreCase("yes")&& isScreenshotNeeded){
                    //isScreenshotNeeded is the local variable
                    ExtentManagerThreadLocalOne.getExtentTest().pass(message, MediaEntityBuilder.createScreenCaptureFromBase64String(ExtendLoggerToAddLogsInReportOne.getBase64Imgage()).build());
                }
                else{
                    ExtendLoggerToAddLogsInReportOne.pass(message);
                }
            }




    public static void fail(String message,boolean isScreenshotNeeded)throws Exception{
        if(MethodPropertiesPropertyFileRead.readPropertyFile(MethodPropertiesConstant.FAILEDSTEPSSCREENSHOTS).equalsIgnoreCase("yes")&& isScreenshotNeeded){
            //isScreenshotNeeded is the local variable
            ExtentManagerThreadLocalOne.getExtentTest().fail(message, MediaEntityBuilder.createScreenCaptureFromBase64String(ExtendLoggerToAddLogsInReportOne.getBase64Imgage()).build());
        }
        else{
            ExtendLoggerToAddLogsInReportOne.fail(message);
        }
    }





    public static void skip(String message,boolean isScreenshotNeeded)throws Exception {
        if (MethodPropertiesPropertyFileRead.readPropertyFile(MethodPropertiesConstant.SKIPPEDSTEPSSCREENSHOTS).equalsIgnoreCase("yes") && isScreenshotNeeded) {
            //isScreenshotNeeded is the local variable
            ExtentManagerThreadLocalOne.getExtentTest().fail(message, MediaEntityBuilder.createScreenCaptureFromBase64String(ExtendLoggerToAddLogsInReportOne.getBase64Imgage()).build());
        } else {
            ExtendLoggerToAddLogsInReportOne.skip(message);
        }
            }




}
