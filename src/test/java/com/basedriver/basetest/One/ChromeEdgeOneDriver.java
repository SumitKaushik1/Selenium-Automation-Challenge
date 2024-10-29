package com.basedriver.basetest.One;

import enumconstants.ConfigProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import path.DriverAndFilesPathConstants;
import propertesfilesread.FrameoworksConstantFileReadPropertyUtils;
import threadlocal.ThreadLocalWebDriverManager;

import java.util.Objects;

public class ChromeEdgeOneDriver {

    private ChromeEdgeOneDriver(){}


    public static void baseTestChromeEdgeOneInitDriver(String browser) throws Exception {
    if(Objects.isNull(ThreadLocalWebDriverManager.getDriver())){
        if(browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver", DriverAndFilesPathConstants.chromePath());
            ThreadLocalWebDriverManager.setDriver(new ChromeDriver());
        }else if(browser.equalsIgnoreCase("edge")){
            System.setProperty("webdriver.edge.driver", DriverAndFilesPathConstants.edgePath());
            ThreadLocalWebDriverManager.setDriver(new EdgeDriver());
        }
        ThreadLocalWebDriverManager.getDriver().get(FrameoworksConstantFileReadPropertyUtils.get(ConfigProperties.URLONE));

    }
    }


    // it used to get driver where there is not inheritance of this class directlly call this
    public static WebDriver getDriver() {
        return  ThreadLocalWebDriverManager.getDriver();
    }

    public static void quitDriver(){
        if(Objects.nonNull(ThreadLocalWebDriverManager.getDriver())){
            ThreadLocalWebDriverManager.getDriver().quit();
            ThreadLocalWebDriverManager.unload();
        }
    }


}
