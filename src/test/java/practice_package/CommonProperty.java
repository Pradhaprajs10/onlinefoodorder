package practice_package;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonProperty {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\commondata.properties");
		Properties p = new Properties();
		p.load(fis);
		
	   String URL = p.getProperty("url");
	   String BROWSER = p.getProperty("browser");
	   String USERNAME = p.getProperty("username");
	   String PASSWORD = p.getProperty("password");
	   
	   WebDriver driver;
	   
	   if(BROWSER.equalsIgnoreCase("chrome")) {
		   WebDriverManager.chromedriver().setup();
		   driver = new ChromeDriver();
	   }
	   else if (BROWSER.equalsIgnoreCase("firefox")) {
		   WebDriverManager.firefoxdriver().setup();
		   driver = new FirefoxDriver();
	   }
	   else {
		   driver = new ChromeDriver();
	   }
	   
	   driver.get(URL);
	   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	   driver.findElement(By.name("username")).sendKeys(USERNAME);
	   driver.findElement(By.name("password")).sendKeys(PASSWORD);
	   driver.findElement(By.name("submit")).click();		
	}

}
