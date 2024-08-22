package org.example.TestCases.Five;

import com.basetest.Five.BaseTestChromeFive;
import com.bast_test_control.five.BasetTestControlChromeFive;
import dev.failsafe.internal.util.Durations;
import org.assertj.core.api.Assertions;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;


// class is final so it cannot be extended ie inherited again so that its methods cannot be overriden
public final class AppVWOChallengeFiveTest extends BasetTestControlChromeFive {




    //constructor is private bz this class object is not possible in other class,jvm can make the object inheritly
    //but not allowed to the class to make object
    //whne jvm make the object then it used this default construcitor
   private AppVWOChallengeFiveTest(){
        super();//it will parent class object
    }
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
    public void mouseHoverButton() throws Exception {
        this.setUpControlChrome();


        // String parentHandle=this.controlGetDriver().getWindowHandle();
        //System.out.println(parentHandle);


        WebDriverWait wait = new WebDriverWait(this.controlGetDriver(), Duration.ofSeconds(1000));
        wait.until(ExpectedConditions.jsReturnsValue("return document.readyState === 'complete';"));  // wait till the page is fully loaded


        // Identify the element that triggers visibility
        /*1.*/
        WebElement triggerElement = this.controlGetDriver().findElement(By.xpath("//li[2]//div[2]//div[1]//div[3]"));
        //you can use this  trigger element if upper one doesnot work
        // Identify the element that triggers visibility
        /*2.*/ // WebElement triggerElement =this.controlGetDriver().findElement(By.xpath("//li[1]//div[2]//div[1]//div[3]"));


        // Move mouse to the trigger element to make the hidden element visible
        Actions actions = new Actions(this.controlGetDriver());
        actions.moveToElement(triggerElement).perform();


        // Once the button is visible, identify the button element and click on it
        /*1.*/
        WebElement buttonElement = this.controlGetDriver().findElement(By.xpath("//li[2]//div[2]//div[1]//div[3]"));
        //you can use this button of other trigger element if upper one button donot work
        /*2.*/  //WebElement buttonElement = this.controlGetDriver().findElement(By.xpath("//li[1]//div[2]//div[1]//div[3]"));

        buttonElement.click();

        //  this.controlGetDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        // Wait for the number of windows to be equal to the expected number

        //it is global wait
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));  // Adjust the number based on how many tabs should be open
        // here is waiting for 2 tabs must be opened

        // Get all window handles
        Set<String> allWindows = this.controlGetDriver().getWindowHandles();


        boolean titleFound = false;
        // Wait for each tab to load completely by checking the title
        for (String window : allWindows) {


            wait.until(ExpectedConditions.jsReturnsValue("return document.readyState === 'complete';"));  //wait untill page is fully loaded

            this.controlGetDriver().switchTo().window(window);

            // Use WebDriverWait to wait until the page title is present
            new WebDriverWait(this.controlGetDriver(), Duration.ofSeconds(1000)).until(ExpectedConditions.titleIs(this.controlGetDriver().getTitle()));

            System.out.println(this.controlGetDriver().getTitle());


            String actualTitleString = this.controlGetDriver().getTitle();

            // Assert.assertEquals(this.controlGetDriver().getTitle(),"Job Ready Automation Tester Blueprint with JAVA By Pramod Dutta");
            if (actualTitleString.equals("Job Ready Automation Tester Blueprint with JAVA By Pramod Dutta")) {


                //assertion inside the if  block is not applicable
                titleFound = true;
                //note here Assertion.chaingin is not required bz here we are checking if the title of page exist there we stop and break the loop
                //we created the flag for it as true and method will bydeafult pass the when no assertion provided
                // if the tile of the page does not exist thne flag is false in that case we failt that test



                // no assertion is applied bz
                // System.out.println("inside if conditions ");
                // Assert.assertEquals(this.controlGetDriver().getTitle(),"Job Ready Automation Tester Blueprint with JAVA By Pramod Dutta");

                //System.out.println(this.controlGetDriver().getTitle());

                //MatcherAssert.assertThat("Page title is not as expected", actualTitleString, Matchers.equalTo("Job Ready Automation Tester Blueprint with JAVA By Pramod Dutta"));
                // Assert.assertEquals(actualTitleString,"Job Ready Automation Tester Blueprint with JAVA By Pramod Dutta","title of the page is visible ");

                //System.out.println("Assertion completed successfully.");
                //Assert.assertTrue(true);
                //Assert is used to abort the program at the particular line if certain condition is not fulfill
                //if that condition is satified thne code will continiue
                //note bydefault if  there is no error(no assertion you applied like Assert.<method>) in the
                // method so the it will pass bydefault

                break;
            }

            //}

            //lot tabs opened then switch to each  tab and check the page source contain this or not
            //Set<String> windowHandle=this.controlGetDriver().getWindowHandles();

      /*  for(String handle:windowHandle){
            this.controlGetDriver().switchTo().window(handle);
           // System.out.println(this.controlGetDriver().getPageSource().);
            if(this.controlGetDriver().getPageSource().contains("Job Ready Automation Tester Blueprint with JAVA By Pramod Dutta"))
                Assert.assertTrue(true);



        }*/


            // Fail the test if the title was not found
            if (!titleFound) {
                Assert.fail("Title of the page was not found.");
                //note here Assertion.chaingin is not required bz here we are checking if the title of page exist there we stop and break the loop
                //we created the flag for it as true and method will bydeafult pass the when no assertion provided
                // if the tile of the page does not exist thne flag is false in that case we failt that test


                //Assert is used to abort the program at the particular line if certain condition is not fulfill
                //if that condition is satified thne code will continiue
                //note bydefault if  there is no error(no assertion you applied like Assert.<method>) in the
                // method so the it will pass bydefault

            }

        }

    }

    @AfterSuite
    void closeAllResources() {
        this.tearDownControlChrome();

    }



}
