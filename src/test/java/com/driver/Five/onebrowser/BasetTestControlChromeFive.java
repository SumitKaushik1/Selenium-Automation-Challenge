package com.driver.Five.onebrowser;

import org.openqa.selenium.WebDriver;

public class BasetTestControlChromeFive {
    // only can be use its object only can bm made in the child class and the in package
    protected BasetTestControlChromeFive(){

    }
  //  @BeforeSuite
    //public void beforesuite(){
      //  ExtendReportToInitAndFlushReportFive.initReports();
    //}

    //@AfterSuite
    //public void aftersuite() throws IOException {
      //  ExtendReportToInitAndFlushReportFive.flushReports();
    //}
    protected void setUpControlChrome() throws Exception {
        BaseTestChromeFive.setUpChrome();
    }

    protected void tearDownControlChrome(){
        BaseTestChromeFive.tearDown();
    }



    // this method is used by child class ie inheried one
    public  WebDriver controlGetDriver(){
        return  BaseTestChromeFive.getDriver();
    }

    public static WebDriver controlgetDriver(){
        return  BaseTestChromeFive.getDriver();
    }

}
