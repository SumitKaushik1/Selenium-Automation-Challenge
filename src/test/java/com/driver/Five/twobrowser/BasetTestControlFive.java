package com.driver.Five.twobrowser;


import org.openqa.selenium.WebDriver;

public class BasetTestControlFive {
    // only can be use its object only can bm made in the child class and the in package
    protected BasetTestControlFive(){

    }
  //  @BeforeSuite
    //public void beforesuite(){
      //  ExtendReportToInitAndFlushReportFive.initReports();
    //}

    //@AfterSuite
    //public void aftersuite() throws IOException {
      //  ExtendReportToInitAndFlushReportFive.flushReports();
    //}
    protected void setUpControl(String browser) throws Exception {
        BaseTestFive.setUp(browser);
    }

    protected void tearDownControl(){
        BaseTestFive.tearDown();
    }



    // this method is used by child class ie inheried one
    public  WebDriver controlGetDriver(){
        return    BaseTestFive.getDriver();
    }
}
