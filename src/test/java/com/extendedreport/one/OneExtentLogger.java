package com.extendedreport.one;


// it cannot be inherited or exend bz final clsss

import com.aventstack.extentreports.MediaEntityBuilder;
import com.screenshot.OneScreenshotUtils;
import enumconstants.MethodPropertiesConstant;
import propertesfilesread.MethodPropertiesPropertyFileRead;

// this class is made to avoid verbosity of the methods manes to hide the names of all methods which are using acctually
public final class OneExtentLogger {
            private OneExtentLogger(){}

          public static void pass(String message){
                ThreadLocalOneExtentManager.getExtentTest().pass(message);

          }
            public static void fail(String message){
                ThreadLocalOneExtentManager.getExtentTest().fail(message);

            }
            public static void skip(String message){
                ThreadLocalOneExtentManager.getExtentTest().skip(message);

            }





    public static void pass(String message,boolean isScreenshotNeeded)throws Exception{
                if(MethodPropertiesPropertyFileRead.readPropertyFile(MethodPropertiesConstant.PASSEDSTEPSSCREENSHOTS).equalsIgnoreCase("yes")&& isScreenshotNeeded){
                    //isScreenshotNeeded is the local variable
                    ThreadLocalOneExtentManager.getExtentTest().pass(message, MediaEntityBuilder.createScreenCaptureFromBase64String(OneScreenshotUtils.getBase64Imgage()).build());
                }
                else{
                    OneExtentLogger.pass(message);
                }
            }




    public static void fail(String message,boolean isScreenshotNeeded)throws Exception{
        if(MethodPropertiesPropertyFileRead.readPropertyFile(MethodPropertiesConstant.FAILEDSTEPSSCREENSHOTS).equalsIgnoreCase("yes")&& isScreenshotNeeded){
            //isScreenshotNeeded is the local variable
            ThreadLocalOneExtentManager.getExtentTest().fail(message, MediaEntityBuilder.createScreenCaptureFromBase64String(OneScreenshotUtils.getBase64Imgage()).build());
        }
        else{
            OneExtentLogger.fail(message);
        }
    }





    public static void skip(String message,boolean isScreenshotNeeded)throws Exception {
        if (MethodPropertiesPropertyFileRead.readPropertyFile(MethodPropertiesConstant.SKIPPEDSTEPSSCREENSHOTS).equalsIgnoreCase("yes") && isScreenshotNeeded) {
            //isScreenshotNeeded is the local variable
            ThreadLocalOneExtentManager.getExtentTest().fail(message, MediaEntityBuilder.createScreenCaptureFromBase64String(OneScreenshotUtils.getBase64Imgage()).build());
        } else {
            OneExtentLogger.skip(message);
        }
            }




}
