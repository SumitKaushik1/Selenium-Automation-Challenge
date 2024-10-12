package com.basedriver.bast_test_control.four;

import com.basedriver.basetest.Five.BaseTestChromeFive;
import com.basedriver.basetest.Four.BaseTestChromeFour;
import com.extendedreport.four.ExtendReportFour;
import com.extendedreport.three.ExtendReportThree;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;

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
      //  ExtendReportFour.initReports();
   // }

    //@AfterSuite
    //public void aftersuite() throws IOException {
      //  ExtendReportFour.flushReports();
    //}


    public WebDriver controlGetDriver(){
        return  BaseTestChromeFour.getDriver();
    }

    //used only in the child class only
    protected void tearDownControlChrome(){
        BaseTestChromeFour.tearDown();
    }
}
