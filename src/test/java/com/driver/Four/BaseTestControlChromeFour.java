package com.driver.Four;

import org.openqa.selenium.WebDriver;

public class BaseTestControlChromeFour {


    //only the child class can make the object of it by super key word
    //within the package make object of it
    protected BaseTestControlChromeFour(){

    }

    //withing packeag adn its chile class acn use this
    protected void setUpControlChrome() throws Exception {
        BaseTestChromeFour.setUpChrome();
    }

   // @BeforeSuite
    //public void beforesuite(){
      //  FourExtentReport.initReports();
   // }

    //@AfterSuite
    //public void aftersuite() throws IOException {
      //  FourExtentReport.flushReports();
    //}



    // this method is used by child class ie inheried one

    public  WebDriver controlGetDriver(){
        return  BaseTestChromeFour.getDriver();
    }

    //used only in the child class only
    protected void tearDownControlChrome(){
        BaseTestChromeFour.tearDown();
    }
}
