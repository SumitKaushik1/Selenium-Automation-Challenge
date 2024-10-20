package org.example.TestCases.Four.FourtestNgclassLevelparallel;


import com.basedriver.bast_test_control.four.BaseTestControlEdgeFour;
import com.pageobject.page.objectwithextendreport.four.edge.VWODashBoardPageEdge;
import com.pageobject.page.objectwithextendreport.four.edge.VWOLoginEdgePage;
import com.utilslikeexcelpojodataprovider.dataproviderexcel.four.DataProviderExcelOne;
import com.utilslikeexcelpojodataprovider.dataproviderexcel.four.DataProviderFour;
import customExceptions.KeyUrlNotFoundException;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Map;

// class is final so it cannot be extended ie inherited again so that its methods cannot be overriden
public final class AppVWOChallengeFourEdgeTest extends BaseTestControlEdgeFour {


    //constructor is private bz this class object is not possible in other class,jvm can make the object inheritly
    //but not allowed to the class to make objectt
//jvm make the object of it behind and
  private  AppVWOChallengeFourEdgeTest(){

        super();//parent class object is made when it is required
    }

 /*   WebDriver driver;

    @BeforeSuite

    public void navigateToTheURL() {


            System.setProperty("webdriver.edgee.driver", "J:\\3. automation testing\\day41--selenium -UI elements\\msedgedriver.exe");
            driver = new EdgeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            driver.get("https://app.vwo.com/#/login");
            // String title=driver.getTitle();
            // Assert.assertEquals(title,"CURA Healthcare Service");

    }*/

    @DataProvider(name="VWOURLFour")
    Object[][] getDataExcelVWOOne(){


        return DataProviderFour.getDataVWOFour();
    }



    // you can take the directly method name also dataProvider = " getDataExcelAppilotoolsOne"
    //loginCredentials is called for the first time for the value ie obj[0]-> holding the array of one dimensional of objet[0]
    //loginCredentials is called for the second time for the value ie obj[1]->  holding the array of one dimensional of objet[1]
    // each one dimensional [][][],login,username ,passwrod goes to respective argument
 //   @Test(priority=0,dataProvider = "VWOURLFour")
   // public void loginCredentialsEdge(String loginId,String username,String password) throws Exception {
    //@Test(priority=0,dataProvider = "getData",dataProviderClass = DataProviderFour.class )
   @Test(priority =0 )
    public void loginCredentialsEdge(Map<String,String> data) throws Exception {



        this.setUpControlEdge();


        // for the logger in the extended report
        // it is just like a log ie the test is created  here
       // ExtendReportToInitAndFlushReportFour.createTest("logged in ");


        // for the logger in the extended report
        // it is just like a log ie the test is created  here
     //   ExtendReportToInitAndFlushReportFive.createTest("logged in ");


        //FileReader reader=new FileReader("src/test/resources/configproperties/LoginCredentitals.properties");//it is the location of the properites
        //  Properties p=new Properties();//it is the inbuilt java class
        // p.load(reader);//property file isto read the property file

        //System.out.println(p.getProperty("emailAddress"));
        //  System.out.println(p.getProperty("password1"));
        // System.out.println(LoginCredentialsJsonFileRead.readPropertyFile(ReadFileConstants.EMAILADDRESS));
        //System.out.println(LoginCredentialsJsonFileRead.readPropertyFile(ReadFileConstants.PASSWORD1));



       // this.controlGetDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
        WebDriverWait wait = new WebDriverWait(this.controlGetDriver(), Duration.ofSeconds(1000));
        wait.until(ExpectedConditions.jsReturnsValue("return document.readyState === 'complete';"));  // wait till the page is fully loaded


        // WebElement emailAddress = ThreadLocalWebDriver.getDriver().findElement(By.xpath("//input[@id='login-username']"));
        //emailAddress.sendKeys(LoginCredentialsJsonFileRead.readPropertyFile("emailAddress"));
        // emailAddress.sendKeys(p.getProperty("emailAddress"));
        // emailAddress.sendKeys("akash@wuuvo.com");
        // WebElement password = ThreadLocalWebDriver.getDriver().findElement(By.xpath("//input[@id='login-password']"));
        //  password.sendKeys(p.getProperty("password1"));
        //password.sendKeys(LoginCredentialsJsonFileRead.readPropertyFile("password1"));
        //password.sendKeys("Test@1234");
        //WebElement signInButton = ThreadLocalWebDriver.getDriver().findElement(By.xpath("//button[@id='js-login-btn']"));
        //signInButton.click();

        // WebDriverWait wait = new WebDriverWait(ThreadLocalWebDriver.getDriver(), Duration.ofSeconds(1000));//in this we set the driver to wait maximum 10 seconds


        // WebElement firstLine=driver.findElement(By.xpath("//span[@data-qa='lufexuloga']"));
        //span[@class='Fw(semi-bold) ng-binding']


        //System.out.println(firstLine);
        // Assert.assertEquals(firstLine.getText(),"dasda dasda","okay");
        //System.out.println(firstLine.getText());

/*          JavascriptExecutor jse=(JavascriptExecutor)driver;
        System.out.println(jse.executeScript("document.querySelector(\"span[class='Fw(semi-bold) ng-binding']\").textContent").toString());*/

        // WebElement text = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='Fw(semi-bold) ng-binding']")));
        // WebElement text = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span[class='Fw(semi-bold) ng-binding']")));

        // ((JavascriptExecutor) ThreadLocalWebDriver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", text);
        //System.out.println(text.getText());


        VWOLoginEdgePage vwoLoginPageEdge=new VWOLoginEdgePage();

        System.out.println("entering started");
      //Boolean errorMessageNotVisible= vwoLoginPageEdge.enterUserNameVWOLogin(username,this).enterPasswordVWOLogin(password,this)
        //        .clickButtonVWOLogin(this);
         Boolean errorMessageNotVisible= vwoLoginPageEdge.enterUserNameVWOLogin(data.get("Username"),this).enterPasswordVWOLogin(data.get("Password"),this)
         .clickButtonVWOLogin(this);

        //.vWODashbord();
        System.out.println("entering ended ");


        //this is done before assertion  line bz if it fails then control flow stops and the code this will be unreachable
        // for the logger in the extended report
       // if(errorMessageNotVisible)
            // it is the log if this line is executed ie means test is passed
         //   ExtentManagerThreadLocalFive.getExtentTest().pass("logged in ");
        //else
          //  ExtentManagerThreadLocalFive.getExtentTest().fail("logged in fail");



        //this is done before assertion  line bz if it fails then control flow stops and the code this will be unreachable
        // for the logger in the extended report
     //   if(errorMessageNotVisible)
            // it is the log if this line is executed ie means test is passed
         //   ExtentManagerThreadLocalFour.getExtentTest().pass("logged in ");
      //  else
         //   ExtentManagerThreadLocalFour.getExtentTest().fail("logged in fail");




        Assertions.assertThat(errorMessageNotVisible).isTrue();//it means it pass ie logged in






    }



