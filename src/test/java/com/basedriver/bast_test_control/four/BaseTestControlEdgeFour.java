package com.basedriver.bast_test_control.four;

import com.basedriver.basetest.Four.BaseTestChromeFour;
import com.basedriver.basetest.Four.BaseTestEdgeFour;
import com.extendedreport.four.ExtendReportFour;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;

public class BaseTestControlEdgeFour {


    //only the child can make the object of the parent
    //in package allowed
    protected BaseTestControlEdgeFour(){

    }


    @BeforeSuite
    public void beforesuite(){
        ExtendReportFour.initReports();
    }

    @AfterSuite
    public void aftersuite() throws IOException {
        ExtendReportFour.flushReports();
    }
    protected void setUpControlEdge() throws Exception {
        BaseTestEdgeFour.setUpEdge();
    }


    public WebDriver controlGetDriver(){
        return  BaseTestEdgeFour.getDriver();


    }


    protected void tearDownControlEdge(){
        BaseTestEdgeFour.tearDown();
    }

}
