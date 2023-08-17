package practice_package;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FetchCountryGreaterThan30 {
	public static void main(String[] args) {
		
	     WebDriver driver;
		 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
	   	 driver.manage().window().maximize();
	   	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	   	 driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/t20i");
         List<WebElement> fetchCountry = driver.findElements(By.xpath("//span[text()='Team']/ancestor::table[@class='table']//tr[*]//td[3][@class='rankings-block__banner--matches' and .>30]"));
	   	  System.out.println(fetchCountry.size());
	   	  
	   	  for(int i=0; i<fetchCountry.size(); i++) {
	   		String countryName = fetchCountry.get(i).getText();
	   		  System.out.println(countryName);	   		  
	   	  }
	   	  driver.close();
	}
}
