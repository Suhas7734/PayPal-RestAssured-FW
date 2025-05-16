package org.codevault.reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public final class ExtentReport {


    private ExtentReport(){}

    private static ExtentReports extentReports;
    private static ExtentTest extentTest;

    public static ExtentTest getExtentTest() {
        return extentTest;
    }

    public static void setExtentTest(ExtentTest extentTest) {
        ExtentReport.extentTest = extentTest;
    }

    public static void initReports(){
        extentReports = new ExtentReports();
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter("index.html");
        extentReports.attachReporter(sparkReporter);
        sparkReporter.config().setTheme(Theme.STANDARD);
        sparkReporter.config().setDocumentTitle("PayPal API Test Reports");
        sparkReporter.config().setReportName("API TEST REPORT");
    }

    public static void flushReports(){
        extentReports.flush();
    }

    public static void createTest(String testCaseName){
        extentTest = extentReports.createTest(testCaseName);
        ExtentManager.setExtentTest(extentTest);
    }


}
