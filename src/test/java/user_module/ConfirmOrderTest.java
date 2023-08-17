package user_module;

import static org.testng.Assert.fail;

import java.io.FileInputStream;

import java.util.HashMap;
import java.util.Map.Entry;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
import com.ofos.objectrepository.YourOrderPage;
import org.testng.Assert.*;

import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(com.ofos.Generics.ListenerImplementation.class)
public class ConfirmOrderTest extends BaseClass {
	
	    @Test
	    public void confirmOrderTest() {
	    
	    //click on dishes
	    UserHomePage uhp = new UserHomePage(driver);
	    uhp.clickonYorkshireLambPatties();
        
	    //click on addToCart
        DishesPage dp = new DishesPage(driver);
        dp.dishes(driver);
        
        fail();
        //click on order button
        CheckoutPage cp = new CheckoutPage(driver);
        cp.order(driver);
        
        wLib.acceptAlert(driver);
        wLib.explicitWaitAlert(driver);
        wLib.acceptAlert(driver);
        
        // order confirm
        YourOrderPage op = new YourOrderPage(driver);
        op.confirmOrder(driver);
             
	}
	}


