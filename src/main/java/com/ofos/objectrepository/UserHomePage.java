package com.ofos.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserHomePage {
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logoutBtn;
	
	@FindBy(xpath="//a[text()='Restaurants ']")
	private WebElement restaurantBtn;
	
	@FindBy(xpath="//a[text()='My Orders']")
	private WebElement myOrderBtn;

	@FindBy(xpath="//a[text()='Yorkshire Lamb Patties']")
	private WebElement yorkshireLambPatties;
	
	@FindBy(xpath="//a[text()='Lobster Thermidor']")
	private WebElement lobsterThermidorDishes;
	
	@FindBy(xpath="//a[text()='Chicken Madeira']")
	private WebElement chickenMadeiraDishes;
	
	@FindBy(xpath="//a[text()='Stuffed Jacket Potatoes']")
	private WebElement stuffedJacketPotatoesDishes;
	
	@FindBy(xpath="//a[text()='PinkSpaghettiGamberoni']")
	private WebElement pinkSpaghettiGamberoniDishes;
	
	@FindBy(xpath="//a[text()='Cheesy Mashed Potato']")
	private WebElement cheesyMashedPotatoDishes;

	public UserHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getRestaurantBtn() {
		return restaurantBtn;
	}
	
	public WebElement getMyOrderBtn() {
		return myOrderBtn;
	}
	
	public WebElement getLogoutBtn() {
		return logoutBtn;
	}

	public WebElement getYorkshireLambPatties() {
		return yorkshireLambPatties;
	}

	public WebElement getLobsterThermidorDishes() {
		return lobsterThermidorDishes;
	}

	public WebElement getChickenMadeiraDishes() {
		return chickenMadeiraDishes;
	}

	public WebElement getStuffedJacketPotatoesDishes() {
		return stuffedJacketPotatoesDishes;
	}

	public WebElement getPinkSpaghettiGamberoniDishes() {
		return pinkSpaghettiGamberoniDishes;
	}

	public WebElement getCheesyMashedPotatoDishes() {
		return cheesyMashedPotatoDishes;
	}
    
	// utilization
	
	public void clickOnRestaurant() {
		restaurantBtn.click();
	}
	
	public void clickOnMyOrder() {
		myOrderBtn.click();
	}
	
	public void clickonYorkshireLambPatties() {
		yorkshireLambPatties.click();
	}
	public void clickonLobsterThermidorDishes() {
		lobsterThermidorDishes.click();
	}
	
	public void clickonChickenMadeiraDishes() {
		chickenMadeiraDishes.click();
	}
	
	public void clickonStuffedJacketPotatoesDishes() {
		stuffedJacketPotatoesDishes.click();
	}
	
	public void clickonPinkSpaghettiGamberoniDishes() {
		pinkSpaghettiGamberoniDishes.click();
	}
	
	public void clickonCheesyMashedPotatoDishes() {
		cheesyMashedPotatoDishes.click();
	}
	
	public void logout() {
		logoutBtn.click();
	}

	
	

}
