package admin_module;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.ofos.Generics.BaseClass;
import com.ofos.Generics.DatabaseUtility;
import com.ofos.Generics.ExcelUtility;
import com.ofos.Generics.FileUtility;
import com.ofos.Generics.JavaUtility;
import com.ofos.Generics.WebDriverUtility;
import com.ofos.objectrepository.AddCategoryPage;
import com.ofos.objectrepository.AdminDashboardPage;
import com.ofos.objectrepository.AdminLoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddCategoryTest extends BaseClass {
	    @Test
	    public void addCategoryTest() {
	    	
	    AdminDashboardPage adp = new AdminDashboardPage(driver);
	    adp.clickOnRestuarant();
    
	    AddCategoryPage acp = new AddCategoryPage(driver);
	    acp.clickOnSave();
	    acp.addCategoryResult(driver);
	    
}
}
