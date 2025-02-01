package com.driver.three;

import org.openqa.selenium.WebDriver;

public class BaseTestControlChromeThree {


    //its object only child can make

    //only the child class can make the object of it by super key word
    //within the package make object of it
    protected BaseTestControlChromeThree(){

    }


  //  @BeforeSuite
    //public void beforesuite(){
      //  ExtendReportToInitAndFlushReportThree.initReports();
    //}

    //@AfterSuite
    //public void aftersuite() throws IOException {
      //  ExtendReportToInitAndFlushReportThree.flushReports();
    //}

    protected void  setUpControlChrome() throws Exception {
        BaseTestChromeThree.setUpChrome();

    }
    protected void tearDownControlChrome(){
        BaseTestChromeThree.tearDownChrome();
    }



    // this method is used by child class ie inheried one
    public  WebDriver controlGetDriver(){
       return  BaseTestChromeThree.getDriverChrome();

    }


}
