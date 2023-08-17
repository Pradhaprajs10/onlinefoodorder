package practice_package;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FetchCountryMatchName {
       public static void main(String[] args) {
		
    	     WebDriver driver;
    		 WebDriverManager.chromedriver().setup();
    		 driver = new ChromeDriver();
    	   	 driver.manage().window().maximize();
    	   	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    	   	 driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/t20i");
    	   	  List<WebElement> countryName = driver.findElements(By.xpath("(//table//tr[*]//td[2]/span[2])[position()<11]"));
    	   	 System.out.println(countryName.size());
    	   	 for(int i=0; i<countryName.size(); i++) {
    	   		System.out.println(countryName.get(i).getText());
    	   	 }
	}
}