    @Test(priority = 1)
    void checkUrlDashboardPageEdge() throws KeyUrlNotFoundException {

        // for the logger in the extended report
        // it is just like a log ie the test is created  here
      //  ExtendReportToInitAndFlushReportFour.createTest("urlcheck ");

        WebElement text= new VWODashBoardPageEdge().vWODashbord(this);



        //   Assertions.assertThat(text.getText()).isNull();//it means it pass ie logged in
        // VWODashBoardPageChrome vwoDashBoardPage=new VWODashBoardPageChrome();

        // WebElement text= vwoDashBoardPage.vWODashbord();

        //Testng liberary--> //Testng liberary needs many statements to for checking different condition
        //Assert.assertEquals(text.getText(), "akash");
        //Assert is used to abort the program at the particular line if certain condition is not fulfill
        //if that condition is satified thne code will continiue
        //note bydefault if  there is no error(no assertion you applied like Assert.<method>) in the
        // method so the it will pass bydefault


        //this is done before assertion  line bz if it fails then control flow stops and the code this will be unreachable
        // for the logger in the extended report
       // if(text.getText().equals("akash"))
            // it is the log if this line is executed ie means test is passed
         //   ExtentManagerThreadLocalFour.getExtentTest().pass("logged in ");
        //else
          //  ExtentManagerThreadLocalFour.getExtentTest().fail("logged in fail");



        //or
        //AsertJ liberary
        //assertJ liberary allow the chaining of the assertion  which is easy
        //as() is used to give message on assertion fail for the method comming after it
        // this can take any type of object -> String ,map,locadate or anything
        //webelment is taken check webelemnt exist then text is prited as output(if web element not exist then
        // as() is printed then then that  output  is converted to  string is matchedot "sumit" txt
        Assertions.assertThat(text).as("no text").extracting(WebElement :: getText).toString().equals("akash");
        //Assert is used to abort the program at the particular line if certain condition is not fulfill
        //if that condition is satified thne code will continiue
        //note bydefault if  there is no error(no assertion you applied like Assert.<method>) in the
        // method so the it will pass bydefault





    }



    @AfterSuite
    void closeAllResoureces(){
        this.tearDownControlEdge();
    }
}
