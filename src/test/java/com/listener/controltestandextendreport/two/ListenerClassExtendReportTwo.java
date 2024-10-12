package com.listener.controltestandextendreport.two;

import com.extendedreport.one.ExtendLoggerOne;
import com.extendedreport.one.ExtendReportOne;
import com.extendedreport.two.ExtendLoggerTwo;
import com.extendedreport.two.ExtendReportTwo;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;


// you have to add the lisetner in the testng file definitly in tag form
public class ListenerClassExtendReportTwo implements ITestListener , ISuiteListener {

    @Override
    public void onStart(ISuite suite){
        ExtendReportTwo.initReports();
    }

    @Override
    public void onFinish(ISuite suite){
        try {
            ExtendReportTwo.flushReports();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public void onTestStart(ITestResult result){
        ExtendReportTwo.createTest(result.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult){
        ExtendLoggerTwo.pass(iTestResult.getMethod().getMethodName()+" is passed");



    }

    @Override
    public void onTestFailure(ITestResult result){
        ExtendLoggerTwo.fail(result.getMethod().getMethodName()+"is failed");
    }


    @Override
    public void onTestSkipped(ITestResult result){
        ExtendLoggerTwo.skip(result.getMethod().getMethodName()+"is skipped");

    }

}

