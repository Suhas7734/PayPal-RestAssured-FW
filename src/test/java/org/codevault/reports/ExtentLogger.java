package org.codevault.reports;

import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

public final class ExtentLogger {

    private ExtentLogger(){}

    public static void pass(String message){
        ExtentManager.getExtent().pass(message);
    }

    public static void fail(String message){
        ExtentManager.getExtent().fail(MarkupHelper.createLabel(message, ExtentColor.RED));
    }

    public static void skip(String message){
        ExtentManager.getExtent().skip(message);
    }

    public static void info(String message){
        ExtentManager.getExtent().info(message);
    }

    public static void logResponse(String message){
        ExtentManager.getExtent().pass(MarkupHelper.createCodeBlock(message, CodeLanguage.JSON));
    }

}
