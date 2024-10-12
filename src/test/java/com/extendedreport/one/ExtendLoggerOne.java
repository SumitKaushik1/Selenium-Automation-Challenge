package com.extendedreport.one;


// it cannot be inherited or exend bz final clsss

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
}
