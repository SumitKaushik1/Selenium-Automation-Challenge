package com.screenshot;

import com.driver.three.BaseTestChromeThree;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ScreenshotUtilsThree {

    public static String getBase64Imgage(){
        //webdriver is the interface and its  impelemention class has also implemented the TakeScrrenshot interface
        return ((TakesScreenshot) BaseTestChromeThree.getDriverChrome()).getScreenshotAs(OutputType.BASE64);
    }

}
