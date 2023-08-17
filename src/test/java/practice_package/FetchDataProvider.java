package practice_package;

import org.testng.annotations.Test;

public class FetchDataProvider {
	
	@Test(dataProviderClass = DataProviderTest.class, dataProvider = "data1")
	public void getData(String loc, int cost) {
		System.out.println("Location--->"+loc+"--->Travelling Cost "+cost);
	}
	
	@Test(dataProviderClass = DataProviderTest.class, dataProvider = "data2")
	public void getData1(String loc, int cost, String place) {
		System.out.println("Location--->"+loc+"--->Travelling Cost "+cost+"---->"+place);
	}
	@Test(dataProviderClass = DataProviderTest.class, dataProvider = "data3")
	public void getData2(String loc, int cost, String place) {
		System.out.println("Location--->"+loc+"--->Travelling Cost "+cost+"---->"+place);
	}
}
