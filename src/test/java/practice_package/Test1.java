package practice_package;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.ofos.Generics.BaseClass;

import org.testng.annotations.Test;

public class Test1 extends BaseClass {
	
	@Test
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
