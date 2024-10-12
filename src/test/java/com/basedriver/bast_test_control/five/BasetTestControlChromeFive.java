package com.basedriver.bast_test_control.five;

import com.basedriver.basetest.Five.BaseTestChromeFive;
import com.extendedreport.five.ExtendReportFive;
import com.extendedreport.four.ExtendReportFour;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;

public class BasetTestControlChromeFive {
    // only can be use its object only can bm made in the child class and the in package
    protected BasetTestControlChromeFive(){

    }
  //  @BeforeSuite
    //public void beforesuite(){
      //  ExtendReportFive.initReports();
    //}

    //@AfterSuite
    //public void aftersuite() throws IOException {
      //  ExtendReportFive.flushReports();
    //}
    protected void setUpControlChrome() throws Exception {
        BaseTestChromeFive.setUpChrome();
    }

    protected void tearDownControlChrome(){
        BaseTestChromeFive.tearDown();
    }

    public WebDriver controlGetDriver(){
        return  BaseTestChromeFive.getDriver();
    }
}
