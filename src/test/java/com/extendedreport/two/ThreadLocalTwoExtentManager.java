package com.extendedreport.two;

import com.aventstack.extentreports.ExtentTest;

import java.util.Objects;

public class ThreadLocalTwoExtentManager {

    private ThreadLocalTwoExtentManager() {

    }

    //whichever thread  will be executing in that thread a code is running now in that
    // this class mehod is calld now the threadlocal is assigned ie now this local
    // variable assigned seperatly for thread only local variable is type of the ExtendTest class
    private static ThreadLocal<ExtentTest> extent = new ThreadLocal<>();

   static  ExtentTest getExtentTest(){
        return extent.get();
    }

     static  void setExtentTest(ExtentTest test){

        if(Objects.nonNull(test))
        extent.set(test);
    }

    static void unload(){
        extent.remove();
    }
}