package com.pageobjectandextendreport.pagefactory.two;

import com.driver.two.BaseTestChromeTwo;


import com.pageobjectandextendreport.basepageobjectwithextendreport.BasePageObjectChromeTwo;
import com.pageobjectandextendreport.pagefactory.two.submenu.DemoQaHamburgerMenuPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoQaHomePage extends BasePageObjectChromeTwo {

    @FindBy(xpath = "//div[@id='app']//div[@class='row']//div[1]//div[1]//div[1]//div[1]//span[1]//div[1]//div[1][1]//span[1]//*[name()='svg']")
    private WebElement linkHamburger;

    public DemoQaHomePage(){
        PageFactory.initElements(BaseTestChromeTwo.getDriverChrome(),this);
    }

    public DemoQaHamburgerMenuPage clickHamburger() throws InterruptedException {


        // WebDriverWait driverWait=new WebDriverWait( BaseTestChromeTwo.getDriverChrome(), Duration.ofSeconds(5));
        //driverWait.wait();
        linkHamburger.click();//bz it was already opened so again click to open that
        linkHamburger.click();
        return new DemoQaHamburgerMenuPage();

    }

    }