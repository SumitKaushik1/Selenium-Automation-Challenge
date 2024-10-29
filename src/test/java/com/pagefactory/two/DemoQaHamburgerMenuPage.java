package com.pagefactory.two;

import com.basedriver.basetest.two.BaseTestChromeTwo;
import com.pageobject.basepageobject.BasePageObjectChromeTwo;
import enumconstants.WaitStrategyConstants;
import org.example.TestCases.Two.DemoQAWebsiteChallengeTwoTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoQaHamburgerMenuPage extends BasePageObjectChromeTwo {

/*    @FindBy(xpath="")
    private WebElement linkTextBox;

    @FindBy(xpath="")
    private WebElement linkCheckBox;

    @FindBy(xpath="")
    private  WebElement linkReadioButton;

    @FindBy(xpath="")
    private WebElement linkWebTables;

    @FindBy(xpath="")
    private WebElement linkButtons;

    @FindBy(xpath="")
    private WebElement linkLinks;


    @FindBy(xpath = "")
    private WebElement brokenLinksImages;

    @FindBy(xpath="")
    private WebElement uploadAndDownload;

    @FindBy(xpath="")
    private WebElement dynamicProperties;*/

    private String linkSubMenu="//a[text()='%replaceable']";


   /* public DemoQaHamburgerMenuPage(){
        PageFactory.initElements(BaseTestChromeTwo.getDriverChrome(),this);
    }*/

    public DemoQaSubMenuPage clickOnSubMenuItem(String menutext) throws Exception {
        String newxpath=DynamicWebUtils.getXpath(linkSubMenu,menutext);
        this.clickOnButton(WaitStrategyConstants.CLICKABLE, By.xpath(newxpath) ,menutext);
        if(menutext.contains("Text Box")){
            return new DemoQaSubMenuPage();
        }

        return null ;

    }

  /*  public  DemoQaHamburgerMenuPage click*/



}
