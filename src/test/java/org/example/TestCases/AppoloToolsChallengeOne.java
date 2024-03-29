package org.example.TestCases;

import org.example.Utils.CalculateEarnedSpent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.text.DecimalFormat;
import java.time.Duration;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * Unit test for simple App.
 */
public class AppoloToolsChallengeOne
{


    WebDriver driver;

    @BeforeSuite
    public void navigateToTheURL(){
        System.setProperty("webdriver.chrome.driver","J:\\3. automation testing\\day39---Selenium full ui elements testing\\Assignment1 Answers\\chromedriver-win64\\chromedriver.exe");

        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://demo.applitools.com/");
       // String title=driver.getTitle();
      // Assert.assertEquals(title,"CURA Healthcare Service");


    }


    @Test
    public void loginWithValidCredentials() throws InterruptedException{
        //anchor tag we use
        //WebElement makeAppointmentButton = driver.findElement(By.xpath("//a[@id='btn-make-appointment']"));
      //  makeAppointmentButton.click();
        WebElement userName=driver.findElement(By.xpath("//input[@id='username']"));
        userName.sendKeys("Admin");
        WebElement password =driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("Password@123");
        WebElement signButton=driver.findElement(By.xpath("//a[@id='log-in']"));
        signButton.click();


    }



   @Test
    public void checkUrlOfPage() throws InterruptedException{
       /* Select facilityDropdown = new Select(driver.findElement(By.xpath("//select[@id='combo_facility']")));
        facilityDropdown.selectByVisibleText("Seoul CURA Healthcare Center");

        WebElement medicalRadioButton = driver.findElement(By.xpath("//input[@value='Medicaid']"));
        medicalRadioButton.click();
        WebElement bookAppointmentButton=driver.findElement(By.xpath("//button[@id='btn-book-appointment']"));


        Date currentDate =new Date();

        WebElement visitDate=driver.findElement(By.xpath("//input[@id='txt_visit_date']"));
        visitDate.sendKeys(currentDate.toString());

        WebElement comment=driver.findElement(By.xpath("//*[@id='txt_comment']"));

        comment.sendKeys("Please be informed that your  appointment has been booked !!!!");

        bookAppointmentButton.click();
*/

       String currentUrl=driver.getCurrentUrl();
       System.out.println(currentUrl);
       assertThat(currentUrl.equals("https://demo.applitools.com/app.html"));
    }


    /*
    @Test(dependsOnMethods="makeAppointment")
    public void verifyAppointmentConfirmation(){
        WebElement goToHomePageButton =driver.findElement(By.xpath("//a[@class='btn btn-default']"));
        Assert.assertEquals(true,goToHomePageButton.isDisplayed(),"Go to HomepageButton is not present");

    }






   @AfterSuite
    public void tearDown(){
        driver.quit();
    }*/



    @Test
    void totalMoneySpentCalculation(){



/*
        String part1="//table[@class=\"table table-padded\"]/tbody/tr";
        String part2="]/td[";
        String part3="]";
        System.out.println();*/
       List<WebElement> negativeSpans = driver.findElements(By.xpath("//table[@class='table table-padded']//span[contains(@class, 'text-danger') and contains(text(), '-')]"));

        // Iterate over the negative <span> elements and print their text content
        for (WebElement amountSpent : negativeSpans) {
            CalculateEarnedSpent.amountSpent(Double.parseDouble(amountSpent.getText().replaceAll("USD", "").replaceAll("[^\\d.-]", "").trim()));

        }
/*
        This code snippet replaces all occurrences of "USD" in the originalString with an empty string, effectively removing "USD". The trim() method is used to remove any leading or trailing whitespace that might remain after removing "USD".*/
/*        originalString.replaceAll("[^\\d.-]", "").trim(); // Removes all characters except digits, minus sign, and dot*/
       // System.out.println(CalculateEarnedSpent.showSpent());

        List<WebElement> positiveSpans = driver.findElements(By.xpath("//table[@class='table table-padded']//span[contains(@class, 'text-success') and not(contains(text(), '-'))]"));
        // Iterate over the negative <span> elements and print their text content
        for (WebElement amountEarned : positiveSpans) {
            CalculateEarnedSpent.amountEarned(Double.parseDouble(amountEarned.getText().replaceAll("USD", "").replaceAll("[^\\d.-]", "").trim()));

        }

       // System.out.println(CalculateEarnedSpent.showEarned());

        DecimalFormat df = new DecimalFormat("#.##");

        Assert.assertEquals(Double.parseDouble(df.format(CalculateEarnedSpent.showEarned()+CalculateEarnedSpent.showSpent())),1996.22);
    }







}