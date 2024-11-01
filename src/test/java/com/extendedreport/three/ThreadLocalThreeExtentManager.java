package com.extendedreport.three;

import com.aventstack.extentreports.ExtentTest;

public class ThreadLocalThreeExtentManager {

    private ThreadLocalThreeExtentManager() {

    }

    //whichever thread  will be executing in that thread a code is running now in that
    // this class mehod is calld now the threadlocal is assigned ie now this local
    // variable assigned seperatly for thread only local variable is type of the ExtendTest class
    private static ThreadLocal<ExtentTest> extent = new ThreadLocal<>();

    public static  ExtentTest getExtentTest(){
        return extent.get();
    }

    public  static  void setExtentTest(ExtentTest test){
        extent.set(test);
    }

    public static void unload(){
        extent.remove();
    }
}