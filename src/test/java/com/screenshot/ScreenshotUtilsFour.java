package com.screenshot;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import threadlocal.ThreadLocalWebDriverManager;

public class ScreenshotUtilsFour {

    public static String getBase64Imgage(){


        //webdriver is the interface and its  impelemention class has also implemented the TakeScrrenshot interface
        //both
        return ((TakesScreenshot) ThreadLocalWebDriverManager.getDriver()).getScreenshotAs(OutputType.BASE64);
        //directly getdriver() from basetest package

    }

}
