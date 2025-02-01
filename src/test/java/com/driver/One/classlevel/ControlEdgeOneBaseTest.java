package com.driver.One.classlevel;


import org.openqa.selenium.WebDriver;

//we have the ststic driver class for edge but just for controlling we are making this class
public class ControlEdgeOneBaseTest {

   // only the child class allowed to make object

    //only the child class can make the object of it by super key word
    //within the package make object of it
    protected ControlEdgeOneBaseTest(){

    }

    //@BeforeSuite
    //public void beforesuite(){
      //  OneExtentReport.initReports();
    //}


    //@AfterSuite
    //public void aftersuite() throws IOException {
      //  OneExtentReport.flushReports();
    //}



    // this method is used by child class ie inheried one
    public  WebDriver controlGetDriver(){
        return  EdgeOneDriver.getDriver();
    }



    protected void  setUpControlEdge() throws Exception {
        EdgeOneDriver.setUpEdge();
    }

    protected void tearDownControlEdge(){
        EdgeOneDriver.tearDownEdge();
    }
}
