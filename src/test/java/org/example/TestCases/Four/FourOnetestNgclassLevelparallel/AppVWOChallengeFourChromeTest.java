package org.example.TestCases.Four.FourOnetestNgclassLevelparallel;

import com.basetest.Four.BaseTestChromeFour;
import com.bast_test_control.four.BaseTestControlChromeFour;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;
import propertesfilesread.LoginCredentialsPropertyFileRead;
import threadlocal.ThreadLocalWebDriver;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class AppVWOChallengeFourChromeTest  extends BaseTestControlChromeFour {


    //jvm call this constructory when the object is made
    AppVWOChallengeFourChromeTest() {
        super();
        //here the parent class object is made by superkeyword bz
    }


/*
    WebDriver driver;

    @BeforeSuite
    public void navigateToTheURL() {


            System.setProperty("webdriver.chrome.driver","J:\\3. automation testing\\day39---Selenium full ui elements testing\\Assignment1 Answers\\chromedriver-win64\\chromedriver.exe");

            driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            driver.get("https://app.vwo.com/#/login");
            // String title=driver.getTitle();
            // Assert.assertEquals(title,"CURA Healthcare Service");





    }
*/


    @Test(priority = 0)
    public void loginCrdentialsInValid1() throws Exception {

        this.setUpControlChrome();
        //FileReader reader=new FileReader("src/test/resources/configproperties/LoginCredentitals.properties");//it is the location of the properites
        //  Properties p=new Properties();//it is the inbuilt java class
        // p.load(reader);//property file isto read the property file

        //System.out.println(p.getProperty("emailAddress"));
        //  System.out.println(p.getProperty("password1"));
        System.out.println(LoginCredentialsPropertyFileRead.readPropertyFile("emailAddress"));
        System.out.println(LoginCredentialsPropertyFileRead.readPropertyFile("password1"));

       ThreadLocalWebDriver.getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));


        WebElement emailAddress = ThreadLocalWebDriver.getDriver().findElement(By.xpath("//input[@id='login-username']"));
        emailAddress.sendKeys(LoginCredentialsPropertyFileRead.readPropertyFile("emailAddress"));
        // emailAddress.sendKeys(p.getProperty("emailAddress"));
        // emailAddress.sendKeys("akash@wuuvo.com");
        WebElement password = ThreadLocalWebDriver.getDriver().findElement(By.xpath("//input[@id='login-password']"));
        //  password.sendKeys(p.getProperty("password1"));
        password.sendKeys(LoginCredentialsPropertyFileRead.readPropertyFile("password1"));
        //password.sendKeys("Test@1234");
        WebElement signInButton = ThreadLocalWebDriver.getDriver().findElement(By.xpath("//button[@id='js-login-btn']"));
        signInButton.click();
        WebDriverWait wait = new WebDriverWait(ThreadLocalWebDriver.getDriver(), Duration.ofSeconds(100));//in this we set the driver to wait maximum 10 seconds
        // WebElement firstLine=driver.findElement(By.xpath("//span[@data-qa='lufexuloga']"));
        //span[@class='Fw(semi-bold) ng-binding']


        //System.out.println(firstLine);
        // Assert.assertEquals(firstLine.getText(),"dasda dasda","okay");
        //System.out.println(firstLine.getText());

/*          JavascriptExecutor jse=(JavascriptExecutor)driver;
        System.out.println(jse.executeScript("document.querySelector(\"span[class='Fw(semi-bold) ng-binding']\").textContent").toString());*/

        // WebElement text = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='Fw(semi-bold) ng-binding']")));
        WebElement text = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span[class='Fw(semi-bold) ng-binding']")));

        ((JavascriptExecutor) ThreadLocalWebDriver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", text);
        System.out.println(text.getText());
        Assert.assertEquals(text.getText(), "akash");

    }

    @AfterSuite
    void closeAllResources() {
        this.tearDownControlChrome();

    }


}