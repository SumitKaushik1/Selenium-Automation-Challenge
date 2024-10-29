package com.basedriver.bast_test_control.one;

import com.basedriver.basetest.One.BaseTestChromeOne;
import com.basedriver.basetest.One.ChromeEdgeOneDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import java.util.Map;

public class ChromeEdgeOneBaseTest {

    //compiler will say the data of objec type but you know the data[0] is of the map type for that suppress warning

    @SuppressWarnings("unchecked")



    @BeforeMethod
    protected void setUp(Object[]data)throws Exception{
        Map<String,String> map=(Map<String,String>)data[0];
        ChromeEdgeOneDriver.baseTestChromeEdgeOneInitDriver(map.get("browser"));

    }

    @BeforeSuite
    protected void tearDown(){
        ChromeEdgeOneDriver.quitDriver();
    }



    // this method is used by child class ie inheried one
    public WebDriver controlGetDriver(){
        return ChromeEdgeOneDriver.getDriver();
    }
}
