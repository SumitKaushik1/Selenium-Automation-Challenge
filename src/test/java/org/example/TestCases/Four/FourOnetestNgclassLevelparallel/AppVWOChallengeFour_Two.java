package org.example.TestCases.Four.FourOnetestNgclassLevelparallel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class AppVWOChallengeFour_Two {


    WebDriver driver;
    @Parameters("browser")
    @BeforeSuite

    public void navigateToTheURL(@Optional("chrome") String browser) {


            System.setProperty("webdriver.edgee.driver", "J:\\3. automation testing\\day41--selenium -UI elements\\msedgedriver.exe");
            driver = new EdgeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            driver.get("https://app.vwo.com/#/login");
            // String title=driver.getTitle();
            // Assert.assertEquals(title,"CURA Healthcare Service");





    }

    @Test
    public void loginCrdentialsInValid1() throws InterruptedException
    {
        WebElement emailAddress= driver.findElement(By.xpath("//input[@id='login-username']"));
        emailAddress.sendKeys("akash@wuuvo.com");
        WebElement password = driver.findElement(By.xpath("//input[@id='login-password']"));
        password.sendKeys("Test@1234");
        WebElement signInButton = driver.findElement(By.xpath("//button[@id='js-login-btn']"));
        signInButton.click();
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));//in this we set the driver to wait maximum 10 seconds
        // WebElement firstLine=driver.findElement(By.xpath("//span[@data-qa='lufexuloga']"));
        //span[@class='Fw(semi-bold) ng-binding']



        //System.out.println(firstLine);
        // Assert.assertEquals(firstLine.getText(),"dasda dasda","okay");
        //System.out.println(firstLine.getText());

/*          JavascriptExecutor jse=(JavascriptExecutor)driver;
        System.out.println(jse.executeScript("document.querySelector(\"span[class='Fw(semi-bold) ng-binding']\").textContent").toString());*/

        WebElement text = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='Fw(semi-bold) ng-binding']")));

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", text);
        System.out.println(text.getText());
        Assert.assertEquals(text.getText(),"dasda dasda");

    }
}
