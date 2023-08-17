package admin_module;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.ofos.Generics.DatabaseUtility;
import com.ofos.Generics.ExcelUtility;
import com.ofos.Generics.FileUtility;
import com.ofos.Generics.JavaUtility;
import com.ofos.Generics.WebDriverUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginAsAdminTest {
public static void main(String[] args) throws IOException {
		
		DatabaseUtility dLib = new DatabaseUtility();
		FileUtility fLib = new FileUtility();
		ExcelUtility eLib = new ExcelUtility();
		JavaUtility jLib = new JavaUtility();
		WebDriverUtility wLib = new WebDriverUtility();
		
		WebDriver driver;
		//get the data from property file
		FileInputStream fis = new FileInputStream("./src/test/resources/commondata.properties");
		Properties p = new Properties();
		p.load(fis);
		String BROWSER = p.getProperty("browser");
	    String URL = p.getProperty("url");
	    String USERNAME= p.getProperty("username");
	    String PASSWORD = p.getProperty("password");
	    
	    if(BROWSER.equalsIgnoreCase("chrome")) {
	    	WebDriverManager.chromedriver().setup();
	    	driver = new ChromeDriver();
	    }
	    else {
	    	WebDriverManager.firefoxdriver().setup();
	    	driver = new FirefoxDriver();
	    }
	    wLib.maximizeBrowser(driver); 
	    
	    driver.get(URL);
	    
	    wLib.implicitWait(driver);
	    
	    //Enter the username
	    driver.findElement(By.name("username")).sendKeys(USERNAME);
	    //Enter the password
	    driver.findElement(By.name("password")).sendKeys(PASSWORD);
	    //Click on login button
	    driver.findElement(By.name("submit")).click();
	    	
	}

}


