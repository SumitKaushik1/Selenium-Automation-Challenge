package com.listener.controltestandextendreport.five;

import com.extendedreport.five.ExtendLoggerFive;
import com.extendedreport.five.ExtendReportFive;
import com.extendedreport.four.ExtendLoggerFour;
import com.extendedreport.four.ExtendReportFour;
import com.extendedreport.one.ExtendReportOne;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;


// you have to add the lisetner in the testng file definitly in tag form
public class ListenerClassExtendReportFive implements ITestListener , ISuiteListener {

    @Override
    public void onStart(ISuite suite){
        ExtendReportFive.initReports();
    }

    @Override
    public void onFinish(ISuite suite){
        try {
            ExtendReportFive.flushReports();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public void onTestStart(ITestResult result){
        ExtendReportFive.createTest(result.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult){
        ExtendLoggerFive.pass(iTestResult.getMethod().getMethodName()+" is passed");



    }

    @Override
    public void onTestFailure(ITestResult result){
        ExtendLoggerFive.fail(result.getMethod().getMethodName()+"is failed");
    }


    @Override
    public void onTestSkipped(ITestResult result){
        ExtendLoggerFive.skip(result.getMethod().getMethodName()+"is skipped");

    }

}

