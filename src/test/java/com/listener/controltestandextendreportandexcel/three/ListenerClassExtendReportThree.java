package com.listener.controltestandextendreportandexcel.three;

import com.extendedreport.three.ExtendLoggerToAddLogInReportThree;
import com.extendedreport.three.ExtendReportToInitAndFlushReportThree;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;


// you have to add the lisetner in the testng file definitly in tag form
public class ListenerClassExtendReportThree implements ITestListener , ISuiteListener {

    @Override
    public void onStart(ISuite suite){
        try {

            ExtendReportToInitAndFlushReportThree.initReports();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void onFinish(ISuite suite){
        try {
            ExtendReportToInitAndFlushReportThree.flushReports();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public void onTestStart(ITestResult result){

        ExtendReportToInitAndFlushReportThree.createTest(result.getMethod().getMethodName());
        // donto provide the getDescription bz test case donto have decripton so if you want to give
        //either in the property of @TEst or give by excel filel  just like in teh One testcse
       // ExtendReportToInitAndFlushReportThree.createTest(result.getMethod().getDescription());

    }

    @Override
    public void onTestSuccess(ITestResult iTestResult){
        try {
            ExtendLoggerToAddLogInReportThree.pass(iTestResult.getMethod().getMethodName()+" is passed",true);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }

    @Override
    public void onTestFailure(ITestResult result){
        try {
         //   ExtendLoggerToAddLogInReportThree.fail(result.getMethod().getMethodName()+"is failed",true);
            // Get the exception that caused the test failure
            //   Throwable throwable = result.getThrowable();

            //Convert the stack trace to a string
            //  StringWriter sw = new StringWriter();
            // PrintWriter pw = new PrintWriter(sw);
            //throwable.printStackTrace(pw);;
            //String stackTrace = sw.toString();
            // ExtendLoggerToAddLogInReportThree.fail(result.getMethod().getMethodName() + " is failed. Stack Trace:"+"\\n" + stackTrace, true);

            // throwable.getLocalizedMessage();


            // Get the exception that caused the test failure
            Throwable throwable = result.getThrowable();

            // Extract the exception type and the message
            String exceptionMessage = throwable.toString(); // This will give the type and message of the exception

            // Log the failure message and the brief exception message
            ExtendLoggerToAddLogInReportThree.fail(result.getMethod().getMethodName() + " is failed. Stack Trace: " + exceptionMessage, true);


            //  ExtendLoggerToAddLogInReportThree.fail(result.getMethod().getMethodName()+"is failed",true);
            //  ExtendLoggerToAddLogInReportThree.fail(result.getThrowable().toString());
            //  ExtendLoggerToAddLogInReportThree.fail(Arrays.toString(result.getThrowable().getStackTrace()));








            // Log the failure message and the stack trace into the Extent Report
            //   ExtendLoggerToAddLogInReportThree.fail(result.getMethod().getMethodName() + " is failed. Stack Trace:"+"\\n" + , true);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public void onTestSkipped(ITestResult result){
        try {
            ExtendLoggerToAddLogInReportThree.skip(result.getMethod().getMethodName()+"is skipped",true);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}

