package org.Utils.excelextendedreportpropertyfile.extendedreports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;



public class ExtendReportTest {

    public static void main(String args[]) throws IOException {

        ExtentReports extent=new ExtentReports();
        ExtentSparkReporter spark=new ExtentSparkReporter("index.html");
        extent.attachReporter(spark);
        spark.config().setTheme(Theme.STANDARD);
        spark.config().setDocumentTitle("TMB Report");
        spark.config().setReportName("Youtube Training");

        ExtentTest test1=extent.createTest("frist test");
        test1.pass("checking the logs in first test");

        ExtentTest test2=extent.createTest("second test");
        test2.pass("checking the logs in second test");


        extent.flush();

       // FileInputStream fs= new FileInputStream(System.getProperty("user.dir")+"/resources/excelfiles/Appollo.xlsx");
        Desktop.getDesktop().browse(new File(System.getProperty("user.dir")+"/resources/extendedreports/index.xlsx").toURI());
    }
}
