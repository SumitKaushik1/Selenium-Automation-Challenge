package com.listener.controltestandextendreportandexcel.One;

import com.extendedreport.one.OneExtentLogger;
import com.extendedreport.one.ExtendReporToInitAndFlushReporttOne;
import org.testng.*;


// you have to add the lisetner in the testng file definitly
public class ListenerClassExtendReportOne implements ITestListener , ISuiteListener {

    @Override
    public void onStart(ISuite suite){
        try {
            ExtendReporToInitAndFlushReporttOne.initReports();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void onFinish(ISuite suite){
        try {
            ExtendReporToInitAndFlushReporttOne.flushReports();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }




    @Override
    public void onTestStart(ITestResult result){

     //  ExtendReporToInitAndFlushReporttOne.createTest(result.getMethod().getMethodName());
        ExtendReporToInitAndFlushReporttOne.createTest(result.getMethod().getDescription());
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult){
        try {
            OneExtentLogger.pass(iTestResult.getMethod().getMethodName()+" is passed",true);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void onTestFailure(ITestResult result){
        try {
// Get the exception that caused the test failure
         //   Throwable throwable = result.getThrowable();

            //Convert the stack trace to a string
         //  StringWriter sw = new StringWriter();
           // PrintWriter pw = new PrintWriter(sw);
            //throwable.printStackTrace(pw);;
            //String stackTrace = sw.toString();
            //OneExtentLogger.fail(result.getMethod().getMethodName() + " is failed. Stack Trace:"+"\\n" + stackTrace, true);

           // throwable.getLocalizedMessage();


            // Get the exception that caused the test failure
            Throwable throwable = result.getThrowable();

            // Extract the exception type and the message
            String exceptionMessage = throwable.toString(); // This will give the type and message of the exception

            // Log the failure message and the brief exception message
            OneExtentLogger.fail(result.getMethod().getMethodName() + " is failed. Stack Trace: " + exceptionMessage, true);


           // OneExtentLogger.fail(result.getMethod().getMethodName()+"is failed",true);
           // OneExtentLogger.fail(result.getThrowable().toString());
           // OneExtentLogger.fail(Arrays.toString(result.getThrowable().getStackTrace()));








            // Log the failure message and the stack trace into the Extent Report
         //   OneExtentLogger.fail(result.getMethod().getMethodName() + " is failed. Stack Trace:"+"\\n" + , true);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public void onTestSkipped(ITestResult result){
        try {
            OneExtentLogger.skip(result.getMethod().getMethodName()+"is skipped",true);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}
