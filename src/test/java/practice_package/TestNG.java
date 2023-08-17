package practice_package;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.ofos.Generics.BaseClass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNG extends BaseClass {
	
    @Test
	public void openBrowser() {
		System.out.println("--openBrowser--");
	}
	
	@Test
	public void closeBrowser() {
		System.out.println("--closeBrowser--");
	}
	
	@Test
		public void loginToApp() {
			System.out.println("--loginToApp--");
		}
	
	@AfterMethod()
	public void logoutToApp() {
		System.out.println("--logoutToApp--");
	}
	
	@Test
	
	public void data1() {
		System.out.println("--data--");
	}
    @Test
	
	public void data2() {
		System.out.println("--data2--");
	}

}
