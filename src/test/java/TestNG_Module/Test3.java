package TestNG_Module;

import org.testng.annotations.Test;

import com.ofos.Generics.BaseClass;

public class Test3 extends BaseClass {
	
	@Test
	public void createOrderTest() {
		System.out.println("--created order successfully");
	}
	
	@Test(groups="Regression")
	public void editOrderTest() {
		System.out.println("--edit order successfully");
	}
	
	@Test(groups="RegionalRegression")
	public void deleteOrderTest() {
		System.out.println("--delete order successfully");
	}

}
