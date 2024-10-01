package org.example.TestCases.Four.FourTwoThreadLevelParallel;

import org.Utils.excel.FullExcelMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

public class AppVWOChallengeFourSychronisedTest {
    private ThreadLocal<String> threadLocalDriverLocation;
    private ThreadLocal<String> threadLocalDriverName;
    WebDriver driver;


    public AppVWOChallengeFourSychronisedTest(){
        threadLocalDriverLocation=new ThreadLocal<>();
        threadLocalDriverName=new ThreadLocal<>();

    }
    @Test
    void testingWithThread() throws InterruptedException {

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

                    loginCrdentialsInValid1();


            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
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
                loginCrdentialsInValid2();
            } catch (InterruptedException | IOException e) {
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

    synchronized public void navigateToTheURL1() {

        System.setProperty(threadLocalDriverName.get(), threadLocalDriverLocation.get());
        //System.setProperty("webdriver.chrome.driver","J:\\3. automation testing\\day39---Selenium full ui elements testing\\Assignment1 Answers\\chromedriver-win64\\chromedriver.exe");

        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://app.vwo.com/#/login");
        // String title=driver.getTitle();
        // Assert.assertEquals(title,"CURA Healthcare Service");


    }

   synchronized    public void loginCrdentialsInValid1() throws InterruptedException, IOException {


        FullExcelMethods fullExcelMethods = new FullExcelMethods("J:\\3. automation testing\\day41--selenium -UI elements\\AssignmentAnswers\\Appolo-Tools\\Vwo.xlsx");


        String[][] dataTable=  fullExcelMethods.getDataFromSheet("J:/3. automation testing/day41--selenium -UI elements/AssignmentAnswers/Appolo-Tools/Vwo.xlsx", "Login Data");


        for (String[] row : dataTable) {

            WebElement emailAddress= driver.findElement(By.xpath("//input[@id='login-username']"));
            emailAddress.clear();
            emailAddress.sendKeys(row[1]);
            WebElement password = driver.findElement(By.xpath("//input[@id='login-password']"));
            password.clear();
            password.sendKeys(row[2]);
            WebElement signInButton = driver.findElement(By.xpath("//button[@id='js-login-btn']"));
            signInButton.click();

        }

       WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));//in this we set the driver to wait maximum 10 seconds
       // WebElement firstLine=driver.findElement(By.xpath("//span[@data-qa='lufexuloga']"));
       //span[@class='Fw(semi-bold) ng-binding']



       WebElement text = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='Fw(semi-bold) ng-binding']")));

       ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", text);
       System.out.println(text.getText());
       Assert.assertEquals(text.getText(),"akash");

       System.out.println("loginCredentials1");




       /* WebElement emailAddress= driver.findElement(By.xpath("//input[@id='login-username']"));
        emailAddress.sendKeys("akash@wuuvo.com");
        WebElement password = driver.findElement(By.xpath("//input[@id='login-password']"));
        password.sendKeys("Test@1234");
        WebElement signInButton = driver.findElement(By.xpath("//button[@id='js-login-btn']"));
        signInButton.click();
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));//in this we set the driver to wait maximum 10 seconds
        // WebElement firstLine=driver.findElement(By.xpath("//span[@data-qa='lufexuloga']"));
        //span[@class='Fw(semi-bold) ng-binding']



        WebElement text = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='Fw(semi-bold) ng-binding']")));

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", text);
        System.out.println(text.getText());
        Assert.assertEquals(text.getText(),"dasda dasda");

        System.out.println("loginCredentials1");*/
    }



   synchronized public void navigateToTheURL2() {
       System.setProperty(threadLocalDriverName.get(), threadLocalDriverLocation.get());

     //   System.setProperty("webdriver.edgee.driver", "J:\\3. automation testing\\day41--selenium -UI elements\\msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://app.vwo.com/#/login");
        // String title=driver.getTitle();
        // Assert.assertEquals(title,"CURA Healthcare Service");





    }


    public void loginCrdentialsInValid2() throws InterruptedException, IOException {
        FullExcelMethods fullExcelMethods = new FullExcelMethods("J:\\3. automation testing\\day41--selenium -UI elements\\AssignmentAnswers\\Appolo-Tools\\Vwo.xlsx");


        String[][] dataTable=  fullExcelMethods.getDataFromSheet("J:/3. automation testing/day41--selenium -UI elements/AssignmentAnswers/Appolo-Tools/Vwo.xlsx", "Login Data");


        for (String[] row : dataTable) {

            WebElement emailAddress= driver.findElement(By.xpath("//input[@id='login-username']"));
            emailAddress.clear();
            emailAddress.sendKeys(row[1]);
            WebElement password = driver.findElement(By.xpath("//input[@id='login-password']"));
            password.clear();
            password.sendKeys(row[2]);
            WebElement signInButton = driver.findElement(By.xpath("//button[@id='js-login-btn']"));
            signInButton.click();

        }

        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));//in this we set the driver to wait maximum 10 seconds
        // WebElement firstLine=driver.findElement(By.xpath("//span[@data-qa='lufexuloga']"));
        //span[@class='Fw(semi-bold) ng-binding']



        WebElement text = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='Fw(semi-bold) ng-binding']")));

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", text);
        System.out.println(text.getText());
        Assert.assertEquals(text.getText(),"akash");
        //Assert is used to abort the program at the particular line if certain condition is not fulfill
        //if that condition is satified thne code will continiue
        //note bydefault if  there is no error(no assertion you applied like Assert.<method>) in the
        // method so the it will pass bydefault




        System.out.println("loginCredentials2");

    }



}
