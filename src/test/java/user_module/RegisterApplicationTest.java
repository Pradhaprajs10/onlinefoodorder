package user_module;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.ofos.Generics.BaseClass;
import com.ofos.Generics.DatabaseUtility;
import com.ofos.Generics.ExcelUtility;
import com.ofos.Generics.FileUtility;
import com.ofos.Generics.JavaUtility;
import com.ofos.Generics.WebDriverUtility;
import com.ofos.objectrepository.RegisterPage;
import com.ofos.objectrepository.UserLoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegisterApplicationTest extends BaseClass {
	    @Test
	    public void registerApplicationTest() {
	    // click on register
	    UserLoginPage ulp = new UserLoginPage(driver);
		ulp.clickonRegister();
		
		RegisterPage rp = new RegisterPage(driver);
		rp.enterAllRegisterField();
		//eLib.readMultipleData("RegisterApp", 0, 1), driver);
	    	    
	}

}
