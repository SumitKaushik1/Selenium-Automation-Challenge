package com.extendedreport.five;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import path.DriverAndFilesPathConstants;

import java.awt.*;
import java.io.File;
import java.util.Objects;

//final class ie it cannot be inherited ie it cannot be extended
public final  class ExtendReportToInitAndFlushReportFive {

    //its object outside class cannot be made
 private ExtendReportToInitAndFlushReportFive(){}



    // since it is static so  whatever changes hte thread is doing it is doing to this variable ie
    // ie is in same report  only
    private static ExtentReports extent;

    public static ExtentTest test;


    // you have to call this method at the time of driver is made ie is in package com.base.bast_test_control.three;
    // it is done int the before suit of hte package com.base.bast_test_control.three;
    public static void initReports() throws Exception {


        if(Objects.isNull(extent))
        {
            extent=new ExtentReports();

            ExtentSparkReporter spark=new ExtentSparkReporter(new File(DriverAndFilesPathConstants.getExtentReportPathVWOHeatMapFive()));
            extent.attachReporter(spark);
            spark.config().setTheme(Theme.STANDARD);
            // YOU CAN CHANGE THE THEME OF THE PAGE JUST PRESSING THE l on the page

            spark.config().setDocumentTitle("TMB Report");
            spark.config().setReportName("Youtube Training");
        }

    }


    // it is done in the aftersuit in teh package com.base.bast_test_control.three;
    public static void flushReports() throws Exception {
        if(Objects.nonNull(extent)){
            extent.flush();
        }

        ThreadLocalFiveExtentManager.unload();

        Desktop.getDesktop().browse(new File(DriverAndFilesPathConstants.getExtentReportPathVWOHeatMapFive()).toURI());

    }

    public static void createTest(String testcasename){


        ThreadLocalFiveExtentManager.setExtentTest(extent.createTest(testcasename));
    }


}


