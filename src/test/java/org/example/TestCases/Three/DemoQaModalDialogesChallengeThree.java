package org.example.TestCases.Three;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.time.Duration;

public class DemoQaModalDialogesChallengeThree {

    WebDriver driver;


    @BeforeSuite
    void navigateToURL(){
        System.setProperty("webdriver.chrome.driver","J:\\3. automation testing\\day39---Selenium full ui elements testing\\Assignment1 Answers\\chromedriver-win64\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://demoqa.com/modal-dialogs");



    }


    @Test
    void clickOnLargeModalAndVerifyContent(){
/*

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='showLargeModal']")));
         driver.findElement(By.xpath("//button[@id='showLargeModal']")).click();
        WebElement webElement=driver.findElement(By.xpath("//p[contains(text(),'Lorem Ipsum is simply dummy text of the printing a')]"));
*/


        WebElement largeModelButton = driver.findElement(By.xpath("//button[@id='showLargeModal']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", largeModelButton );
        largeModelButton.click();


        WebElement largeModelButtonText=driver.findElement(By.xpath("//p[contains(text(),'Lorem Ipsum is simply dummy text of the printing a')]"));
        String text=largeModelButtonText.getText();
        Assert.assertEquals("okay","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.",text);


    }

}
