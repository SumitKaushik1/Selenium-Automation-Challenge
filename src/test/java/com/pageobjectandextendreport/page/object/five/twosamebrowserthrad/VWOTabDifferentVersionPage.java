package com.pageobjectandextendreport.page.object.five.twosamebrowserthrad;



import com.pageobjectandextendreport.basepageobjectwithextendreport.five.twosamebrowserthread.BasePageObjectDifferntVersionChromeFive;
import org.example.TestCases.Five.sametwobrowsertwothreads.AppVWOChallengeFiveTest;
import org.example.TestCases.Five.sametwobrowsertwothreads.DiffernetVersionAppVWOChallengeFiveTest;

import java.util.ArrayList;
import java.util.List;

public class VWOTabDifferentVersionPage extends BasePageObjectDifferntVersionChromeFive {



    public String  tabTitleVWOPage(DiffernetVersionAppVWOChallengeFiveTest differnetVersionAppVWOChallengeFiveTest) throws Exception {


        List<String> allWindows = new ArrayList<>(differnetVersionAppVWOChallengeFiveTest.controlGetDriver().getWindowHandles());
        //appVWOChallengeFiveTest.controlGetDriver().switchTo().window(allWindows.get(1));

       this.switchWindow(allWindows.get(1),differnetVersionAppVWOChallengeFiveTest,"heatmap window");

        System.out.println(differnetVersionAppVWOChallengeFiveTest.controlGetDriver().getTitle());

        return differnetVersionAppVWOChallengeFiveTest.controlGetDriver().getTitle();
    }
}
