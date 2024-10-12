package com.listener.controltestandextendreport.One;

import com.extendedreport.one.ExtendLoggerOne;
import com.extendedreport.one.ExtendReportOne;
import org.testng.*;

import java.io.IOException;



// you have to add the lisetner in the testng file definitly
public class ListenerClassExtendReportOne implements ITestListener , ISuiteListener {

    @Override
    public void onStart(ISuite suite){
        ExtendReportOne.initReports();
    }

    @Override
    public void onFinish(ISuite suite){
        try {
            ExtendReportOne.flushReports();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public void onTestStart(ITestResult result){
        ExtendReportOne.createTest(result.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult){
        ExtendLoggerOne.pass(iTestResult.getMethod().getMethodName()+" is passed");

    }

    @Override
    public void onTestFailure(ITestResult result){
        ExtendLoggerOne.fail(result.getMethod().getMethodName()+"is failed");
    }


    @Override
    public void onTestSkipped(ITestResult result){
        ExtendLoggerOne.skip(result.getMethod().getMethodName()+"is skipped");

    }

}

