package com.basedriver.bast_test_control.two;

import com.basedriver.basetest.two.BaseTestChromeTwo;
import com.extendedreport.two.ExtendReportTwo;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;

public class BaseTestControlChromeTwo {

    //only its child class can make its object

    //only the child class can make the object of it by super key word
    //within the package make object of it



    protected BaseTestControlChromeTwo(){

    }


    //@BeforeSuite
    //public void beforesuite(){
      //  ExtendReportTwo.initReports();
    //}


    //@AfterSuite
    //public void aftersuite() throws IOException {
      //  ExtendReportTwo.flushReports();
    //}

   protected  void setUpControlChrome() throws Exception {
        BaseTestChromeTwo.setUpChrome();
    }


    protected void tearDownControlChrome(){
        BaseTestChromeTwo.tearDownChrome();
    }


   public WebDriver controlGetDriver(){
        return BaseTestChromeTwo.getDriverChrome();
    }
}
