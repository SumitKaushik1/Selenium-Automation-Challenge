package org.example.TestCases.Five;

import com.basetest.Five.BaseTestChromeFive;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class AppVWOChallengeFiveTest extends BaseTestChromeFive {

/*

    WebDriver driver;

    @BeforeSuite

    public void navigateToTheURL() {


            System.setProperty("webdriver.chrome.driver","J:\\3. automation testing\\day39---Selenium full ui elements testing\\Assignment1 Answers\\chromedriver-win64\\chromedriver.exe");

            driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            driver.get("https://app.vwo.com/#/test/ab/13/heatmaps/1?token=eyJhY2NvdW50X2lkIjo2NjY0MDAsImV4cGVyaW1lbnRfaWQiOjEzLCJjcmVhdGVkX29uIjoxNjcxMjA1MDUwLCJ0eXBlIjoiY2FtcGFpZ24iLCJ2ZXJzaW9uIjoxLCJoYXNoIjoiY2IwNzBiYTc5MDM1MDI2N2QxNTM5MTBhZDE1MGU1YTUiLCJzY29wZSI6IiIsImZybiI6ZmFsc2V9&isHttpsOnly=1");
            // String title=driver.getTitle();
            // Assert.assertEquals(title,"CURA Healthcare Service");





    }
*/




    @Test(priority=0)
    public void mouseHoverButton() throws InterruptedException
    {

        String parentHandle=driver.getWindowHandle();
        System.out.println(parentHandle);



        // Identify the element that triggers visibility
        WebElement triggerElement = driver.findElement(By.xpath("//li[2]//div[2]//div[1]//div[3]"));

        // Move mouse to the trigger element to make the hidden element visible
        Actions actions = new Actions(driver);
        actions.moveToElement(triggerElement).perform();

        // Once the button is visible, identify the button element and click on it
        WebElement buttonElement = driver.findElement(By.xpath("//li[2]//div[2]//div[1]//div[3]"));
        buttonElement.click();

        Set<String> windowHandle=driver.getWindowHandles();
        for(String handle:windowHandle){
            driver.switchTo().window(handle);
            if(driver.getPageSource().contains("Job Ready Automation Tester Blueprint with JAVA By Pramod Dutta"))
                Assert.assertTrue(true);

        }


        Assert.assertFalse(true);

    }
}
