package com.pageobject.page.objectwithextendreport.five;

import com.pageobject.basepageobject.BasePageObjectFive;
import org.example.TestCases.Five.AppVWOChallengeFiveTest;

import java.util.ArrayList;
import java.util.List;

public class VWOTabPage  extends BasePageObjectFive {



    public String  tabTitleVWOPage(AppVWOChallengeFiveTest appVWOChallengeFiveTest){


        List<String> allWindows = new ArrayList<>(appVWOChallengeFiveTest.controlGetDriver().getWindowHandles());
        //appVWOChallengeFiveTest.controlGetDriver().switchTo().window(allWindows.get(1));

       this.switchWindow(allWindows.get(1), appVWOChallengeFiveTest);

        System.out.println(appVWOChallengeFiveTest.controlGetDriver().getTitle());

        return appVWOChallengeFiveTest.controlGetDriver().getTitle();
    }
}
