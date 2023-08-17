package practice_package;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakeMyTrip {
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.bookmytrip.co/");
		driver.findElement(By.id("mytrip_city_from")).sendKeys("Bengaluru");
		Thread.sleep(2000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		driver.findElement(By.id("mytrip_city_to")).sendKeys("Dubai");
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		driver.findElement(By.id("from")).click();
		driver.findElement(By.xpath("//span[text()='July']/ancestor::div[@class='ui-datepicker-group ui-datepicker-group-first']/descendant::a[text()='30']")).click();
		
		driver.findElement(By.id("to")).click();
		driver.findElement(By.xpath("//span[text()='August']/ancestor::div[@class='ui-datepicker-group ui-datepicker-group-last']/descendant::a[text()='8']")).click();
		
		driver.findElement(By.id("travller_search")).click();
		driver.findElement(By.xpath("//label[text()='First']")).click();
		driver.findElement(By.id("done_traveller")).click();
		
		driver.findElement(By.xpath("//button[text()='Search']")).click();			
	}	
}
