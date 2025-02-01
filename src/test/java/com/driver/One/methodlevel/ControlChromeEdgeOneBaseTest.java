package com.driver.One.methodlevel;

import org.openqa.selenium.WebDriver;

public class ControlChromeEdgeOneBaseTest {

    //compiler will say the data of objec type but you know the data[0] is of the map type for that suppress warning

    @SuppressWarnings("unchecked")


/*
    @BeforeMethod*/
   /* protected void setUpControlChromeEdge(Object[]data)throws Exception{
        Map<String,String> map=(Map<String,String>)data[0];
        ChromeEdgeOneDriver.baseTestChromeEdgeOneInitDriver(map.get("browser"));

    }

*/
    protected void setUpControlChromeEdge(String browser)throws Exception{
      /*  Map<String,String> map=(Map<String,String>)data[0];*/
        ChromeEdgeOneDriver.baseTestChromeEdgeOneInitDriver(browser);

    }

/*
    @BeforeSuite
    protected void tearDown(){
        ChromeEdgeOneDriver.quitDriver();
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


    protected void tearDownControlChromeEdge(){
        ChromeEdgeOneDriver.tearDownChromeEdge();

    }

}
