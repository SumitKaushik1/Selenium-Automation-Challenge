package com.listener.controltestandextendreportandexcel.five;

import com.extendedreport.five.ExtendLoggerToAddLogInReportFive;
import com.extendedreport.five.ExtendReportToInitAndFlushReportFive;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;


// you have to add the lisetner in the testng file definitly in tag form
public class ListenerClassExtendReportFive implements ITestListener , ISuiteListener {

    @Override
    public void onStart(ISuite suite){
        try {
            ExtendReportToInitAndFlushReportFive.initReports();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void onFinish(ISuite suite){
        try {
            ExtendReportToInitAndFlushReportFive.flushReports();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public void onTestStart(ITestResult result){
     //   ExtendReportToInitAndFlushReportFive.createTest(result.getMethod().getMethodName());
        ExtendReportToInitAndFlushReportFive.createTest(result.getMethod().getDescription());

    }

    @Override
    public void onTestSuccess(ITestResult iTestResult){
        try {
            ExtendLoggerToAddLogInReportFive.pass(iTestResult.getMethod().getMethodName()+" is passed",true);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }

    @Override
    public void onTestFailure(ITestResult result){
        try {
          //  ExtendLoggerToAddLogInReportFive.fail(result.getMethod().getMethodName()+"is failed",true);
            //  ExtendLoggerToAddLogInReportFive.fail(result.getMethod().getMethodName()+"is failed",true);
            // Get the exception that caused the test failure
            //   Throwable throwable = result.getThrowable();

            //Convert the stack trace to a string
            //  StringWriter sw = new StringWriter();
            // PrintWriter pw = new PrintWriter(sw);
            //throwable.printStackTrace(pw);;
            //String stackTrace = sw.toString();
            // ExtendLoggerToAddLogInReportFive.fail(result.getMethod().getMethodName() + " is failed. Stack Trace:"+"\\n" + stackTrace, true);

            // throwable.getLocalizedMessage();


            // Get the exception that caused the test failure
            Throwable throwable = result.getThrowable();

            // Extract the exception type and the message
            String exceptionMessage = throwable.toString(); // This will give the type and message of the exception

            // Log the failure message and the brief exception message
            ExtendLoggerToAddLogInReportFive.fail(result.getMethod().getMethodName() + " is failed. Stack Trace: " + exceptionMessage, true);


            //  ExtendLoggerToAddLogInReportFive.fail(result.getMethod().getMethodName()+"is failed",true);
            //  ExtendLoggerToAddLogInReportFive.fail(result.getThrowable().toString());
            //  ExtendLoggerToAddLogInReportFive.fail(Arrays.toString(result.getThrowable().getStackTrace()));








            // Log the failure message and the stack trace into the Extent Report
            //   ExtendLoggerToAddLogInReportFive.fail(result.getMethod().getMethodName() + " is failed. Stack Trace:"+"\\n" + , true);


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public void onTestSkipped(ITestResult result){
        try {
            ExtendLoggerToAddLogInReportFive.skip(result.getMethod().getMethodName()+"is skipped",true);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}

