package practice_package;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SamsungPhonePrice {
	public static void main(String[] args) throws AWTException {
		
	 WebDriver driver;
   	 WebDriverManager.chromedriver().setup();
   	 driver = new ChromeDriver();
   	 driver.manage().window().maximize();
   	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
   	 driver.get("https://www.flipkart.com/");
   	// driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
   	 driver.findElement(By.name("q")).sendKeys("samsung");
   	 
   	 Robot r =new Robot();
	 r.keyPress(KeyEvent.VK_ENTER);
	 r.keyRelease(KeyEvent.VK_ENTER);
	 
   	 List<WebElement> samsungPhone = driver.findElements(By.xpath("//a[@class='s1Q9rs']"));
     List<WebElement> samsungPrice = driver.findElements(By.xpath("//div[@class='_30jeq3']"));
      
     int count1 = samsungPhone.size();
     int count2 = samsungPrice.size();
     System.out.println(count1);
     System.out.println(count2);
     for(int i=0; i<count1; i++) {
    	 String phone = samsungPhone.get(i).getText();
    	 String price = samsungPrice.get(i).getText();
    	 
    	 System.out.println(phone+"---->"+price);    	 
     }
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
	}

}
