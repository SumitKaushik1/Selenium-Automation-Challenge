package com.extendedreport.one;


// it cannot be inherited or exend bz final clsss

import com.aventstack.extentreports.MediaEntityBuilder;
import enumconstants.MethodPropertiesConstant;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import propertesfilesread.MethodPropertiesPropertyFileRead;
import threadlocal.ThreadLocalWebDriver;

// this class is made to avoid verbosity of the methods manes to hide the names of all methods which are using acctually
public final class ExtendLoggerOne {
            private ExtendLoggerOne(){}

          public static void pass(String message){
                ExtentManagerOne.getExtentTest().pass(message);

          }
            public static void fail(String message){
                ExtentManagerOne.getExtentTest().fail(message);

            }
            public static void skip(String message){
                ExtentManagerOne.getExtentTest().skip(message);

            }


    public static String getBase64Imgage(){
                //webdriver is the interface and its  impelemention class has also implemented the TakeScrrenshot interface
         return ((TakesScreenshot) ThreadLocalWebDriver.getDriver()).getScreenshotAs(OutputType.BASE64);
    }



    public static void pass(String message,boolean isScreenshotNeeded)throws Exception{
                if(MethodPropertiesPropertyFileRead.readPropertyFile(MethodPropertiesConstant.PASSEDSTEPSSCREENSHOTS).equalsIgnoreCase("yes")&& isScreenshotNeeded){
                    //isScreenshotNeeded is the local variable
                    ExtentManagerOne.getExtentTest().pass(message, MediaEntityBuilder.createScreenCaptureFromBase64String(ExtendLoggerOne.getBase64Imgage()).build());
                }
                else{
                    ExtendLoggerOne.pass(message);
                }
            }




    public static void fail(String message,boolean isScreenshotNeeded)throws Exception{
        if(MethodPropertiesPropertyFileRead.readPropertyFile(MethodPropertiesConstant.FAILEDSTEPSSCREENSHOTS).equalsIgnoreCase("yes")&& isScreenshotNeeded){
            //isScreenshotNeeded is the local variable
            ExtentManagerOne.getExtentTest().fail(message, MediaEntityBuilder.createScreenCaptureFromBase64String(ExtendLoggerOne.getBase64Imgage()).build());
        }
        else{
            ExtendLoggerOne.fail(message);
        }
    }





    public static void skip(String message,boolean isScreenshotNeeded)throws Exception {
        if (MethodPropertiesPropertyFileRead.readPropertyFile(MethodPropertiesConstant.SKIPPEDSTEPSSCREENSHOTS).equalsIgnoreCase("yes") && isScreenshotNeeded) {
            //isScreenshotNeeded is the local variable
            ExtentManagerOne.getExtentTest().fail(message, MediaEntityBuilder.createScreenCaptureFromBase64String(ExtendLoggerOne.getBase64Imgage()).build());
        } else {
            ExtendLoggerOne.skip(message);
        }
            }




}
