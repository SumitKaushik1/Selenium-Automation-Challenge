package org.example.TestCases.Two;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.assertj.core.api.Assertions.assertThat;

public class DemoQAWebsiteChallengeTwo {

    WebDriver driver;

    @BeforeSuite
    public void navigateToTheURL(){
        System.setProperty("webdriver.chrome.driver","J:\\3. automation testing\\day39---Selenium full ui elements testing\\Assignment1 Answers\\chromedriver-win64\\chromedriver.exe");


        ChromeOptions options =new ChromeOptions();////it helps to make the page strategy to be normal compare to simple  chrome instance

        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver=new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://demoqa.com/webtables");
        // String title=driver.getTitle();
        // Assert.assertEquals(title,"CURA Healthcare Service");


    }



    @Test
    void clickThirdEditButton() throws InterruptedException {

       /* WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='ReactTable -striped -highlight']//div[3]//div[1]//div[7]//div[1]//span[1]//*[name()='svg']//*[name()='path' and contains(@d,'M880 836H1')]")));
        element.click();*/


        WebElement editButton = driver.findElement(By.xpath("//div[@class='ReactTable -striped -highlight']//div[3]//div[1]//div[7]//div[1]//span[1]//*[name()='svg']//*[name()='path' and contains(@d,'M880 836H1')]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", editButton );
        editButton.click();

        WebElement element1=driver.findElement(By.xpath("//button[@id='submit']"));
        element1.click();


/*
        WebElement element = driver.findElement(By.xpath("//div[@class='ReactTable -striped -highlight']//div[3]//div[1]//div[7]//div[1]//span[1]//*[name()='svg']//*[name()='path' and contains(@d,'M880 836H1')]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().perform();
*/




    }





    @Test
    void addDetails(){

       /* ChromeOptions options =new ChromeOptions();////it helps to make the page strategy to be normal compare to simple  chrome instance

        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);*/
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //xpath changes so you have ot paste again and again using the seelctorhub pro
        WebElement addDetailsButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='addNewRecordButton']")));


        addDetailsButton.click();

    /*    WebElement element = driver.findElement(By.xpath("//button[@id='addNewRecordButton']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().perform();*/


        WebElement firstName=driver.findElement(By.xpath("//input[@id='firstName']"));
        firstName.sendKeys("sumit");
        WebElement lastName=driver.findElement(By.xpath("//input[@id='lastName']"));
        lastName.sendKeys("kaushik");
        WebElement email=driver.findElement(By.xpath("//input[@id='userEmail']"));
        email.sendKeys("pritam@gmail.com");
        WebElement age=driver.findElement(By.xpath("//input[@id='age']"));
        age.sendKeys("24");
        WebElement salary=driver.findElement(By.xpath("//input[@id='salary']"));
        salary.sendKeys("24000");
        WebElement department=driver.findElement(By.xpath("//input[@id='department']"));
        department.sendKeys("scient");

        WebElement submitButton=driver.findElement(By.xpath(" //button[@id='submit']"));
        submitButton.click();



        WebElement firstNameCheck =driver.findElement(By.xpath("//div[normalize-space()='sumit']"));

        Assert.assertEquals(firstNameCheck.getText(),"sumit");

    }


}
