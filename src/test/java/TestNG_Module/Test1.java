package TestNG_Module;

import org.testng.annotations.Test;

import com.ofos.Generics.BaseClass;

public class Test1 extends BaseClass {
	
	@Test(groups="Smoke")
	public void createContact() {
		System.out.println("--created Contact successfully");
	}
	
	@Test
	public void editContact() {
		System.out.println("--edit Contact successfully");
	}
	
	@Test
	public void deleteContact() {
		System.out.println("--delete Contact successfully");
	}

}
