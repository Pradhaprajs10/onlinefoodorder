package TestNG_Module;

import static org.junit.Assert.assertNotNull;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.Assert.*;

public class HardAssertTest {
	
	@Test
	public void tc01() {
		System.out.println("---step 1");
		System.out.println("---step 2");
		assertEquals("a","b","statement is mismatching");
		System.out.println("---step 3");
		System.out.println("---step 4");
	}
	
	@Test
	public void tc02() {
		System.out.println("---step 5");
		System.out.println("---step 6");
		int a=3;
		assertNotNull(a);
		System.out.println("---step 7");
		System.out.println("---step 8");
	}
	
	@Test
	public void titleMatching() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String expTitle = "Google";
		String actTitle = driver.getTitle();
		assertEquals(actTitle, expTitle, "title is not matching");
		driver.close();
	}

}
