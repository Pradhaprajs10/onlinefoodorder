package practice_package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FetchKabadiData {
	public static void main(String[] args) {
		
		WebDriver driver;
		 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
	   	 driver.manage().window().maximize();
	   	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	   	 driver.get("https://www.prokabaddi.com/standings");
	   	 String team = "Puneri Paltan";
	   	 String played = driver.findElement(By.xpath("//p[text()='"+team+"']/ancestor::div[@class='table-data team']/following-sibling::div[@class='table-data matches-play']/descendant::p[.='22']")).getText();
	     String won    = driver.findElement(By.xpath("//p[text()='"+team+"']/ancestor::div[@class='table-data team']/following-sibling::div[@class=\"table-data matches-won\"]/descendant::p[.='14']")).getText();
	   	 
	     System.out.println(played+"--->"+won);
	     
	     
	     
	     
	}

}
