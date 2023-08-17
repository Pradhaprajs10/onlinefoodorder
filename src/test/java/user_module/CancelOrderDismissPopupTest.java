package user_module;

import org.testng.annotations.Test;

import com.ofos.Generics.BaseClass;
import com.ofos.objectrepository.CheckoutPage;
import com.ofos.objectrepository.DishesPage;
import com.ofos.objectrepository.UserHomePage;

public class CancelOrderDismissPopupTest extends BaseClass {
	
	  @Test
	    public void dismissPopupTest() {
		  
	    //click on dishes
	    UserHomePage uhp = new UserHomePage(driver);
	    uhp.clickonYorkshireLambPatties();
      
	    //click on addToCart
        DishesPage dp = new DishesPage(driver);
        dp.dishes(driver);
      
        //click on order button
        CheckoutPage cp = new CheckoutPage(driver);
        cp.order(driver);
      
      
      
	  }
}
