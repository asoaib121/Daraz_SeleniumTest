package Daraz.reports;

import Daraz.Enums.AuthorType;
import Daraz.Enums.CategoryType;
import Daraz.constants.FrameworkConstants;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

public class ExtentReport {
    private ExtentReport() {}

    private static ExtentReports extent;
    public static ExtentTest test;

    //client or vendor A
    public static void initReports()  {
        if(Objects.isNull(extent)) {

            extent= new ExtentReports();
            ExtentSparkReporter spark =new ExtentSparkReporter(FrameworkConstants.getExtentReportFilePath());
            extent.attachReporter(spark);
            spark.config().setTheme(Theme.STANDARD);
            spark.config().setDocumentTitle("TMB Report");
            spark.config().setReportName("Daraz Testing");
        }
    }

    public static void flushReports()  {
        if(Objects.nonNull(extent)) {
            extent.flush();
        }
        ExtentManager.unload();
        try {
            Desktop.getDesktop().browse(new File(FrameworkConstants.getExtentReportFilePath()).toURI());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void createTest(String testcasename) {
        ExtentManager.setExtentTest(extent.createTest(testcasename));
    }

    public static void addAuthors (AuthorType[] authors){
        for(AuthorType temp:authors) {
        ExtentManager.getExtentTest().assignAuthor(temp.toString()); }
    }

    public static void addCategories (CategoryType[] categories){
        for(CategoryType temp:categories) {
        ExtentManager.getExtentTest().assignCategory(temp.toString()); }
    }
}
