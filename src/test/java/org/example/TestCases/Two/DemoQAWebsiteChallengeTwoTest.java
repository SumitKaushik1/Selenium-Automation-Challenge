package org.example.TestCases.Two;

import com.basetest.two.BaseTestChromeTwo;
import com.bast_test_control.two.BaseTestControlChromeTwo;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;



public class DemoQAWebsiteChallengeTwoTest extends BaseTestControlChromeTwo {


    //jvm make the DemoQAWebsiteChallengeTwoTest  object
    DemoQAWebsiteChallengeTwoTest(){
        super();
        //i make the BaseTestControlChromeTwo  parente class object
        //then only the object can be used below methods
    }

/*
    WebDriver driver;

    @BeforeSuite
    public void navigateToTheURL(){
        System.setProperty("webdriver.chrome.driver","J:\\3. automation testing\\day41--selenium -UI elements\\AssignmentAnswers\\Appolo-Tools\\src\\test\\resources\\driver\\chromedriver.exe");


        ChromeOptions options =new ChromeOptions();////it helps to make the page strategy to be normal compare to simple  chrome instance
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        //tring to load the https://demoqa.com/webtables" fully

        driver=new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://demoqa.com/webtables");
        // String title=driver.getTitle();
        // Assert.assertEquals(title,"CURA Healthcare Service");


    }*/




    @Test(priority=0)
    void clickThirdEditButton() throws InterruptedException {

        this.setUpControlChrome();


       /* WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='ReactTable -striped -highlight']//div[3]//div[1]//div[7]//div[1]//span[1]//*[name()='svg']//*[name()='path' and contains(@d,'M880 836H1')]")));
        element.click();*/


        WebElement editButton = this.controlGetDriver().findElement(By.xpath("//div[@class='ReactTable -striped -highlight']//div[3]//div[1]//div[7]//div[1]//span[1]//*[name()='svg']//*[name()='path' and contains(@d,'M880 836H1')]"));
        ((JavascriptExecutor) this.controlGetDriver()).executeScript("arguments[0].scrollIntoView(true);", editButton );
        editButton.click();
        WebElement webElement=this.controlGetDriver().findElement(By.xpath("//div[@id='registration-form-modal']"));
        System.out.println(webElement.getText());
        Assert.assertTrue(webElement.getText().equals("Registration Form"));



/*
        WebElement element = driver.findElement(By.xpath("//div[@class='ReactTable -striped -highlight']//div[3]//div[1]//div[7]//div[1]//span[1]//*[name()='svg']//*[name()='path' and contains(@d,'M880 836H1')]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().perform();
*/




    }





    @Test(priority=1)
    void addDetails(){

        WebElement element1=this.controlGetDriver().findElement(By.xpath("//button[@id='submit']"));
        ((JavascriptExecutor) this.controlGetDriver()).executeScript("arguments[0].scrollIntoView(true);", element1);//for this srolling is not required
        element1.click();

       /* ChromeOptions options =new ChromeOptions();////it helps to make the page strategy to be normal compare to simple  chrome instance

        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);*/
        WebDriverWait wait = new WebDriverWait(this.controlGetDriver(), Duration.ofSeconds(10));
        //xpath changes so you have ot paste again and again using the seelctorhub pro
        WebElement addDetailsButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='addNewRecordButton']")));


        addDetailsButton.click();

    /*    WebElement element = driver.findElement(By.xpath("//button[@id='addNewRecordButton']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().perform();*/


        WebElement firstName=this.controlGetDriver().findElement(By.xpath("//input[@id='firstName']"));
        firstName.sendKeys("sumit");
        WebElement lastName=this.controlGetDriver().findElement(By.xpath("//input[@id='lastName']"));
        lastName.sendKeys("kaushik");
        WebElement email=this.controlGetDriver().findElement(By.xpath("//input[@id='userEmail']"));
        email.sendKeys("pritam@gmail.com");
        WebElement age=this.controlGetDriver().findElement(By.xpath("//input[@id='age']"));
        age.sendKeys("24");
        WebElement salary=this.controlGetDriver().findElement(By.xpath("//input[@id='salary']"));
        salary.sendKeys("24000");
        WebElement department=this.controlGetDriver().findElement(By.xpath("//input[@id='department']"));
        department.sendKeys("scient");

        WebElement submitButton=this.controlGetDriver().findElement(By.xpath(" //button[@id='submit']"));
        ((JavascriptExecutor)this.controlGetDriver()).executeScript("arguments[0].scrollIntoView(true);", submitButton);

        submitButton.click();



        WebElement firstNameCheck =this.controlGetDriver().findElement(By.xpath("//div[normalize-space()='sumit']"));

        Assert.assertEquals(firstNameCheck.getText(),"sumit");



        this.tearDownControlChrome();
    }

  /*  @AfterSuite
    void tearDown(){
        driver.quit();
        //clear native memory
    }*/

}
