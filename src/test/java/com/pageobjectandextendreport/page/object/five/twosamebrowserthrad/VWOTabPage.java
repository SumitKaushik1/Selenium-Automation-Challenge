package com.pageobjectandextendreport.page.object.five.twosamebrowserthrad;


import com.pageobjectandextendreport.basepageobjectwithextendreport.five.twosamebrowserthread.BasePageObjectChromeFive;
import org.example.TestCases.Five.sametwobrowsertwothreads.AppVWOChallengeFiveTest;


import java.util.ArrayList;
import java.util.List;

public class VWOTabPage  extends BasePageObjectChromeFive {



    public String  tabTitleVWOPage(AppVWOChallengeFiveTest appVWOChallengeFiveTest) throws Exception {


        List<String> allWindows = new ArrayList<>(appVWOChallengeFiveTest.controlGetDriver().getWindowHandles());
        //appVWOChallengeFiveTest.controlGetDriver().switchTo().window(allWindows.get(1));

       this.switchWindow(allWindows.get(1), appVWOChallengeFiveTest,"heatmap window");

        System.out.println(appVWOChallengeFiveTest.controlGetDriver().getTitle());

        return appVWOChallengeFiveTest.controlGetDriver().getTitle();
    }
}
