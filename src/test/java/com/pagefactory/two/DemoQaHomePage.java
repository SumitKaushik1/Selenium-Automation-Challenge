package com.pagefactory.two;

import com.basedriver.basetest.two.BaseTestChromeTwo;
import com.basedriver.bast_test_control.two.BaseTestControlChromeTwo;
import com.pageobject.basepageobject.BasePageObjectChromeTwo;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoQaHomePage extends BasePageObjectChromeTwo {

    @FindBy(xpath = "<path d=\"//div[@id=\"app\"]//div[@class=\"row\"]//div[1]//div[1]//div[1]//div[1]//span[1]//div[1]//div[1][1]//span[1]//*[name()=\"svg\"]\" xpath=")
    private WebElement linkHamburger;

    public DemoQaHomePage(){
        PageFactory.initElements(BaseTestChromeTwo.getDriverChrome(),this);
    }

    public DemoQaHamburgerMenuPage clickHamburger(){
        linkHamburger.click();
        return new  DemoQaHamburgerMenuPage();
    }
}
