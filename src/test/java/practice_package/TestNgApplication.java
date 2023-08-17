package practice_package;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.ofos.Generics.BaseClass;
import com.ofos.objectrepository.CheckoutPage;
import com.ofos.objectrepository.DishesPage;
import com.ofos.objectrepository.UserHomePage;
import com.ofos.objectrepository.YourOrderPage;

public class TestNgApplication extends BaseClass {
	
	WebDriver driver;
	@Test
	public void tc01() {
		System.out.println("Order Successful");
		UserHomePage uhp = new UserHomePage(driver);
	    uhp.clickonYorkshireLambPatties();
	    
	    DishesPage dp = new DishesPage(driver);
        dp.dishes(driver);
        
        CheckoutPage cp = new CheckoutPage(driver);
        cp.order(driver);
        wLib.acceptAlert(driver);
        wLib.explicitWaitAlert(driver);
        wLib.acceptAlert(driver);
        
        YourOrderPage op = new YourOrderPage(driver);
        op.confirmOrder(driver);
        
	}

}
