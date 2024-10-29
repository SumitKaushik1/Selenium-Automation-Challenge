package com.extendedreport.two;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import path.DriverAndFilesPathConstants;

import java.awt.*;
import java.io.File;
import java.util.Objects;

//final class ie it cannot be inherited ie it cannot be extended
public final  class ExtendReportToInitAndFlushReportTwo {

    //its object outside class cannot be made
 private ExtendReportToInitAndFlushReportTwo(){}



    // since it is static so  whatever changes hte thread is doing it is doing to this variable ie
    // ie is in same report  only
    private static ExtentReports extent;

    public static ExtentTest test;

    public static void main (String args[]) throws Exception {
        initReports();
    }


    // you have to call this method at the time of driver is made ie is in package com.base.bast_test_control.one;
   // it is odne in teh
    //   // it is done in the @afteresuite in  package com.base.bast_test_control.two;

    public static void initReports() throws Exception {
        if(Objects.isNull(extent))
        {
            extent=new ExtentReports();
            System.out.println(DriverAndFilesPathConstants.getExtentReportPathDemoQaTwo());
            ExtentSparkReporter spark=new ExtentSparkReporter(DriverAndFilesPathConstants.getExtentReportPathDemoQaTwo());
            extent.attachReporter(spark);
            spark.config().setTheme(Theme.STANDARD);
            // YOU CAN CHANGE THE THEME OF THE PAGE JUST PRESSING THE l on the page

            spark.config().setDocumentTitle("TMB Report");
            spark.config().setReportName("Youtube Training");
        }

    }




    public static void flushReports() throws Exception {
        if(Objects.nonNull(extent)){
            extent.flush();
        }

        ExtentManagerThreadLocalTwo.unload();
        Desktop.getDesktop().browse(new File(DriverAndFilesPathConstants.getExtentReportPathDemoQaTwo()).toURI());


    }

    public static void createTest(String testcasename){


        ExtentManagerThreadLocalTwo.setExtentTest(extent.createTest(testcasename));
    }


}


