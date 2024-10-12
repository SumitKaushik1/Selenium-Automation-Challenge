package com.basedriver.bast_test_control.one;

import com.basedriver.basetest.Four.BaseTestChromeFour;
import com.basedriver.basetest.One.BaseTestChromeOne;
import com.extendedreport.one.ExtendReportOne;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;

public class BaseTestControlChromeOne {

    //only the child class can make object of it

    //only the child class can make the object of it by super key word
    //within the package make object of it
    protected  BaseTestControlChromeOne(){


    }
    //we have the driver class which i donot want to extend or touch but controlling of ddriver
    // we make this class

    //@BeforeSuite
    //public void beforesuite(){
        //ExtendReportOne.initReports();
    //}


  //  @AfterSuite
    //public void aftersuite() throws IOException {
      //  ExtendReportOne.flushReports();
    //}


    public WebDriver controlGetDriver(){
        return  BaseTestChromeOne.getDriver();
    }

    protected void setUpControlChrome() throws Exception {
        BaseTestChromeOne.setUpChrome();
    }

    protected void tearDownControlChrome(){
        BaseTestChromeOne.tearDownChrome();

    }



}
