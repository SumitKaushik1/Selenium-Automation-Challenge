package com.screenshot;

import com.basedriver.basetest.One.BaseTestChromeOne;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import threadlocal.ThreadLocalWebDriver;

public class ScreenshotUtilsOne {


   /* public static void main (String args[]) throws Exception {
        BaseTestChromeOne.setUpChrome();
        System.out.println(getBase64Imgage());
    }*/

    public static String getBase64Imgage(){
        //webdriver is the interface and its  impelemention class has also implemented the TakeScrrenshot interface
        return ((TakesScreenshot) ThreadLocalWebDriver.getDriver()).getScreenshotAs(OutputType.BASE64);





    }

}
