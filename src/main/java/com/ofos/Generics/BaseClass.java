package com.ofos.Generics;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.ofos.objectrepository.AdminDashboardPage;
import com.ofos.objectrepository.AdminLoginPage;
import com.ofos.objectrepository.UserHomePage;
import com.ofos.objectrepository.UserLoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public DatabaseUtility dLib = new DatabaseUtility();
	public FileUtility fLib = new FileUtility();
	public ExcelUtility eLib = new ExcelUtility();
	public JavaUtility jLib = new JavaUtility();
	public WebDriverUtility wLib = new WebDriverUtility();
	
	public WebDriver driver;
	public static WebDriver sdriver;
	
//	@BeforeSuite()
//	public void config_BS() throws Throwable {
//		dLib.connectToDatabase();
//		System.out.println("--connectToDatabase--");
//	}
	@BeforeClass
	public void config_BC() throws Throwable {
		System.out.println("---open browser---");
		String BROWSER = fLib.getPropertyData("browser");
		
		if(BROWSER.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		 }
		else {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		sdriver = driver;
		wLib.maximizeBrowser(driver);
		
	}
	
	@BeforeMethod
	public void config_BM() throws Throwable {
		System.out.println("---Login to application---");
		String USERNAME = fLib.getPropertyData("username");
		String PASSWORD = fLib.getPropertyData("password");
		String URL = fLib.getPropertyData("url");
		
		driver.get(URL);
		wLib.implicitWait(driver);
		
		UserLoginPage ulp = new UserLoginPage(driver);
	    ulp.userLogin(USERNAME, PASSWORD);		
		 
	}
	
	@AfterMethod
	public void config_AM() {
		System.out.println("---Logout to application---");
		UserHomePage uhp = new UserHomePage(driver);
	    uhp.logout();
		
	}
	@AfterClass
	public void config_AC() {
		System.out.println("--close browser--");
		wLib.closeBrowser(driver);
	}
	
//	@AfterSuite()
//	public void config_AS() throws Throwable {
//        dLib.closeDBConnection();
//        System.out.println("close the DB");
//	}

}
