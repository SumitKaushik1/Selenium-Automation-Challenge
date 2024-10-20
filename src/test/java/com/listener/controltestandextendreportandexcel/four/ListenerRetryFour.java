package com.listener.controltestandextendreportandexcel.four;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

// uyou have to add the listener in the xml file
public class ListenerRetryFour implements IRetryAnalyzer {
    private int count =0;
    private int retries=1;//it will retry 1 time again if it fails method

    @Override
    public boolean  retry(ITestResult result){
        boolean value =count<retries;
        count++;
        return value;
    }

}
