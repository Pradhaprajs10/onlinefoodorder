package practice_package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakeMyTrip1 {
	public static void main(String[] args) {
		String MonthandYear = "October 2023";
		int date = 5;
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		driver.navigate().refresh();
		
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		String actualDate = "//div[text()='"+MonthandYear+"']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='"+date+"']";
		String nextArrow = "//span[@aria-label='Next Month']";
		
		for(;;) {
			try {
				driver.findElement(By.xpath(actualDate)).click();
				break;
			}
			catch(Exception e) {
				driver.findElement(By.xpath(nextArrow)).click();
			}
		}
		driver.close();
	}

}
