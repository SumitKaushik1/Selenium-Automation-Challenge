package com.listener.controltestandextendreport.four;

import com.extendedreport.five.ExtendReportFive;
import com.extendedreport.four.ExtendLoggerFour;
import com.extendedreport.four.ExtendReportFour;
import com.extendedreport.one.ExtendReportOne;
import com.extendedreport.three.ExtendLoggerThree;
import com.extendedreport.three.ExtendReportThree;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;


// you have to add the lisetner in the testng file definitly in tag form
public class ListenerClassExtendReportFour implements ITestListener , ISuiteListener {

    @Override
    public void onStart(ISuite suite){
        ExtendReportFour.initReports();
    }

    @Override
    public void onFinish(ISuite suite){
        try {
            ExtendReportFour.flushReports();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public void onTestStart(ITestResult result){
        ExtendReportFour.createTest(result.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult){
        ExtendLoggerFour.pass(iTestResult.getMethod().getMethodName()+" is passed");



    }

    @Override
    public void onTestFailure(ITestResult result){
        ExtendLoggerFour.fail(result.getMethod().getMethodName()+"is failed");
    }


    @Override
    public void onTestSkipped(ITestResult result){
        ExtendLoggerFour.skip(result.getMethod().getMethodName()+"is skipped");

    }

}

