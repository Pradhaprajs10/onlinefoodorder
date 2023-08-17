package user_module;

import static org.testng.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ofos.Generics.BaseClass;
import com.ofos.Generics.DatabaseUtility;
import com.ofos.Generics.ExcelUtility;
import com.ofos.Generics.FileUtility;
import com.ofos.Generics.JavaUtility;
import com.ofos.Generics.WebDriverUtility;
import com.ofos.objectrepository.CheckoutPage;
import com.ofos.objectrepository.DishesPage;
import com.ofos.objectrepository.UserHomePage;
import com.ofos.objectrepository.UserLoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DismissPopupTest extends BaseClass {
	
	    @Test
	    public void dismissPopupTest() {
	    //click on dishes
	    UserHomePage uhp = new UserHomePage(driver);
	    uhp.clickonYorkshireLambPatties();
        
	    fail();
	    //click on addToCart
        DishesPage dp = new DishesPage(driver);
        dp.dishes(driver);
        
        //click on order button
        CheckoutPage cp = new CheckoutPage(driver);
        cp.order(driver);
        
        wLib.dismissAlert(driver);
        
        uhp.logout();
        
	}

}
