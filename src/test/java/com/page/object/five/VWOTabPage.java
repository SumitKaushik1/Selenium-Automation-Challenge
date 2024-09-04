package com.page.object.five;

import customExceptions.KeyUrlNotFoundException;
import org.example.TestCases.Five.AppVWOChallengeFiveTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;

public class VWOTabPage {



    public String  tabTitleVWOPage(AppVWOChallengeFiveTest appVWOChallengeFiveTest){


        List<String> allWindows = new ArrayList<>(appVWOChallengeFiveTest.controlGetDriver().getWindowHandles());
        appVWOChallengeFiveTest.controlGetDriver().switchTo().window(allWindows.get(1));
        System.out.println(appVWOChallengeFiveTest.controlGetDriver().getTitle());

        return appVWOChallengeFiveTest.controlGetDriver().getTitle();
    }
}
