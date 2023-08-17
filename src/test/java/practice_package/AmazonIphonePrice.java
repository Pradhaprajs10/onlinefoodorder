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

public class AmazonIphonePrice {
     public static void main(String[] args) throws AWTException {
		
    	 WebDriver driver;
    	 WebDriverManager.chromedriver().setup();
    	 driver = new ChromeDriver();
    	 driver.manage().window().maximize();
    	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    	 driver.get("https://www.amazon.in/");
    	 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
    	 Robot r =new Robot();
    	 r.keyPress(KeyEvent.VK_ENTER);
    	 r.keyRelease(KeyEvent.VK_ENTER);
    	 List<WebElement> iphoneName = driver.findElements(By.xpath("//h2[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']"));
    	 List<WebElement> iphonePrice = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
    	 
    	 int countIphone = iphoneName.size();
    	 int countPrice = iphonePrice.size();
    	 System.out.println(countIphone);
    	 System.out.println(countPrice);
    	 
    	 for(int i=0; i<countIphone; i++) {
    		 String product = iphoneName.get(i).getText();
    		 String price = iphonePrice.get(i).getText();
    		 System.out.println(product+"----->"+price);
    	 }
    	 driver.close();
	}
}
