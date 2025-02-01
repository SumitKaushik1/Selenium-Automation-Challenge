package com.driver.One.samemethod;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.util.Map;

//each thread has it own test then that test uses

//since before
public  class ControlChromeEdgeOneSameMethodBaseTest {


    private static WebDriver driverChrome;
    private static  WebDriver driverEdge;
    //compiler will say the data of objec type but you know the data[0] is of the map type for that suppress warning




    static{

         driverChrome=null;
         driverEdge=null;

    }


    //since before suit is used so this method comes int eh main thread
    @BeforeSuite
    protected void setUpWebDriver()throws Exception{


        driverChrome=ChromeEdgeOneDriver.baseTestChromeEdgeOneInitDriver("chrome");
         driverEdge=  ChromeEdgeOneDriver.baseTestChromeEdgeOneInitDriver("edge");



    }



    @BeforeMethod
    protected void setUpControlChromeEdge(Object[]data)throws Exception{


            Map<String,String> map=(Map<String,String>)data[0];
            if(map.get("browser").equalsIgnoreCase("chrome")){
                ChromeEdgeOneDriver.setDriver(driverChrome);
            }
            else{
                ChromeEdgeOneDriver.setDriver(driverEdge);
            }



    }


    //since before suit is used so this method comes int eh child thread
    //bz each data comes in one thread and the each method is getting sepearte data so fro each mehtdo
    //s
    @AfterMethod
    protected void tearDownControl(){
        ChromeEdgeOneDriver.tearDown();

    }


    //since before suit is used so this method comes int eh main thread
    @AfterSuite
    protected void tearDownWebdrver(){

        ChromeEdgeOneDriver.tearDownWebDriver(driverChrome);
        ChromeEdgeOneDriver.tearDownWebDriver(driverEdge);

    }



    /*protected void setUpControlChromeEdge(String browser)throws Exception{
        *//*  Map<String,String> map=(Map<String,String>)data[0];*//*
        ChromeEdgeOneDriver.baseTestChromeEdgeOneInitDriver(browser);

    }
*/








    // this method is used by child class ie inheried one
    public WebDriver controlGetDriver(){
        return ChromeEdgeOneDriver.getDriver();
    }


/*
    protected void tearDownControlChrome(){
        ChromeEdgeOneDriver.tearDownChromeEdge();

    }

    protected void tearDownControlEdge(){
        ChromeEdgeOneDriver.tearDownChromeEdge();

    }
*/


    /*protected void tearDownControlChromeEdge(){
        ChromeEdgeOneDriver.tearDownChromeEdge();

    }*/

}
