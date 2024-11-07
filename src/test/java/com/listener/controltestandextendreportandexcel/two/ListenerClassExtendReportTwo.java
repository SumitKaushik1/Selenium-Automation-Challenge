package com.listener.controltestandextendreportandexcel.two;

import com.cutomannotation.one.OneFrameworkAnnotation;
import com.cutomannotation.two.TwoFrameworkAnnotation;
import com.extendedreport.one.OneExtentReport;
import com.extendedreport.two.TwoExtentLogger;
import com.extendedreport.two.TwoExtentReport;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;


// you have to add the lisetner in the testng file definitly in tag form
public class ListenerClassExtendReportTwo implements ITestListener , ISuiteListener {

    @Override
    public void onStart(ISuite suite){
        try {
            TwoExtentReport.initReports();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void onFinish(ISuite suite){
        try {
            TwoExtentReport.flushReports();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public void onTestStart(ITestResult result){
        TwoExtentReport.createTest(result.getMethod().getMethodName());
        // donto provide the getDescription bz test case donto have decripton so if you want to give
        //either in the property of @TEst or give by excel filel  just like in teh One testcse
        //TwoExtentReport.createTest(result.getMethod().getDescription());


        //note reflection can only use the annotiaon to changees the varibles at teh run time
        TwoExtentReport.addAuthors( result.getMethod().getConstructorOrMethod().getMethod().getAnnotation(TwoFrameworkAnnotation.class).author());
        TwoExtentReport.addCategories(result.getMethod().getConstructorOrMethod().getMethod().getAnnotation(TwoFrameworkAnnotation.class).category());

    }

    @Override
    public void onTestSuccess(ITestResult iTestResult){
        try {
            TwoExtentLogger.pass(iTestResult.getMethod().getMethodName()+" is passed",true);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }

    @Override
    public void onTestFailure(ITestResult result){
        try {
       //     TwoExtentLogger.fail(result.getMethod().getMethodName()+"is failed",true);
            // Get the exception that caused the test failure
            //   Throwable throwable = result.getThrowable();

            //Convert the stack trace to a string
            //  StringWriter sw = new StringWriter();
            // PrintWriter pw = new PrintWriter(sw);
            //throwable.printStackTrace(pw);;
            //String stackTrace = sw.toString();
            // TwoExtentLogger.fail(result.getMethod().getMethodName() + " is failed. Stack Trace:"+"\\n" + stackTrace, true);

            // throwable.getLocalizedMessage();


            // Get the exception that caused the test failure
            Throwable throwable = result.getThrowable();

            // Extract the exception type and the message
            String exceptionMessage = throwable.toString(); // This will give the type and message of the exception

            // Log the failure message and the brief exception message
            TwoExtentLogger.fail(result.getMethod().getMethodName() + " is failed. Stack Trace: " + exceptionMessage, true);


            //  TwoExtentLogger.fail(result.getMethod().getMethodName()+"is failed",true);
            //  TwoExtentLogger.fail(result.getThrowable().toString());
            //  TwoExtentLogger.fail(Arrays.toString(result.getThrowable().getStackTrace()));








            // Log the failure message and the stack trace into the Extent Report
            //   OneExtentLogger.fail(result.getMethod().getMethodName() + " is failed. Stack Trace:"+"\\n" + , true);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public void onTestSkipped(ITestResult result){
        try {
            TwoExtentLogger.skip(result.getMethod().getMethodName()+"is skipped",true);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}

