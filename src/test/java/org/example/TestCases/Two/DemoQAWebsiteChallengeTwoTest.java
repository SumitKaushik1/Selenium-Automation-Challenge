package org.example.TestCases.Two;



import com.cutomannotation.two.TwoFrameworkAnnotation;
import com.driver.two.BaseTestControlChromeTwo;
import com.pageobjectandextendreport.page.object.two.DemoQAWebTablePage;
import com.pageobjectandextendreport.pagefactory.two.DemoQaHomePage;
import enumconstants.CategoryTypeConstants;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.*;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import java.util.Map;


// class is final so it cannot be extended ie inherited again so that its methods cannot be overriden
public  final class DemoQAWebsiteChallengeTwoTest extends BaseTestControlChromeTwo {


    //jvm make the DemoQAWebsiteChallengeTwoTest  object
    //constructor is private bz this class object is not possible in other class,jvm can make the object inheritly
    //but not allowed to the class to make objectt
   private DemoQAWebsiteChallengeTwoTest(){
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



    @TwoFrameworkAnnotation( author={"sumit","pritam"},category={CategoryTypeConstants.REGRESSION,CategoryTypeConstants.MINIREGRESSION})

    @Test(priority=0)
   void clickThirdEditButton(Map<String,String> data) throws Exception {
      //void clickThirdEditButton() throws Exception {

        this.setUpControlChrome();


        // for the logger in the extended report
        // it is just like a log ie the test is created  here
        //TwoExtentReport.createTest("clickon third button  and open registration page Test Chrome");

       /* WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='ReactTable -striped -highlight']//div[3]//div[1]//div[7]//div[1]//span[1]//*[name()='svg']//*[name()='path' and contains(@d,'M880 836H1')]")));
        element.click();*/


        //WebElement editButton = this.controlGetDriver().findElement(By.xpath("//div[@class='ReactTable -striped -highlight']//div[3]//div[1]//div[7]//div[1]//span[1]//*[name()='svg']//*[name()='path' and contains(@d,'M880 836H1')]"));
      // ((JavascriptExecutor) this.controlGetDriver()).executeScript("arguments[0].scrollIntoView(true);", editButton );
        //editButton.click();
       // WebElement webElement=this.controlGetDriver().findElement(By.xpath("//div[@id='registration-form-modal']"));
       // System.out.println(webElement.getText());


        DemoQAWebTablePage demoQAWebTablePage=new DemoQAWebTablePage();
        demoQAWebTablePage.editButtonWebElement(this);
        WebElement webElement=demoQAWebTablePage.registrtionTextElement(this);


        //it is the part of the assertion so it is not added pageObject
        // WebElement webElement=this.controlGetDriver().findElement(By.xpath("//div[@id='registration-form-modal']"));
         //System.out.println(webElement.getText());


        //Testng liberary--> //Testng liberary needs many statements to for checking different condtion
        //Assert.assertEquals(webElement.getText(), "Registration Form");
        //Assert is used to abort the program at the particular line if certain condition is not fulfill
        //if that condition is satified thne code will continiue
        //note bydefault if  there is no error(no assertion you applied like Assert.<method>) in the
        // method so the it will pass bydefault




//this is done before assertion  line bz if it fails then control flow stops and the code this will be unreachable
        // for the logger in the extended report
       // if(webElement.getText().contains("Registration Form"))
            // it is the log if this line is executed ie means test is passed
         //   ThreadLocalTwoExtentManager.getExtentTest().pass("registration form opened ");
       // else
         //   ThreadLocalTwoExtentManager.getExtentTest().fail("registration form is not opened ");




//or
        //AsertJ liberary
        //assertJ liberary allow the chaining of the assertion  which is easy
        //as() is used to give message on assertion fail for the method comming after it
        // this can take any type of object -> String ,map,locadate or anything
        //webelment is taken check webelemnt exist then text is prited as output(if web element not exist then
        // as() is printed then then that  output is converted to  string then  is matched TO "registration" txt

        Assertions.assertThat(webElement).as("no text").extracting( WebElement:: getText).toString().contains("Registration Form");


        //Assert is used to abort the program at the particular line if certain condition is not fulfill
        //if that condition is satified thne code will continiue
        //note bydefault if  there is no error(no assertion you applied like Assert.<method>) in the
        // method so the it will pass bydefault


/*
        WebElement element = driver.findElement(By.xpath("//div[@class='ReactTable -striped -highlight']//div[3]//div[1]//div[7]//div[1]//span[1]//*[name()='svg']//*[name()='path' and contains(@d,'M880 836H1')]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().perform();
*/




    }




    @TwoFrameworkAnnotation( author={"sumit","pritam"},category={CategoryTypeConstants.REGRESSION,CategoryTypeConstants.MINIREGRESSION})
    @Test(priority=1)
   void addDetails(Map<String,String>data) throws Exception {
    //void addDetails() throws Exception {



        // for the logger in the extended report
        // it is just like a log ie the test is created  here
        //TwoExtentReport.createTest("add details to registration form ");

       // WebElement element1=this.controlGetDriver().findElement(By.xpath("//button[@id='submit']"));
        //((JavascriptExecutor) this.controlGetDriver()).executeScript("arguments[0].scrollIntoView(true);", element1);//for this srolling is not required
        //element1.click();

       /* ChromeOptions options =new ChromeOptions();////it helps to make the page strategy to be normal compare to simple  chrome instance

        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);*/
      //  WebDriverWait wait = new WebDriverWait(this.controlGetDriver(), Duration.ofSeconds(10));
        //xpath changes so you have ot paste again and again using the seelctorhub pro
       // WebElement addDetailsButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='addNewRecordButton']")));


        //addDetailsButton.click();

        DemoQAWebTablePage demoQAWebTablePage=new DemoQAWebTablePage();
        WebElement firstNameCheckWebElement=demoQAWebTablePage
                .addDetails (this).firstNameCheckWebElement(this);


    /*    WebElement element = driver.findElement(By.xpath("//button[@id='addNewRecordButton']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().perform();*/


        //WebElement firstName=this.controlGetDriver().findElement(By.xpath("//input[@id='firstName']"));
        //firstName.sendKeys("sumit");
        //WebElement lastName=this.controlGetDriver().findElement(By.xpath("//input[@id='lastName']"));
        //lastName.sendKeys("kaushik");
        //WebElement email=this.controlGetDriver().findElement(By.xpath("//input[@id='userEmail']"));
        //email.sendKeys("pritam@gmail.com");
        //WebElement age=this.controlGetDriver().findElement(By.xpath("//input[@id='age']"));
        //age.sendKeys("24");
        //WebElement salary=this.controlGetDriver().findElement(By.xpath("//input[@id='salary']"));
        //salary.sendKeys("24000");
        //WebElement department=this.controlGetDriver().findElement(By.xpath("//input[@id='department']"));
        //department.sendKeys("scient");

        //WebElement submitButton=this.controlGetDriver().findElement(By.xpath(" //button[@id='submit']"));
        //((JavascriptExecutor)this.controlGetDriver()).executeScript("arguments[0].scrollIntoView(true);", submitButton);

       // submitButton.click();


//this is done before assertion  line bz if it fails then control flow stops and the code this will be unreachable
        // for the logger in the extended report
       // if(firstNameCheckWebElement.getText().contains("sumit"))
            // it is the log if this line is executed ie means test is passed
          //  ThreadLocalTwoExtentManager.getExtentTest().pass("details added to form ");
       // else
         //   ThreadLocalTwoExtentManager.getExtentTest().fail("details not added to form");





       // WebElement firstNameCheckWebElement =this.controlGetDriver().findElement(By.xpath("//div[normalize-space()='sumit']"));




        //Testng liberary--> //Testng liberary needs many statements to for checking different condition
       // Assert.assertEquals(firstNameCheckWebElement.getText(),"sumit");
        //Assert is used to abort the program at the particular line if certain condition is not fulfill
        //if that condition is satisfied then code will continiue
        //note bydefault if  there is no error(no assertion you applied like Assert.<method>) in the
        // method so the it will pass bydefault



        //or
        //AsertJ liberary
        //assertJ liberary allow the chaining of the assertion  which is easy
        //as() is used to give message on assertion fail for the method comming after it
        // this can take any type of object -> String ,map,locadate or anything
        //webelment is taken check webelemnt exist then text is prited as output(if web element not exist then
        // as() is printed then then that  output  is converted to  string is matchedot "sumit" txt
        Assertions.assertThat(firstNameCheckWebElement).as("no text").extracting(WebElement :: getText).toString().equals("sumit");
        //Assert is used to abort the program at the particular line if certain condition is not fulfill
        //if that condition is satified thne code will continiue
        //note bydefault if  there is no error(no assertion you applied like Assert.<method>) in the
        // method so the it will pass bydefault

    }


    @TwoFrameworkAnnotation( author={"sumit","pritam"},category={CategoryTypeConstants.REGRESSION,CategoryTypeConstants.MINIREGRESSION})
    @Test(priority = 2)
  void clickOnHamburgerbuttonSubList(Map<String,String>data) throws Exception {
    //   void clickOnHamburgerbuttonSubList() throws Exception {

       // Assert.assertTrue(true, "This test will always pass");

       WebElement title=new DemoQaHomePage().clickHamburger().clickOnSubMenuItem("Text Box").getTitle();
      //  System.out.println(title);
        System.out.println(title.getText());
        Assertions.assertThat(title).as("no text").extracting(WebElement :: getText).toString().equals("Text Box");
    }

    @AfterSuite
    void tearDown(){
        this.tearDownControlChrome();
        //clear native memory
    }

}
