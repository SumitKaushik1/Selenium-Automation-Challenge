package com.pageobjectandextendreport.pagefactory.two.submenu;

import com.pageobjectandextendreport.basepageobjectwithextendreport.BasePageObjectChromeTwo;
import com.pageobjectandextendreport.pagefactory.two.DynamicWebUtils;
import enumconstants.WaitStrategyConstants;
import org.openqa.selenium.By;

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

  //  private String linkSubMenu="//a[text()='%replaceable%']";

   // private String linkSubMenu="//span[normalize-space()='%replaceable%']";
private String linkSubMenu="//span[normalize-space()='%s']";

   /* public DemoQaHamburgerMenuPage(){
        PageFactory.initElements(BaseTestChromeTwo.getDriverChrome(),this);
    }*/

    public DemoQaSubMenuPage clickOnSubMenuItem(String menutext) throws Exception {
        String newxpath= DynamicWebUtils.getXpath(linkSubMenu,menutext);
        this.clickOnButton(WaitStrategyConstants.CLICKABLE, By.xpath(newxpath) ,menutext);
        if(menutext.contains("Text Box")){
            return new DemoQaSubMenuPage();
        }

        return null ;

    }

  /*  public  DemoQaHamburgerMenuPage click*/



}
