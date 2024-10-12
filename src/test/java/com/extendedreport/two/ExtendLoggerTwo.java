package com.extendedreport.two;


// it cannot be inherited or exend bz final clsss

import com.extendedreport.one.ExtentManagerOne;

// this class is made to avoid verbosity of the methods manes to hide the names of all methods which are using acctually
public final class ExtendLoggerTwo {
    private ExtendLoggerTwo(){}

  public static void pass(String message){
        ExtentManagerTwo.getExtentTest().pass(message);

  }
    public static void fail(String message){
        ExtentManagerTwo.getExtentTest().fail(message);

    }
    public static void skip(String message){
        ExtentManagerTwo.getExtentTest().skip(message);

    }
}
