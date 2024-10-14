package com.basedriver.bast_test_control.one;

import com.basedriver.basetest.One.BaseTestChromeOne;
import org.openqa.selenium.WebDriver;

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
        //ExtendReporToInitAndFlushReporttOne.initReports();
    //}


  //  @AfterSuite
    //public void aftersuite() throws IOException {
      //  ExtendReporToInitAndFlushReporttOne.flushReports();
    //}


    // this method is used by child class ie inheried one
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
