package com.extendedreport.three;


// it cannot be inherited or exend bz final clsss

import com.extendedreport.two.ExtentManagerTwo;

// this class is made to avoid verbosity of the methods manes to hide the names of all methods which are using acctually
public final class ExtendLoggerThree {
    private ExtendLoggerThree(){}

  public static void pass(String message){
        ExtentManagerThree.getExtentTest().pass(message);

  }
    public static void fail(String message){
        ExtentManagerThree.getExtentTest().fail(message);

    }
    public static void skip(String message){
        ExtentManagerThree.getExtentTest().skip(message);

    }
}
