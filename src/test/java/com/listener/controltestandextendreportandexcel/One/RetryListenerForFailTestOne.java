package com.listener.controltestandextendreportandexcel.One;

import enumconstants.MethodPropertiesConstant;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import propertesfilesread.MethodPropertiesPropertyFileRead;

public class RetryListenerForFailTestOne implements IRetryAnalyzer {

// it is used in teh AnnotationTransformerListenerControlTestOne.java class in lisetener package
    int counter=0;
    int limit=2;

    @Override
    public boolean retry(ITestResult result){

/*
        if(counter<limit){
// two times it will run taht method whcih use thsi class

            // if that method does not run 2nd time hat method test will be ignored
            counter++;
            return true;
        }
        return false;
*/

        boolean value =false;
        /*try{*/



            //control by property file
            // in the method readPropertyFile() PropertyFileUsageException is the run time exceptin so ther is not need of catch block
        // it is unchecked excepiton no need to handle that
            if(MethodPropertiesPropertyFileRead.readPropertyFile(MethodPropertiesConstant.RETRYFAILEDTESTS).equalsIgnoreCase("yes"))
                value =counter<limit;
            counter++;
       /* }catch(Exception e){
            e.printStackTrace();
        }*/

        return value;


    }
}
