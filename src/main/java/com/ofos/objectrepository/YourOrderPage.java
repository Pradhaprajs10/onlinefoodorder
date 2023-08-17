package com.ofos.objectrepository;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import org.openqa.selenium.By;
import org.testng.Assert.*;
import org.testng.Reporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class YourOrderPage {
	
	public YourOrderPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void confirmOrder(WebDriver  driver) {
		String expOrder = "Yorkshire Lamb Patties";
	    String actOrder = driver.findElement(By.xpath("//th[text()='Item']/ancestor::div[@class='container']/descendant::td[contains(text(),' Yorkshire Lamb Patties')]")).getText();    
	    assertEquals(actOrder, expOrder);
	    Reporter.log("order has been placed successfully", true);
	}
	
	public void cancelOrder(WebDriver  driver) {
		String expOrder = "Yorkshire Lamb Patties";
		String actOrder =driver.findElement(By.xpath("//th[text()='Item']/ancestor::div[@class='container']/descendant::td[contains(text(),' Chicken Madeira')]")).getText();
		assertEquals(actOrder, expOrder);
		Reporter.log("order has been cancelled successfully", true);
	}
}
