package org.example.TestCases.One.One.testNgclassLevelparallelViaestngfile;

import com.base.bast_test_control.one.BaseTestControlChromeOne;
import com.pageobject.page.object.one.AppiloToolsWebElementDashBoardPage;
import com.pageobject.page.object.one.AppiloToolsWebElementLoginPage;
import customExceptions.KeyUrlNotFoundException;
import enumconstants.ReadFileConstants;
import org.assertj.core.api.Assertions;
import org.testng.annotations.AfterSuite;
import propertesfilesread.LoginCredentialsPropertyFileRead;
import threadlocal.ThreadLocalWebDriver;
import org.Utils.onechallengeutil.CalculateEarnedSpent;
import org.testng.annotations.Test;

import java.text.DecimalFormat;
import java.util.regex.Pattern;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * Unit test for simple App.
 */

// class is final so it cannot be extended ie inherited again so that its methods cannot be overriden
public final class AppoloToolsChallengeOneChromeTest extends BaseTestControlChromeOne
{



    //what happnes when teh object of the AppoloToolsChallengeOneChromeTest is made in behind by jvm
    //then default constructor of the AppoloToolsChallengeOneChromeTest is called then if we want to make the
    //object of the super() class then we can make here thne only we can use the methods in below

    //constructor is private bz this class object is not possible in other class,jvm can make the object inheritly
    //but not allowed to the class to make objectt
   private AppoloToolsChallengeOneChromeTest(){
        super();

    }


/*

    WebDriver driver;





    @BeforeSuite
    public void navigateToTheURL(){
        //system is a class
        //there is no need to give the system.getProperty("user.dir")->java has pointer at the current directory ie
        //but as the good practice we give the System.getProperty("user.dir")
        System.setProperty("webdriver.chrome.driver","J:\\3. automation testing\\day41--selenium -UI elements\\AssignmentAnswers\\Appolo-Tools\\src\\test\\resources\\driver\\chromedriver.exe");


        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://demo.applitools.com/");
       // String title=driver.getTitle();
      // Assert.assertEquals(title,"CURA Healthcare Service");


    }
*/


    @Test(priority =0)
    public void loginWithValidCredentials() throws Exception {




        this.setUpControlChrome();


        //Testng liberary--> //Testng liberary needs many statements to for checking different condtion
        //Assert.assertEquals(ThreadLocalWebDriver.getDriver().getCurrentUrl(),"https://demo.applitools.com/");
        //Assert is used to abort the program at the particular line if certain condition is not fulfill
        //if that condition is satified thne code will continiue
        //note bydefault if  there is no error(no assertion you applied like Assert.<method>) in the
        // method so the it will pass bydefault




        //or
        //AsertJ liberary
        //assertJ liberary allow the chaining of the assertion  which is easy
        //as() is used to give message on assertion fail for the method comming after it
        // this can take any type of object -> String ,map,locadate or anything
       // Assertions.assertThat(ThreadLocalWebDriver.getDriver().getCurrentUrl()).as("string is null").isNotNull().isEqualTo("https://demo.applitools.com/");
       // Assertions.assertThat(ThreadLocalWebDriver.getDriver().getCurrentUrl()).as("string is null").isNotNull().matches("^https:\/\/demo\.applitools\.com\/$ "));


        Assertions.assertThat(ThreadLocalWebDriver.getDriver().getCurrentUrl())
                .as("string is null")
                .isNotNull()
                .matches(Pattern.compile("^https:\\/\\/demo\\.applitools\\.com\\/$"));

/*        Explanation:
^: Asserts the start of the string.
        https:\/\/: Matches the literal string https://. The slashes (/) are escaped with backslashes (\/) since they are special characters in regex.
        demo\.applitools\.com: Matches the domain demo.applitools.com. The dots (.) are escaped (\.) to match a literal dot.
\/: Matches the literal / at the end of the URL.
                $: Asserts the end of the string.*/
//Assert is used to abort the program at the particular line if certain condition is not fulfill
        //if that condition is satified thne code will continiue
        //note bydefault if  there is no error(no assertion you applied like Assert.<method>) in the
        // method so the it will pass bydefault

    }



