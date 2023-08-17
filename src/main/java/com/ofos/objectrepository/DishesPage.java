package com.ofos.objectrepository;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import org.openqa.selenium.By;
import org.testng.Assert.*;
import org.testng.Reporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DishesPage {
	
	@FindBy(xpath="//a[text()='Yorkshire Lamb Patties']/ancestor::div[@class='food-item']/descendant::input[@class='btn theme-btn']")
	private WebElement addToCartBtn;
	
	@FindBy(linkText="Checkout")
	private WebElement checkoutBtn;
	
	public DishesPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddToCartBtn() {
		return addToCartBtn;
	}

	public WebElement getCheckoutBtn() {
		return checkoutBtn;
	}
	
	public void dishes(WebDriver driver) {
		addToCartBtn.click();
		String expDishes= "Yorkshire Lamb Patties";
		String actDishes = driver.findElement(By.xpath("//div[contains(text(),'Yorkshire Lamb Patties')]")).getText();
		assertEquals(actDishes, expDishes);
		Reporter.log("dishes added to cart successfully", true);
		checkoutBtn.click();
	}

}
