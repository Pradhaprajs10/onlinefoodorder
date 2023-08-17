package TestNG_Module;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertTest {
	
	@Test
	public void tc01() {
		System.out.println("---step 1");
		System.out.println("---step 2");
		SoftAssert sa = new SoftAssert();
		sa.assertEquals("a", "b");
		System.out.println("---step 3");
		System.out.println("---step 4");
		sa.assertAll();
	}
	
	@Test
	public void tc02() {
		System.out.println("---step 5");
		System.out.println("---step 6");
		int a=3;
		SoftAssert sa = new SoftAssert();
		sa.assertNull(a);
		System.out.println("---step 7");
		System.out.println("---step 8");
		sa.assertAll();
	}

}
