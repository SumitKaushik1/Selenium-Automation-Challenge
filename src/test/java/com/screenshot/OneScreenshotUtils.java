package com.screenshot;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import threadlocal.ThreadLocalWebDriverManager;

public class OneScreenshotUtils {


   /* public static void main (String args[]) throws Exception {
        ChromeOneDriver.setUpChrome();
        System.out.println(getBase64Imgage());
    }*/

    public static String getBase64Imgage(){
        //webdriver is the interface and its  impelemention class has also implemented the TakeScrrenshot interface
        return ((TakesScreenshot) ThreadLocalWebDriverManager.getDriver()).getScreenshotAs(OutputType.BASE64);





    }

}
