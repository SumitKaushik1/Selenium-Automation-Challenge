package org.example.TestCases.One.OnetestNgThreadLevelparallel;

import org.example.Utils.CalculateEarnedSpent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.text.DecimalFormat;
import java.time.Duration;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class AppoloToolsChallengeSynchronised {
   private ThreadLocal<String> threadLocalDriverLocation;
    private ThreadLocal<String> threadLocalDriverName;
    WebDriver driver;


    public AppoloToolsChallengeSynchronised(){
        threadLocalDriverLocation=new ThreadLocal<>();
        threadLocalDriverName=new ThreadLocal<>();

    }
    @Test
    void testingWithThread() throws InterruptedException {

        //what happens when we run this class in background automatically the class is loaded and its object is formed
        //at that time only the threadloccal varaible object is formed by constructor
        // then jvm use this object to call all the methods which has @Test as the annotation like
        //appoloToolsChallengeSynchronised.testingWithThread() in background
       // so no need to this below
        //  AppoloToolsChallengeSynchronised appoloToolsChallengeSynchronised=new AppoloToolsChallengeSynchronised();

        String a=null;


        // when synchronised key word is  used ->suppose jvm run one thread and blocked on wait and execute other thread on wait
        // now what happens it runs one thread full method is synchronied method it will not leave in between  and
        //then other thread2 is executed in this where synchronised keyword it means this method will fully executed then only thread can for blocked on wait

        /*++++++++++++++++++++++++++++++++++++++++++++++++

                you have made two methods synchroniesed ie the navigateurl1 and navigateurl2 now what jvm starts executing these two it will execute fully but there is no gurantee of other methods it may be or not may for parallel execution you can make the guess donot use synchronised keyword for both b/z you need applicaiont to open parallel so it is opening
        if you use synchronised keyword in all then it is obvious each method is executed will be fully when jvm control comes on that method of thread but hte appliciaton of parallel browser execution will not fulfill
        */

        Thread t1 = new Thread(() -> {


            //once the thradlocal object is made globally

            //then we can use that to make varialbe donw belwo seperatly indepnecy local to particular theread
            // method can use the same class data member
            threadLocalDriverName.set("webdriver.chrome.driver");
            threadLocalDriverLocation.set("J:\\3. automation testing\\day39---Selenium full ui elements testing\\Assignment1 Answers\\chromedriver-win64\\chromedriver.exe");



            navigateToTheURL1();
            try {

                loginWithValidCredentials1();

                checkUrlOfPage1();

                totalMoneySpentCalculation1();

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        });


        Thread t2 = new Thread(() -> {


            //once the thradlocal object is made globally

            //then we can use that to make varialbe donw belwo seperatly indepnecy local to particular theread
            // method can use the same class data member
            // method can use the same class data member
            threadLocalDriverName.set("webdriver.edge.driver");
            threadLocalDriverLocation.set("J:\\3. automation testing\\day41--selenium -UI elements\\msedgedriver.exe");
            navigateToTheURL2();
            try {



                loginWithValidCredentials2();
                checkUrlOfPage2();
                totalMoneySpentCalculation2();



            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        t1.start();
        t2.start();


        //main thread has to wait till the t1 thread has to complete
        t1.join();
        //main thread has to wait til the t2 thread has to complete
        t2.join();

    }


   synchronized public void navigateToTheURL1(){
        System.setProperty(threadLocalDriverName.get(), threadLocalDriverLocation.get());

        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://demo.applitools.com/");
        // String title=driver.getTitle();
        // Assert.assertEquals(title,"CURA Healthcare Service");


    }



   synchronized public void loginWithValidCredentials1() throws InterruptedException{
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




  synchronized   public void checkUrlOfPage1() throws InterruptedException{
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




   synchronized void totalMoneySpentCalculation1(){


        CalculateEarnedSpent calculateEarnedSpent=new CalculateEarnedSpent();
/*
        String part1="//table[@class=\"table table-padded\"]/tbody/tr";
        String part2="]/td[";
        String part3="]";
        System.out.println();*/
        List<WebElement> negativeSpans = driver.findElements(By.xpath("//table[@class='table table-padded']//span[contains(@class, 'text-danger') and contains(text(), '-')]"));

        // Iterate over the negative <span> elements and print their text content
        for (WebElement amountSpent : negativeSpans) {
            calculateEarnedSpent.amountSpent(Double.parseDouble(amountSpent.getText().replaceAll("USD", "").replaceAll("[^\\d.-]", "").trim()));

        }
/*
        This code snippet replaces all occurrences of "USD" in the originalString with an empty string, effectively removing "USD". The trim() method is used to remove any leading or trailing whitespace that might remain after removing "USD".*/
        /*        originalString.replaceAll("[^\\d.-]", "").trim(); // Removes all characters except digits, minus sign, and dot*/
        // System.out.println(CalculateEarnedSpent.showSpent());

        List<WebElement> positiveSpans = driver.findElements(By.xpath("//table[@class='table table-padded']//span[contains(@class, 'text-success') and not(contains(text(), '-'))]"));
        // Iterate over the negative <span> elements and print their text content
        for (WebElement amountEarned : positiveSpans) {
            calculateEarnedSpent.amountEarned(Double.parseDouble(amountEarned.getText().replaceAll("USD", "").replaceAll("[^\\d.-]", "").trim()));

        }

        // System.out.println(CalculateEarnedSpent.showEarned());

        DecimalFormat df = new DecimalFormat("#.##");

        Assert.assertEquals(Double.parseDouble(df.format(calculateEarnedSpent.showEarned()+calculateEarnedSpent.showSpent())),1996.22);
    }





  synchronized   public void navigateToTheURL2(){
      System.setProperty(threadLocalDriverName.get(), threadLocalDriverLocation.get());
    //    System.setProperty("webdriver.edgee.driver", "J:\\3. automation testing\\day41--selenium -UI elements\\msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://demo.applitools.com/");
        // String title=driver.getTitle();
        // Assert.assertEquals(title,"CURA Healthcare Service");


    }



    synchronized public void loginWithValidCredentials2() throws InterruptedException{
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




   synchronized public void checkUrlOfPage2() throws InterruptedException{
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




   synchronized void totalMoneySpentCalculation2(){

        CalculateEarnedSpent calculateEarnedSpent=new CalculateEarnedSpent();

/*
        String part1="//table[@class=\"table table-padded\"]/tbody/tr";
        String part2="]/td[";
        String part3="]";
        System.out.println();*/
        List<WebElement> negativeSpans = driver.findElements(By.xpath("//table[@class='table table-padded']//span[contains(@class, 'text-danger') and contains(text(), '-')]"));

        // Iterate over the negative <span> elements and print their text content
        for (WebElement amountSpent : negativeSpans) {
            calculateEarnedSpent .amountSpent(Double.parseDouble(amountSpent.getText().replaceAll("USD", "").replaceAll("[^\\d.-]", "").trim()));

        }
/*
        This code snippet replaces all occurrences of "USD" in the originalString with an empty string, effectively removing "USD". The trim() method is used to remove any leading or trailing whitespace that might remain after removing "USD".*/
        /*        originalString.replaceAll("[^\\d.-]", "").trim(); // Removes all characters except digits, minus sign, and dot*/
        // System.out.println(CalculateEarnedSpent.showSpent());

        List<WebElement> positiveSpans = driver.findElements(By.xpath("//table[@class='table table-padded']//span[contains(@class, 'text-success') and not(contains(text(), '-'))]"));
        // Iterate over the negative <span> elements and print their text content
        for (WebElement amountEarned : positiveSpans) {
            calculateEarnedSpent .amountEarned(Double.parseDouble(amountEarned.getText().replaceAll("USD", "").replaceAll("[^\\d.-]", "").trim()));

        }

        // System.out.println(CalculateEarnedSpent.showEarned());

        DecimalFormat df = new DecimalFormat("#.##");

        Assert.assertEquals(Double.parseDouble(df.format(calculateEarnedSpent .showEarned()+calculateEarnedSpent.showSpent())),1996.22);
    }




}