package com.listener.controltestandextendreportandexcel.four;

import com.extendedreport.four.FourExtentLogger;
import com.extendedreport.four.FourExtentReport;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;


// you have to add the lisetner in the testng file definitly in tag form
public class ListenerClassExtendReportFour implements ITestListener , ISuiteListener {

    @Override
    public void onStart(ISuite suite){
        try {
            FourExtentReport.initReports();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void onFinish(ISuite suite){
        try {
            FourExtentReport.flushReports();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public void onTestStart(ITestResult result){
        FourExtentReport.createTest(result.getMethod().getMethodName());
        // donto provide the getDescription bz test case donto have decripton so if you want to give
        //either in the property of @TEst or give by excel filel  just like in teh One testcse
        //  FourExtentReport.createTest(result.getMethod().getDescription());

    }

    @Override
    public void onTestSuccess(ITestResult iTestResult){
        try {
            FourExtentLogger.pass(iTestResult.getMethod().getMethodName()+" is passed",true);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }

    @Override
    public void onTestFailure(ITestResult result){
        try {
          //  FourExtentLogger.fail(result.getMethod().getMethodName()+"is failed",true);
            // Get the exception that caused the test failure
            //   Throwable throwable = result.getThrowable();

            //Convert the stack trace to a string
            //  StringWriter sw = new StringWriter();
            // PrintWriter pw = new PrintWriter(sw);
            //throwable.printStackTrace(pw);;
            //String stackTrace = sw.toString();
            // FourExtentLogger.fail(result.getMethod().getMethodName() + " is failed. Stack Trace:"+"\\n" + stackTrace, true);

            // throwable.getLocalizedMessage();


            // Get the exception that caused the test failure
            Throwable throwable = result.getThrowable();

            // Extract the exception type and the message
            String exceptionMessage = throwable.toString(); // This will give the type and message of the exception

            // Log the failure message and the brief exception message
            FourExtentLogger.fail(result.getMethod().getMethodName() + " is failed. Stack Trace: " + exceptionMessage, true);


            //  FourExtentLogger.fail(result.getMethod().getMethodName()+"is failed",true);
            //  FourExtentLogger.fail(result.getThrowable().toString());
            //  FourExtentLogger.fail(Arrays.toString(result.getThrowable().getStackTrace()));








            // Log the failure message and the stack trace into the Extent Report
            //   FourExtentLogger.fail(result.getMethod().getMethodName() + " is failed. Stack Trace:"+"\\n" + , true);


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public void onTestSkipped(ITestResult result){
        try {
            FourExtentLogger.skip(result.getMethod().getMethodName()+"is skipped",true);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}

