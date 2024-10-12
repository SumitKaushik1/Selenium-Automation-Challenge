package com.listener.controltestandextendreport.three;

import com.extendedreport.one.ExtendReportOne;
import com.extendedreport.three.ExtendLoggerThree;
import com.extendedreport.three.ExtendReportThree;
import com.extendedreport.two.ExtendLoggerTwo;
import com.extendedreport.two.ExtendReportTwo;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;


// you have to add the lisetner in the testng file definitly in tag form
public class ListenerClassExtendReportThree implements ITestListener , ISuiteListener {

    @Override
    public void onStart(ISuite suite){
        ExtendReportThree.initReports();
    }

    @Override
    public void onFinish(ISuite suite){
        try {
            ExtendReportThree.flushReports();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public void onTestStart(ITestResult result){
        ExtendReportThree.createTest(result.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult){
        ExtendLoggerThree.pass(iTestResult.getMethod().getMethodName()+" is passed");



    }

    @Override
    public void onTestFailure(ITestResult result){
        ExtendLoggerThree.fail(result.getMethod().getMethodName()+"is failed");
    }


    @Override
    public void onTestSkipped(ITestResult result){
        ExtendLoggerThree.skip(result.getMethod().getMethodName()+"is skipped");

    }

}

