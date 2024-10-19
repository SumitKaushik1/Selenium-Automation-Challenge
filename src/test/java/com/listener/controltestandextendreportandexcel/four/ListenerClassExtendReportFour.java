package com.listener.controltestandextendreportandexcel.four;

import com.extendedreport.four.ExtendLoggerToAddLogInReportFour;
import com.extendedreport.four.ExtendReportToInitAndFlushReportFour;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;


// you have to add the lisetner in the testng file definitly in tag form
public class ListenerClassExtendReportFour implements ITestListener , ISuiteListener {

    @Override
    public void onStart(ISuite suite){
        try {
            ExtendReportToInitAndFlushReportFour.initReports();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void onFinish(ISuite suite){
        try {
            ExtendReportToInitAndFlushReportFour.flushReports();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public void onTestStart(ITestResult result){
        ExtendReportToInitAndFlushReportFour.createTest(result.getMethod().getMethodName());
        // donto provide the getDescription bz test case donto have decripton so if you want to give
        //either in the property of @TEst or give by excel filel  just like in teh One testcse
        //  ExtendReportToInitAndFlushReportFour.createTest(result.getMethod().getDescription());

    }

    @Override
    public void onTestSuccess(ITestResult iTestResult){
        try {
            ExtendLoggerToAddLogInReportFour.pass(iTestResult.getMethod().getMethodName()+" is passed",true);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }

    @Override
    public void onTestFailure(ITestResult result){
        try {
          //  ExtendLoggerToAddLogInReportFour.fail(result.getMethod().getMethodName()+"is failed",true);
            // Get the exception that caused the test failure
            //   Throwable throwable = result.getThrowable();

            //Convert the stack trace to a string
            //  StringWriter sw = new StringWriter();
            // PrintWriter pw = new PrintWriter(sw);
            //throwable.printStackTrace(pw);;
            //String stackTrace = sw.toString();
            // ExtendLoggerToAddLogInReportFour.fail(result.getMethod().getMethodName() + " is failed. Stack Trace:"+"\\n" + stackTrace, true);

            // throwable.getLocalizedMessage();


            // Get the exception that caused the test failure
            Throwable throwable = result.getThrowable();

            // Extract the exception type and the message
            String exceptionMessage = throwable.toString(); // This will give the type and message of the exception

            // Log the failure message and the brief exception message
            ExtendLoggerToAddLogInReportFour.fail(result.getMethod().getMethodName() + " is failed. Stack Trace: " + exceptionMessage, true);


            //  ExtendLoggerToAddLogInReportFour.fail(result.getMethod().getMethodName()+"is failed",true);
            //  ExtendLoggerToAddLogInReportFour.fail(result.getThrowable().toString());
            //  ExtendLoggerToAddLogInReportFour.fail(Arrays.toString(result.getThrowable().getStackTrace()));








            // Log the failure message and the stack trace into the Extent Report
            //   ExtendLoggerToAddLogInReportFour.fail(result.getMethod().getMethodName() + " is failed. Stack Trace:"+"\\n" + , true);


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public void onTestSkipped(ITestResult result){
        try {
            ExtendLoggerToAddLogInReportFour.skip(result.getMethod().getMethodName()+"is skipped",true);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}

