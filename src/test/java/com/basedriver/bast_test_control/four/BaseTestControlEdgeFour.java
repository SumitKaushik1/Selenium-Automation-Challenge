package com.basedriver.bast_test_control.four;

import com.basedriver.basetest.Four.BaseTestEdgeFour;
import com.extendedreport.four.FourExtentReport;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTestControlEdgeFour {


    //only the child can make the object of the parent
    //in package allowed
    protected BaseTestControlEdgeFour(){

    }


    @BeforeSuite
    public void beforesuite() throws Exception {
        FourExtentReport.initReports();
    }

    @AfterSuite
    public void aftersuite() throws Exception {
        FourExtentReport.flushReports();
    }
    protected void setUpControlEdge() throws Exception {
        BaseTestEdgeFour.setUpEdge();
    }




    // this method is used by child class ie inheried one
    public  WebDriver controlGetDriver(){
        return  BaseTestEdgeFour.getDriver();


    }


    protected void tearDownControlEdge(){
        BaseTestEdgeFour.tearDown();
    }

}
