package practice_package;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BookingFlight {
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		 WebDriver driver;
	   	 WebDriverManager.chromedriver().setup();
	   	 driver = new ChromeDriver();
	   	 driver.manage().window().maximize();
	   	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	   	 driver.get("https://www.kayak.co.in/");
	   	 
	   	 driver.findElement(By.xpath("//input[@aria-label='Flight origin input']")).sendKeys("Bengaluru");
	   	 Robot r =new Robot();
		// r.keyPress(KeyEvent.VK_ENTER);
		// r.keyRelease(KeyEvent.VK_ENTER);
		 Thread.sleep(3000);
	   	 driver.findElement(By.xpath("//input[@aria-label='Flight destination input']")).sendKeys("Australia");
	   	 Thread.sleep(3000);
	   	 r.keyPress(KeyEvent.VK_ENTER);
	   	 r.keyRelease(KeyEvent.VK_ENTER);
	   	 driver.findElement(By.xpath("//span[@class='sR_k-value']")).click();
	   	 driver.findElement(By.xpath("//div[text()='August 2023']/ancestor::div[@class='onx_ onx_-pres-mcfly onx_-double']/descendant::div[text()='24']")).click();
	   	 
	   	 driver.findElement(By.xpath("//span[@class='sR_k-value']")).click();
	     driver.findElement(By.xpath("//div[text()='September 2023']/ancestor::div[@class='onx_ onx_-pres-mcfly onx_-double']/descendant::div[text()='12']")).click();
	   	 
	   	 driver.findElement(By.xpath("//button[@aria-label='Search']")).click();
	   	 
	   	 
	   	 
	   	 
	   	 
	   	 
	   	 
	   	 
	   	 
	}

}
