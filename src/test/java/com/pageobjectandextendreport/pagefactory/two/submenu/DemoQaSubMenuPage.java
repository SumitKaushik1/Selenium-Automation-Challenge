package com.pageobjectandextendreport.pagefactory.two.submenu;

import com.pageobjectandextendreport.basepageobjectwithextendreport.BasePageObjectChromeTwo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DemoQaSubMenuPage extends BasePageObjectChromeTwo {


    private final By tileOfPage =By.xpath(
"//h1[@class='text-center']");
public WebElement getTitle() throws Exception {
    return this.getPageTitle(tileOfPage,"title");
}
}
