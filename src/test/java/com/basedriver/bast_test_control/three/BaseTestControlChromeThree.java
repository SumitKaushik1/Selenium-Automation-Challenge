package com.basedriver.bast_test_control.three;

import com.basedriver.basetest.three.BaseTestChromeThree;
import com.extendedreport.three.ExtendReportThree;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;

public class BaseTestControlChromeThree {


    //its object only child can make

    //only the child class can make the object of it by super key word
    //within the package make object of it
    protected BaseTestControlChromeThree(){

    }


    @BeforeSuite
    public void beforesuite(){
        ExtendReportThree.initReports();
    }

    @AfterSuite
    public void aftersuite() throws IOException {
        ExtendReportThree.flushReports();
    }

    protected void  setUpControlChrome() throws Exception {
        BaseTestChromeThree.setUpChrome();

    }
    protected void tearDownControlChrome(){
        BaseTestChromeThree.tearDownChrome();
    }

    public WebDriver controlGetDriver(){
       return  BaseTestChromeThree.getDriverChrome();

    }


}
