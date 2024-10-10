package com.basedriver.bast_test_control.one;


import com.basedriver.basetest.One.BaseTestEdgeOne;
import com.extendedreport.one.ExtendReportOne;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;

//we have the ststic driver class for edge but just for controlling we are making this class
public class BaseTestControlEdgeOne {

   // only the child class allowed to make object

    //only the child class can make the object of it by super key word
    //within the package make object of it
    protected BaseTestControlEdgeOne(){

    }

    @BeforeSuite
    public void beforesuite(){
        ExtendReportOne.initReports();
    }


    @AfterSuite
    public void aftersuite() throws IOException {
        ExtendReportOne.flushReports();
    }


    protected void  setUpControlEdge() throws Exception {
        BaseTestEdgeOne.setUpEdge();
    }

    protected void tearDownControlEdge(){
        BaseTestEdgeOne.tearDownEdge();
    }
}
