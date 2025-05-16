package org.codevault.listeners;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.codevault.reports.ExtentLogger;
import org.codevault.reports.ExtentReport;
import org.testng.*;

public class TestListener implements ITestListener, ISuiteListener {

    private static final Logger logger = LogManager.getLogger(TestListener.class);

    public void onStart(ISuite context) {
        ExtentReport.initReports();
        logger.info("Test Suite Started");
    }

    public void onFinish(ISuite context) {
        ExtentReport.flushReports();
        logger.info("Test Suite Completed!");
    }

    public void onTestStart(ITestResult result) {
        ExtentReport.createTest(result.getName());
        logger.info("Test Started!! " + result.getMethod().getMethodName());
        logger.info("Description!! " + result.getMethod().getDescription());
    }

    public void onTestSuccess(ITestResult result) {
        ExtentLogger.pass(result.getName() + " is passed");
        logger.info("Test Passed!! " + result.getMethod().getMethodName());

    }

    public void onTestFailure(ITestResult result) {
        ExtentLogger.fail(String.valueOf(result.getThrowable()));
        logger.error("Test Failed!! " + result.getMethod().getMethodName());
        logger.error("Failure Description!! " + result.getMethod().getDescription());
    }

    public void onTestSkipped(ITestResult result) {
        ExtentLogger.skip(result.getName() + " is skipped");
        logger.info("Skipped!! " + result.getMethod().getMethodName());
    }
}
