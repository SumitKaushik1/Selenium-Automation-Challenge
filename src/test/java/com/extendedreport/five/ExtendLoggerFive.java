package com.extendedreport.five;


// it cannot be inherited or exend bz final clsss

import com.extendedreport.four.ExtentManagerFour;

// this class is made to avoid verbosity of the methods manes to hide the names of all methods which are using acctually
public final class ExtendLoggerFive {
    private ExtendLoggerFive(){}

  public static void pass(String message){
        ExtentManagerFive.getExtentTest().pass(message);

  }
    public static void fail(String message){
        ExtentManagerFive.getExtentTest().fail(message);

    }
    public static void skip(String message){
        ExtentManagerFive.getExtentTest().skip(message);

    }
}
