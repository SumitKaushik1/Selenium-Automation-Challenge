package com.listener.controltestandextendreportandexcel.five;


import enumconstants.MethodPropertiesConstant;
import org.testng.IRetryAnalyzer;
import org.testng.ITestNGListener;
import org.testng.ITestResult;
import propertesfilesread.MethodPropertiesPropertyFileRead;

// uyou have to add the listener in the xml file
public class ListenerRetryFive implements IRetryAnalyzer, ITestNGListener {
    private int count =0;
    private int retries=1;//it will retry 1 time again if it fails method

    @Override
    public boolean  retry(ITestResult result){
        boolean value =false;
       /* try{
*/

            //control by property file

        // in the method readPropertyFile() PropertyFileUsageException is the run time exceptin so ther is not need of catch block
        // it is unchecked excepiton no need to handle that
        if(MethodPropertiesPropertyFileRead.readPropertyFile(MethodPropertiesConstant.RETRYFAILEDTESTS).equalsIgnoreCase("yes"))
                value =count<retries;
            count++;


       /* }catch(Exception e){
            e.printStackTrace();
        }*/

       return value;
    }

}
