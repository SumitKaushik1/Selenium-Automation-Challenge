package com.basedriver.basetest.Five.onebrowser;

import enumconstants.ConfigPropertiesConstants;
import enumconstants.MethodPropertiesConstant;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import path.DriverAndFilesPathConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import propertesfilesread.FrameoworksConstantFileReadPropertyUtils;
import propertesfilesread.MethodPropertiesPropertyFileRead;


import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Objects;

public class BaseTestChromeFive {

    // it stsatic bz to use in the static mehod
    private static WebDriver driver;


/*    public static void setUpChrome() throws Exception {
        if (Objects.isNull(driver)) {
            System.setProperty("webdriver.chrome.driver", DriverAndFilesPathConstants.chromePath());
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
           // driver.get("https://app.vwo.com/#/test/ab/13/heatmaps/1?token=eyJhY2NvdW50X2lkIjo2NjY0MDAsImV4cGVyaW1lbnRfaWQiOjEzLCJjcmVhdGVkX29uIjoxNjcxMjA1MDUwLCJ0eXBlIjoiY2FtcGFpZ24iLCJ2ZXJzaW9uIjoxLCJoYXNoIjoiY2IwNzBiYTc5MDM1MDI2N2QxNTM5MTBhZDE1MGU1YTUiLCJzY29wZSI6IiIsImZybiI6ZmFsc2V9&isHttpsOnly=1");

            //FramworkconstantFileRead class static  method is called when the value is required from its file to get we pass the key
            driver.get(FrameoworksConstantFileReadPropertyUtils.get(ConfigPropertiesConstants.URLFIVE));

        }


    }*/



    public static void setUpChrome() throws Exception {
        // String runMode="remote";
        String runMode = MethodPropertiesPropertyFileRead.readPropertyFile(MethodPropertiesConstant.RUNMODE);

        if (runMode.equalsIgnoreCase("remote")) {
            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setBrowserName("chrome");

            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);

            // Merge ChromeOptions with DesiredCapabilities
            cap.merge(chromeOptions);

            try {
                //it is for the  docker
                driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), cap);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        } else {

            //   System.setProperty("webdriver.chrome.driver", DriverAndFilesPathConstants.chromePath());
            //   System.setProperty("webdriver.chrome.driver","J:\\3. automation testing\\day41--selenium -UI elements\\AssignmentAnswers\\Appolo-Tools\\src\\test\\resources\\driver\\chromedriver.exe");
            //   System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\drivers\\chromedriver.exe");
            //   DesiredCapabilities cap= new DesiredCapabilities();
            // cap.setBrowserName("chrome");

            System.setProperty("webdriver.chrome.driver", DriverAndFilesPathConstants.chromePath());
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));



            // driver.get("https://app.vwo.com/#/test/ab/13/heatmaps/1?token=eyJhY2NvdW50X2lkIjo2NjY0MDAsImV4cGVyaW1lbnRfaWQiOjEzLCJjcmVhdGVkX29uIjoxNjcxMjA1MDUwLCJ0eXBlIjoiY2FtcGFpZ24iLCJ2ZXJzaW9uIjoxLCJoYXNoIjoiY2IwNzBiYTc5MDM1MDI2N2QxNTM5MTBhZDE1MGU1YTUiLCJzY29wZSI6IiIsImZybiI6ZmFsc2V9&isHttpsOnly=1");

            //FramworkconstantFileRead class static  method is called when the value is required from its file to get we pass the key
          //  driver.get(FrameoworksConstantFileReadPropertyUtils.get(ConfigPropertiesConstants.URLFIVE));


        }

        driver.get(FrameoworksConstantFileReadPropertyUtils.get(ConfigPropertiesConstants.URLFIVE));


    }




    public static void tearDown() {
        if (Objects.nonNull(driver))
            driver.quit();


    }

    // it used to get driver where there is not inheritance of this class directlly call this

    public static WebDriver getDriver() {
        return driver;
    }

}