   @Test(priority =1)
    public void checkUrlOfPage() throws InterruptedException, KeyUrlNotFoundException {


       //note when you make the instance here the driver instance reamin
       //in memory till it is not removed while runnign of the program

       //LoginCredentialsPropertyFileRead class static  method is called when the value is required from its file to get we pass the key
       // FileReader reader=new FileReader("src/test/resources/configproperties/LoginCredentitals.properties");//it is the location of the properites
       //Properties p=new Properties();//it is the inbuilt java class
       //p.load(reader);//property file isto read the property file


       System.out.println(LoginCredentialsPropertyFileRead.readPropertyFile(ReadFileConstants.USERNAME));
       System.out.println(LoginCredentialsPropertyFileRead.readPropertyFile(ReadFileConstants.PASSWORD));


       //System.out.println(p.getProperty("userName"));
       // System.out.println(p.getProperty("password"));

       //anchor tag we use
       //WebElement makeAppointmentButton = driver.findElement(By.xpath("//a[@id='btn-make-appointment']"));
       //  makeAppointmentButton.click();


       //  WebElement userName= ThreadLocalWebDriver.getDriver().findElement(By.xpath("//input[@id='username']"));
      // userName.sendKeys(LoginCredentialsPropertyFileRead.readPropertyFile("userName"));



       // userName.sendKeys(p.getProperty("userName"));
       //userName.sendKeys("Admin");


      // WebElement password =ThreadLocalWebDriver.getDriver().findElement(By.xpath("//input[@id='password']"));
     //  password.sendKeys(LoginCredentialsPropertyFileRead.readPropertyFile("password"));




       // password.sendKeys(p.getProperty("password"));
       // password.sendKeys("Password@123");


       //WebElement signButton=ThreadLocalWebDriver.getDriver().findElement(By.xpath("//a[@id='log-in']"));
       //signButton.click();

       AppiloToolsWebElementLoginPage appiloToolsWebElement=new AppiloToolsWebElementLoginPage();
       appiloToolsWebElement.enterUserNameApplitools().enterPasswordApplitools().clickButtonApplitools().getCurrentUrl();





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

      // String currentUrl=ThreadLocalWebDriver.getDriver().getCurrentUrl();
       //System.out.println(currentUrl);
      // assertThat(currentUrl.equals("https://demo.applitools.com/app.html"));



       //Testng liberary --> //Testng liberary needs many statements to for checking different condtion
       //Assert.assertEquals(currentUrl, "https://demo.applitools.com/app.html");
       //Assert is used to abort the program at the particular line if certain condition is not fulfill
       //if that condition is satified thne code will continiue
       //note bydefault if  there is no error(no assertion you applied like Assert.<method>) in the
       // method so the it will pass bydefault


       //or
       //AsertJ liberary
       //assertJ liberary allow the chaining of the assertion  which is easy
       // as is used to give message on the assertion fail
       //as() is used to give message on assertion fail for the method comming after it
       // this can take any type of object -> String ,map,locadate or anything
      // Assertions.assertThat(ThreadLocalWebDriver.getDriver().getCurrentUrl()).as("string is null").isNotNull().isEqualTo("https://demo.applitools.com/app.html");
       //Assert is used to abort the program at the particular line if certain condition is not fulfill
       //if that condition is satified thne code will continiue
       //note bydefault if  there is no error(no assertion you applied like Assert.<method>) in the
       // method so the it will pass bydefault
       Assertions.assertThat(ThreadLocalWebDriver.getDriver().getCurrentUrl())
               .as("string is null")
               .isNotNull()
               .matches("^https:\\/\\/demo\\.applitools\\.com\\/.*$");




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



    @Test(priority =2)
    void totalMoneySpentCalculation() throws KeyUrlNotFoundException {


        CalculateEarnedSpent calculateEarnedSpent=new CalculateEarnedSpent();
/*
        String part1="//table[@class=\"table table-padded\"]/tbody/tr";
        String part2="]/td[";
        String part3="]";
        System.out.println();*/


       //List<WebElement> negativeSpans =ThreadLocalWebDriver.getDriver().findElements(By.xpath("//table[@class='table table-padded']//span[contains(@class, 'text-danger') and contains(text(), '-')]"));

        // Iterate over the negative <span> elements and print their text content
        //for (WebElement amountSpent : negativeSpans) {
          //  calculateEarnedSpent.amountSpent(Double.parseDouble(amountSpent.getText().replaceAll("USD", "").replaceAll("[^\\d.-]", "").trim()));

        //}
/*
        This code snippet replaces all occurrences of "USD" in the originalString with an empty string, effectively removing "USD". The trim() method is used to remove any leading or trailing whitespace that might remain after removing "USD".*/
/*        originalString.replaceAll("[^\\d.-]", "").trim(); // Removes all characters except digits, minus sign, and dot*/
       // System.out.println(CalculateEarnedSpent.showSpent());

        //List<WebElement> positiveSpans = ThreadLocalWebDriver.getDriver().findElements(By.xpath("//table[@class='table table-padded']//span[contains(@class, 'text-success') and not(contains(text(), '-'))]"));
        // Iterate over the negative <span> elements and print their text content
        //for (WebElement amountEarned : positiveSpans) {
        //   calculateEarnedSpent.amountEarned(Double.parseDouble(amountEarned.getText().replaceAll("USD", "").replaceAll("[^\\d.-]", "").trim()));

      //  }

       // System.out.println(CalculateEarnedSpent.showEarned());

        AppiloToolsWebElementDashBoardPage appiloToolsWebElementDashBoardPage=new AppiloToolsWebElementDashBoardPage();

        appiloToolsWebElementDashBoardPage.negativeSpanApplitoolsDashbord(calculateEarnedSpent).positiveSpanApplitoolsDashbord(calculateEarnedSpent);

        DecimalFormat df = new DecimalFormat("#.##");


        //Testng liberary needs many statements to for checking different condtion --> //Testng liberary needs many statements to for checking different condtion
       // Assert.assertEquals(Double.parseDouble(df.format(calculateEarnedSpent.showEarned()+calculateEarnedSpent.showSpent())),1996.22);
        //Assert is used to abort the program at the particular line if certain condition is not fulfill
        //if that condition is satified thne code will continiue
        //note bydefault if  there is no error(no assertion you applied like Assert.<method>) in the
        // method so the it will pass bydefault
        //at ht elast test driver instance is removerd from memory


        //or
        //AsertJ liberary
        //assertJ liberary allow the chaining of the assertion  which is easy
        // as is used to give message on the assertion fail
        //as() is used to give message on assertion fail for the method comming after it
        // this can take any type of object -> String ,map,localedate or anything
        Assertions.assertThat(Double.parseDouble(df.format(calculateEarnedSpent.showEarned()+calculateEarnedSpent.showSpent()))).as("value doesnot exist").isEqualTo(1996.22);
        //Assert is used to abort the program at the particular line if certain condition is not fulfill
        //if that condition is satified thne code will continiue
        //note bydefault if  there is no error(no assertion you applied like Assert.<method>) in the
        // method so the it will pass bydefault

    }



    @AfterSuite
    void closeAllResources(){
        this.tearDownControlChrome();
      }



  /*@AfterSuite
    void tearDown(){
      //to save native memory
        driver.quit();
  }
*/





}