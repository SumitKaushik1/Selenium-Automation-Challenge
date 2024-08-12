package com.basetest.Five;

import path.DriverFilesPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import propertesfilesread.FrameoworksConstantPropertyFileRead;


import java.time.Duration;
import java.util.Objects;

public class BaseTestChromeFive {

    // it stsatic bz to use in the static mehod
    private static WebDriver driver;


    public static void setUpChrome() throws Exception {
        if (Objects.isNull(driver)) {
            System.setProperty("webdriver.chrome.driver", DriverFilesPath.chromePath());
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
           // driver.get("https://app.vwo.com/#/test/ab/13/heatmaps/1?token=eyJhY2NvdW50X2lkIjo2NjY0MDAsImV4cGVyaW1lbnRfaWQiOjEzLCJjcmVhdGVkX29uIjoxNjcxMjA1MDUwLCJ0eXBlIjoiY2FtcGFpZ24iLCJ2ZXJzaW9uIjoxLCJoYXNoIjoiY2IwNzBiYTc5MDM1MDI2N2QxNTM5MTBhZDE1MGU1YTUiLCJzY29wZSI6IiIsImZybiI6ZmFsc2V9&isHttpsOnly=1");

            //FramworkconstantFileRead class static  method is called when the value is required from its file to get we pass the key
            driver.get(FrameoworksConstantPropertyFileRead.readPropertyFile("urlFive"));

        }


    }


    public static void tearDown() {
        if (Objects.nonNull(driver))
            driver.quit();


    }

    public static WebDriver getDriver() {
        return driver;
    }

}