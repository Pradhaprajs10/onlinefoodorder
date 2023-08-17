package com.ofos.objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
	
	@FindBy(name="submit")
	private WebElement ordernowBtn;
	
	public CheckoutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getOrdernowBtn() {
		return ordernowBtn;
	}
	
	public void order(WebDriver driver) {
		ordernowBtn.click();
		
	}
}
