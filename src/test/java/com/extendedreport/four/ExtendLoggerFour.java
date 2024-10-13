package com.extendedreport.four;


// it cannot be inherited or exend bz final clsss

// this class is made to avoid verbosity of the methods manes to hide the names of all methods which are using acctually
public final class ExtendLoggerFour {
    private ExtendLoggerFour(){}

  public static void pass(String message){
        ExtentManagerFour.getExtentTest().pass(message);

  }
    public static void fail(String message){
        ExtentManagerFour.getExtentTest().fail(message);

    }
    public static void skip(String message){
        ExtentManagerFour.getExtentTest().skip(message);

    }
}
