package org.example.TestCases.Three;

import com.basedriver.bast_test_control.three.BaseTestControlChromeThree;
import com.pageobjectandextendreport.page.object.three.DemoQAModalDialoguePage;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

// class is final so it cannot be extended ie inherited again so that its methods cannot be overriden
public final  class DemoQaModalDialogesChallengeThreeTest extends BaseTestControlChromeThree {




    //jvm make the object of hte DemoQaModalDialogesChallengeThreeTest call this construtory

    //constructor is private bz this class object is not possible in other class,jvm can make the object inheritly
    //but not allowed to the class to make objectt
   private DemoQaModalDialogesChallengeThreeTest(){
        super();
        //BaseTestControlChromeThree parent class object is made and tehn the it all method are eligible forcalling
    }

/*    WebDriver driver;


    @BeforeSuite
    void navigateToURL(){
        System.setProperty("webdriver.chrome.driver","J:\\3. automation testing\\day39---Selenium full ui elements testing\\Assignment1 Answers\\chromedriver-win64\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://demoqa.com/modal-dialogs");



    }*/


    @Test(priority=0)
    void clickOnLargeModalAndVerifyContent() throws Exception {
/*


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='showLargeModal']")));
         driver.findElement(By.xpath("//button[@id='showLargeModal']")).click();
        WebElement webElement=driver.findElement(By.xpath("//p[contains(text(),'Lorem Ipsum is simply dummy text of the printing a')]"));
*/
        this.setUpControlChrome();

        // for the logger in the extended report
        // it is just like a log ie the test is created  here
        //ExtendReportToInitAndFlushReportThree.createTest("add details to large modal ");

       // WebElement largeModelButton = this.controlGetDriver().findElement(By.xpath("//button[@id='showLargeModal']"));
        //((JavascriptExecutor) this.controlGetDriver()).executeScript("arguments[0].scrollIntoView(true);", largeModelButton );
        //largeModelButton.click();


      //  WebElement largeModelButtonText=this.controlGetDriver().findElement(By.xpath("//p[contains(text(),'Lorem Ipsum is simply dummy text of the printing a')]"));
        //String text=largeModelButtonText.getText();


        DemoQAModalDialoguePage demoQAModalDialoguePage=new DemoQAModalDialoguePage();



        WebElement largeModelButtonText = demoQAModalDialoguePage
                .largeModelButtonWebElement(this)
                .largeModelButtonTextWebElement(this);

       // String text=largeModelButtonText.getText();

        //this is done before assertion  line bz if it fails then control flow stops and the code this will be unreachable
        // for the logger in the extended report
      //  if(largeModelButtonText.getText().equals("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."))
            // it is the log if this line is executed ie means test is passed
          //  ThreadLocalThreeExtentManager.getExtentTest().pass("details added to large modal");
        //else
          //  ThreadLocalThreeExtentManager.getExtentTest().fail("details not added to large  modal");





        //Testng liberary--> //Testng liberary needs many statements to for checking different condition
        //Assert.assertEquals("okay","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.",text);
        //Assert is used to abort the program at the particular line if certain condition is not fulfill
        //if that condition is satified thne code will continiue
        //note bydefault if  there is no error(no assertion you applied like Assert.<method>) in the
        // method so the it will pass bydefault

        //or
        //AsertJ liberary
        //assertJ liberary allow the chaining of the assertion  which is easy
        //as() is used to give message on assertion fail for the method comming after it
        // this can take any type of object -> String ,map,locadate or anything
        //webelment is taken check webelemnt exist then text is prited as output(if web element not exist then
        // as() is printed then then that  output  is converted to  string is matchedot "sumit" txt
        Assertions.assertThat(largeModelButtonText).as("no text").extracting(WebElement :: getText).toString().equals("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
        //Assert is used to abort the program at the particular line if certain condition is not fulfill
        //if that condition is satified thne code will continiue
        //note bydefault if  there is no error(no assertion you applied like Assert.<method>) in the
        // method so the it will pass bydefault

    }


    @AfterSuite
    void tearDown(){
        this.tearDownControlChrome();
        //clear native memory
    }

}
