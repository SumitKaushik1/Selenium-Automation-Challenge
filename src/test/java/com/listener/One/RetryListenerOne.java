package com.listener.One;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryListenerOne implements IRetryAnalyzer {

// it is used in teh AnnotationTransformerListenerOne.java class in lisetener package
    int counter=0;
    int limit=2;

    @Override
    public boolean retry(ITestResult result){

        if(counter<limit){
// two times it will run taht method whcih use thsi class

            // if that method does not run 2nd time hat method test will be ignored
            counter++;
            return true;
        }
        return false;
    }
}
