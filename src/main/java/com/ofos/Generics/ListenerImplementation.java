package com.ofos.Generics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenerImplementation implements ITestListener {
	
     ExtentReports reports;
     ExtentTest test;
     
	@Override
	public void onTestStart(ITestResult result) {
		
		// Exception start from here
		String methodName = result.getMethod().getMethodName();
		test = reports.createTest(methodName);
		Reporter.log(methodName+"-----> Testscript execution started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		test.log(Status.PASS, methodName+" --->Passed");
		Reporter.log(methodName+ "----->Testscript Passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		String fScript = result.getMethod().getMethodName();
		String failedScript = fScript+new JavaUtility().getSystemDateFormat();
		EventFiringWebDriver efw = new EventFiringWebDriver(BaseClass.sdriver);
		File src = efw.getScreenshotAs(OutputType.FILE);
		File des = new File("./screenshot/"+failedScript+".png");
		try {
			FileUtils.copyFile(src, des);
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(Status.FAIL, fScript+"----> Failed");
		test.log(Status.FAIL, result.getThrowable());
		Reporter.log(fScript+"----> Testscript Failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		String methodName = result.getMethod().getMethodName();
		test.log(Status.SKIP, methodName+"----> Skipped");
		test.log(Status.SKIP, result.getThrowable());
		Reporter.log(methodName+"---->Testscript Skipped");
	}

	@Override
	public void onStart(ITestContext context) {
		
		//create html report
		ExtentSparkReporter htmlReport = new ExtentSparkReporter("./ExtentReports/report.html");
		htmlReport.config().setDocumentTitle("SDET-50");
		htmlReport.config().setTheme(Theme.STANDARD);
		htmlReport.config().setReportName("Food-Order");
		
	    reports = new ExtentReports();
	    reports.attachReporter(htmlReport);
	    reports.setSystemInfo("OS", "Windows");
	    reports.setSystemInfo("Base-Browser", "chrome");
	    reports.setSystemInfo("Base-url", "http://localhost:8888/");
	    reports.setSystemInfo("reporter Name", "Pradhapraj");
	}

	@Override
	public void onFinish(ITestContext context) {
		
		//consolidate the report
		reports.flush();
	}
	

}
