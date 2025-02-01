package com.driver.One.classlevel;

import org.openqa.selenium.WebDriver;

public class ControlChromeOneBaseTest {

    //only the child class can make object of it

    //only the child class can make the object of it by super key word
    //within the package make object of it
    protected ControlChromeOneBaseTest(){


    }
    //we have the driver class which i donot want to extend or touch but controlling of ddriver
    // we make this class

    //@BeforeSuite
    //public void beforesuite(){
        //OneExtentReport.initReports();
    //}


  //  @AfterSuite
    //public void aftersuite() throws IOException {
      //  OneExtentReport.flushReports();
    //}


    // this method is used by child class ie inheried one
    public WebDriver controlGetDriver(){
        return  ChromeOneDriver.getDriver();
    }

    protected void setUpControlChrome() throws Exception {
        ChromeOneDriver.setUpChrome();
    }

    protected void tearDownControlChrome(){
        ChromeOneDriver.tearDownChrome();

    }



}
