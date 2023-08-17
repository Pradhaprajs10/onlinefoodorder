package admin_module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.ofos.Generics.DatabaseUtility;
import com.ofos.Generics.ExcelUtility;
import com.ofos.Generics.FileUtility;
import com.ofos.Generics.JavaUtility;
import com.ofos.Generics.WebDriverUtility;
import com.ofos.objectrepository.AddCategoryPage;
import com.ofos.objectrepository.AdminDashboardPage;
import com.ofos.objectrepository.AdminLoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CancelCategoryTest {
	public static void main(String[] args) throws Throwable {
		
		DatabaseUtility dLib = new DatabaseUtility();
		FileUtility fLib = new FileUtility();
		ExcelUtility eLib = new ExcelUtility();
		JavaUtility jLib = new JavaUtility();
		WebDriverUtility wLib = new WebDriverUtility();
		
		WebDriver driver;
		
		String BROWSER = fLib.getPropertyData("browser");
	    String URL = fLib.getPropertyData("url");
	    String USERNAME= fLib.getPropertyData("username");
	    String PASSWORD = fLib.getPropertyData("password");
	    
	    if(BROWSER.equalsIgnoreCase("chrome")) {
	    	WebDriverManager.chromedriver().setup();
	    	driver = new ChromeDriver();
	    }
	    else {
	    	WebDriverManager.firefoxdriver().setup();
	    	driver = new FirefoxDriver();
	    }
	    wLib.maximizeBrowser(driver);
	    
	    driver.get(URL);
	    
	    wLib.implicitWait(driver);
	    
	    AdminLoginPage alp = new AdminLoginPage(driver);
	    alp.adminLogin(USERNAME, PASSWORD);
	    
	    AdminDashboardPage adp = new AdminDashboardPage(driver);
	    adp.clickOnRestuarant();
    
	    AddCategoryPage acp = new AddCategoryPage(driver);
	    acp.clickOnCancel();
	    
	    wLib.closeBrowser(driver);
	}

}
