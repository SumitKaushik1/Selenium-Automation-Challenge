package com.listener.controltestandextendreportandexcel.four;


import enumconstants.MethodPropertiesConstant;
import org.testng.IRetryAnalyzer;
import org.testng.ITestNGListener;
import org.testng.ITestResult;
import propertesfilesread.MethodPropertiesPropertyFileRead;

// uyou have to add the listener in the xml file
public class ListenerRetryFour implements IRetryAnalyzer, ITestNGListener {
    private int count =0;
    private int retries=1;//it will retry 1 time again if it fails method

    @Override
    public boolean  retry(ITestResult result){
        boolean value =false;
        try{


            //control by property file
            if(MethodPropertiesPropertyFileRead.readPropertyFile(MethodPropertiesConstant.RETRYFAILEDTESTS).equalsIgnoreCase("yes"))
                value =count<retries;
            count++;
        }catch(Exception e){
            e.printStackTrace();
        }

       return value;
    }

}
