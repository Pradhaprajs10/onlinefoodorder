package practice_package;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	@DataProvider()
	public Object[][] data1() {
		Object[][] obj = new Object[2][2];
		obj[0][0]="salem";
		obj[0][1]= 200;
		
		obj[1][0]="coimbatore";
		obj[1][1]=400;
		return obj;		
	}
	
	@DataProvider()
	public Object[][] data2() {
		Object[][] obj = new Object[2][3];
		obj[0][0]="Bangalore";
		obj[0][1]= 200;
		obj[0][2]="Bestplace";
		
		obj[1][0]="chennai";
		obj[1][1]=400;
		obj[1][2]="Goodplace";
		return obj;		
	}
	
	@DataProvider()
	public Object[][] data3() {
		Object[][] obj = new Object[3][3];
		obj[0][0]="Bangalore";
		obj[0][1]= 200;
		obj[0][2]="Itpark";
		
		obj[1][0]="chennai";
		obj[1][1]=400;
		obj[1][2]="marinabeach";
		
		obj[2][0]="pune";
		obj[2][1]=1000;
		obj[2][2]="saitemple";
		return obj;	
		
	}
}
