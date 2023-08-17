package practice_package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalendarPopup {
	public static void main(String[] args) {
	    String MonthandYear = "July 2023";
		int date = 28;
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.goibibo.com/");
		driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
	    String actualDate = "//div[text()='"+MonthandYear+"']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='"+date+"']";
		String arrowButton = "//span[@aria-label='Next Month']";
		
		for(;;) {
			try{
				driver.findElement(By.xpath(actualDate)).click();
				break;
			}
			catch(Exception e) {
				driver.findElement(By.xpath(arrowButton)).click();
			}		
		}
		    driver.findElement(By.xpath("//span[text()='Done']")).click();
		    driver.findElement(By.xpath("//a[text()='Cancel']")).click();
		
	}

}
