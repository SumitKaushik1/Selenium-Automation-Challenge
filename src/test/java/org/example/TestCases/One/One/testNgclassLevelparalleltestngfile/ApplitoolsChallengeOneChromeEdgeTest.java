package org.example.TestCases.One.One.testNgclassLevelparalleltestngfile;

import com.basedriver.bast_test_control.one.ChromeEdgeOneBaseTest;
import com.pageobject.page.objectwithextendreport.one.ApplitoolsWebElementDashBoardPage;
import com.pageobject.page.objectwithextendreport.one.ApplitoolsWebElementLoginPage;
import com.pojo.Pojo.one.CalculateEarnedSpent;
import customExceptions.KeyUrlNotFoundException;
import enumconstants.ConfigProperties;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;
import propertesfilesread.LoginCredentialsPropertyFileRead;

import java.text.DecimalFormat;
import java.util.Map;


// no inheritance allowed bz finla class
public final class ApplitoolsChallengeOneChromeEdgeTest extends ChromeEdgeOneBaseTest {


    //no object allowed bz the private construcotr
    private ApplitoolsChallengeOneChromeEdgeTest(){

        //base class object is formed along with it in heap
        super();
    }



    @Test(priority =0)
    public void loginWithCredentials(Map<String,String> data) throws Exception {




     //   this.setUpControlChrome();//note when you make the instsnce here the driver insteance reamin


        //Testng liberary--> //Testng liberary needs many statements to for checking different condtion
        //Assert.assertEquals(ThreadLocalWebDriverManager.getDriver().getCurrentUrl(),"https://demo.applitools.com/");
        //Assert is used to abort the program at the particular line if certain condition is not fulfill
        //if that condition is satified thne code will continiue
        //note bydefault if  there is no error(no assertion you applied like Assert.<method>) in the
        // method so the it will pass bydefault

        // for the logger in the extended report
        // it is just like a log ie the test is created  here
        // ExtendReporToInitAndFlushReporttOne.createTest("Login Test Chrome");


        //or
        //AsertJ liberary
        //assertJ liberary allow the chaining of the assertion  which is easy
        //as() is used to give message on assertion fail for the method comming after it
        // this can take any type of object -> String ,map,locadate or anything
        Assertions.assertThat(this.controlGetDriver().getCurrentUrl()).as("string is null").isNotNull().isEqualTo("https://demo.applitools.com/");
        //Assert is used to abort the program at the particular line if certain condition is not fulfill
        //if that condition is satified thne code will continiue
        //note bydefault if  there is no error(no assertion you applied like Assert.<method>) in the
        // method so the it will pass bydefault




        //in memory till it is not removed while runnign of the program

        //FileReader reader=new FileReader("src/test/resources/configproperties/LoginCredentitals.properties");//it is the location of the properites
        // Properties p=new Properties();//it is the inbuilt java class
        //p.load(reader);//property file isto read the property file

        //System.out.println(p.getProperty("userName"));
        // System.out.println(p.getProperty("password"));



        System.out.println(LoginCredentialsPropertyFileRead.readPropertyFile(ConfigProperties.USERNAME));
        System.out.println(LoginCredentialsPropertyFileRead.readPropertyFile(ConfigProperties.PASSWORD));

        //anchor tag we use
        //WebElement makeAppointmentButton = driver.findElement(By.xpath("//a[@id='btn-make-appointment']"));
        //  makeAppointmentButton.click();


        //  WebDriverWait wait = new WebDriverWait(ThreadLocalWebDriverManager.getDriver(), Duration.ofSeconds(20));
        // WebElement userName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='username']")));


        // WebElement userName= ThreadLocalWebDriverManager.getDriver().findElement(By.xpath("//input[@id='username']"));
        //WebElement userName= ThreadLocalWebDriverManager.getDriver().findElement(By.xpath("//input[@id='username']"));
        //userName.sendKeys(LoginCredentialsJsonFileRead.readPropertyFile("userName"));
        // userName.sendKeys(p.getProperty("userName"));
        // userName.sendKeys("Admin");
        // WebElement password =ThreadLocalWebDriverManager.getDriver().findElement(By.xpath("//input[@id='password']"));//input[@id='password']

        // password.sendKeys(LoginCredentialsJsonFileRead.readPropertyFile("password"));
        // password.sendKeys(p.getProperty("password"));
        // password.sendKeys("Password@123");
        //WebElement signButton=ThreadLocalWebDriverManager.getDriver().findElement(By.xpath("//a[@id='log-in']"));
        //signButton.click();



        // ApplitoolsWebElementLoginPageChrome appiloToolsWebElement=new ApplitoolsWebElementLoginPageChrome();
        //  appiloToolsWebElement.enterUserNameApplitools(credentials.get("Username")).enterPasswordApplitools("Password").clickButtonApplitools();



        ApplitoolsWebElementLoginPage appiloToolsWebElement=new ApplitoolsWebElementLoginPage();
        appiloToolsWebElement.
                enterUserNameApplitools(data.get("username"),this)
                .enterPasswordApplitools(data.get("password"),this).
                clickButtonApplitools(this);


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

        String currentUrl=this.controlGetDriver().getCurrentUrl();
        System.out.println("currenturl:"+currentUrl);

        // assertThat(currentUrl.equals("https://demo.applitools.com/app.html"));
        //Testng liberary --> //Testng liberary needs many statements to for checking different condtion
        //Assert.assertEquals(currentUrl, "https://demo.applitools.com/app.html");
        //Assert is used to abort the program at the particular line if certain condition is not fulfill
        //if that condition is satified thne code will continiue
        //note bydefault if  there is no error(no assertion you applied like Assert.<method>) in the
        // method so the it will pass bydefault





        //this is done before assertion  line bz if it fails then control flow stops and the code this will be unreachable
        // for the logger in the extended report
        // if(ThreadLocalWebDriverManager.getDriver().getCurrentUrl().equals("https://demo.applitools.com/app.html"))
        // it is the log if this line is executed ie means test is passed
        //   OneExtentLogger.pass("logged in ");
        //else
        //  OneExtentLogger.fail("logged in  fail");



        //or
        //AsertJ liberary
        //assertJ liberary allow the chaining of the assertion  which is easy
        // as is used to give message on the assertion fail
        //as() is used to give message on assertion fail for the method comming after it
        // this can take any type of object -> String ,map,locadate or anything
        // Assertions.assertThat(ThreadLocalWebDriverManager.getDriver().getCurrentUrl()).as("string is null").isNotNull().isEqualTo("https://demo.applitools.com/app.html");
        //regix is used



        // for each time test case login credentails test case is run then assertion is checked
        //1. if negative test  case obviously test fail  and if positive test test pass and assertion will pass
        Assertions.assertThat(this.controlGetDriver().getCurrentUrl())
                .as("string is null")
                .isNotNull()
                .matches("^https:\\/\\/demo\\.applitools\\.com\\/app\\.html$");
        //assertion means if the assertion pass the control goes ahead




        //^https:\/\/demo\.applitools\.com\/app\.html$

        //  https://demo.applitools.com/app.html
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
    void totalMoneySpentCalculation(Map<String,String> data) throws KeyUrlNotFoundException {

// for the logger in the extended report
        // it is just like a log ie the test is created
        //  ExtendReporToInitAndFlushReporttOne.createTest("Total Money Spent Test Chrome");


        CalculateEarnedSpent calculateEarnedSpent=new CalculateEarnedSpent();
/*
        String part1="//table[@class=\"table table-padded\"]/tbody/tr";
        String part2="]/td[";
        String part3="]";
        System.out.println();*/


        //List<WebElement> negativeSpans =ThreadLocalWebDriverManager.getDriver().findElements(By.xpath("//table[@class='table table-padded']//span[contains(@class, 'text-danger') and contains(text(), '-')]"));

        // Iterate over the negative <span> elements and print their text content
        //for (WebElement amountSpent : negativeSpans) {
        //  calculateEarnedSpent.amountSpent(Double.parseDouble(amountSpent.getText().replaceAll("USD", "").replaceAll("[^\\d.-]", "").trim()));

        //}
/*
        This code snippet replaces all occurrences of "USD" in the originalString with an empty string, effectively removing "USD". The trim() method is used to remove any leading or trailing whitespace that might remain after removing "USD".*/
        /*        originalString.replaceAll("[^\\d.-]", "").trim(); // Removes all characters except digits, minus sign, and dot*/
        // System.out.println(CalculateEarnedSpent.showSpent());

        //List<WebElement> positiveSpans = ThreadLocalWebDriverManager.getDriver().findElements(By.xpath("//table[@class='table table-padded']//span[contains(@class, 'text-success') and not(contains(text(), '-'))]"));
        // Iterate over the negative <span> elements and print their text content
        //for (WebElement amountEarned : positiveSpans) {
        //   calculateEarnedSpent.amountEarned(Double.parseDouble(amountEarned.getText().replaceAll("USD", "").replaceAll("[^\\d.-]", "").trim()));

        //  }

        // System.out.println(CalculateEarnedSpent.showEarned());

        ApplitoolsWebElementDashBoardPage appiloToolsWebElementDashBoardPage=new ApplitoolsWebElementDashBoardPage();

        appiloToolsWebElementDashBoardPage.negativeSpanApplitoolsDashbord(calculateEarnedSpent,this).positiveSpanApplitoolsDashbord(calculateEarnedSpent,this);

        DecimalFormat df = new DecimalFormat("#.##");


        //Testng liberary needs many statements to for checking different condtion --> //Testng liberary needs many statements to for checking different condtion
        // Assert.assertEquals(Double.parseDouble(df.format(calculateEarnedSpent.showEarned()+calculateEarnedSpent.showSpent())),1996.22);
        //Assert is used to abort the program at the particular line if certain condition is not fulfill
        //if that condition is satified thne code will continiue
        //note bydefault if  there is no error(no assertion you applied like Assert.<method>) in the
        // method so the it will pass bydefault
        //at ht elast test driver instance is removerd from memory



        //this is done before assertion  line bz if it fails then control flow stops and the code this will be unreachable
        // for the logger in the extended report
        //if(Double.parseDouble(df.format(calculateEarnedSpent.showEarned()+calculateEarnedSpent.showSpent())) == 1996.22)
        // it is the log if this line is executed ie means test is passed
        //  OneExtentLogger.pass("calculation correct ");
        //else
        //  OneExtentLogger.fail("calculation not correct");




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





    //you have to add the methdo name also in teh testng file
    @Test(priority =2)
    void justToTestListenerMethod1(Map<String,String> data){
        System.out.println("justToTestListenerMethod1");
    }

    //you have to add the methdo name also in teh testng file
    @Test(priority =3)
    void justToTestListenerMethod2(Map<String,String> data){
        System.out.println("justToTestListenerMethod2");
    }

    @Test(priority =4)
    void justToTestRetryListenerOnFailMethod3(Map<String,String> data){
        System.out.println("justToTestRetryListenerOnFailMethod3");
        Assertions.fail("just to check that it will retry on fail or not according to counter");
    }











}
