package com.extendedreport.one;

import com.aventstack.extentreports.ExtentTest;

public class ExtentManagerOne {

    private ExtentManagerOne() {

    }

    //whichever thread  will be executing in that thread a code is running now in that
    // this class mehod is calld now the threadlocal is assigned ie now this local
    // variable assigned seperatly for thread only local variable is type of the ExtendTest class
    private static ThreadLocal<ExtentTest> extent = new ThreadLocal<>();


    // i want that these method msut be used withing package
     static  ExtentTest getExtentTest(){
        return extent.get();
    }

      static  void setExtentTest(ExtentTest test){
        extent.set(test);
    }

     static void unload(){
        extent.remove();
    }
}