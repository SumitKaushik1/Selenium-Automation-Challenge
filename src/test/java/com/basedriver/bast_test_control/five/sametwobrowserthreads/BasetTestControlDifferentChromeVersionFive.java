package com.basedriver.bast_test_control.five.sametwobrowserthreads;



import com.basedriver.basetest.Five.sametwobrowserthreads.BaseTestDifferentChromeVesrionFive;
import org.openqa.selenium.WebDriver;

public class BasetTestControlDifferentChromeVersionFive {
    // only can be use its object only can bm made in the child class and the in package
    protected BasetTestControlDifferentChromeVersionFive(){

    }
  //  @BeforeSuite
    //public void beforesuite(){
      //  ExtendReportToInitAndFlushReportFive.initReports();
    //}

    //@AfterSuite
    //public void aftersuite() throws IOException {
      //  ExtendReportToInitAndFlushReportFive.flushReports();
    //}
    protected void setUpControlChrome(String version) throws Exception {
        BaseTestDifferentChromeVesrionFive.setUpChrome(version);
    }

    protected void tearDownControlChrome(){
        BaseTestDifferentChromeVesrionFive.tearDown();
    }



    // this method is used by child class ie inheried one
    public  WebDriver controlGetDriver(){
        return  BaseTestDifferentChromeVesrionFive.getDriver();
    }
}
