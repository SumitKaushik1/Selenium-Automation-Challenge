package com.pageobjectandextendreport.page.object.five.twobrowser;







import com.pageobjectandextendreport.basepageobjectwithextendreport.five.twobrowser.BasePageObjectFive;
import org.example.TestCases.Five.twobrowser.AppVWOChallengeFiveTest;

import java.util.ArrayList;
import java.util.List;

public class VWOTabPage  extends BasePageObjectFive {



    public String  tabTitleVWOPage(AppVWOChallengeFiveTest appVWOChallengeFiveTest) throws Exception {


        List<String> allWindows = new ArrayList<>(appVWOChallengeFiveTest.controlGetDriver().getWindowHandles());
        //appVWOChallengeFiveTest.controlGetDriver().switchTo().window(allWindows.get(1));

       this.switchWindow(allWindows.get(1), appVWOChallengeFiveTest,"heatmap window");

        System.out.println(appVWOChallengeFiveTest.controlGetDriver().getTitle());

        return appVWOChallengeFiveTest.controlGetDriver().getTitle();
    }
}
