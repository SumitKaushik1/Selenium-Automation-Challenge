package com.basedriver.bast_test_control.two;

import com.basedriver.basetest.two.BaseTestChromeTwo;
import org.openqa.selenium.WebDriver;

public class BaseTestControlChromeTwo {

    //only its child class can make its object

    //only the child class can make the object of it by super key word
    //within the package make object of it



    protected BaseTestControlChromeTwo(){

    }


    //@BeforeSuite
    //public void beforesuite(){
      //  TwoExtentReport.initReports();
    //}


    //@AfterSuite
    //public void aftersuite() throws IOException {
      //  TwoExtentReport.flushReports();
    //}

   protected  void setUpControlChrome() throws Exception {
        BaseTestChromeTwo.setUpChrome();
    }


    protected void tearDownControlChrome(){
        BaseTestChromeTwo.tearDownChrome();
    }



    // this method is used by child class ie inheried one
   public  WebDriver controlGetDriver(){
        return BaseTestChromeTwo.getDriverChrome();
    }
}
