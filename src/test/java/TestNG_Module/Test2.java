package TestNG_Module;

import org.testng.annotations.Test;

import com.ofos.Generics.BaseClass;

public class Test2 extends BaseClass {
	
	@Test(groups="Smoke")
	public void createOrder() {
		System.out.println("--created order successfully");
	}
	
	@Test
	public void editOrder() {
		System.out.println("--edit order successfully");
	}
	
	@Test
	public void deleteOrder() {
		System.out.println("--delete order successfully");
	}


}
