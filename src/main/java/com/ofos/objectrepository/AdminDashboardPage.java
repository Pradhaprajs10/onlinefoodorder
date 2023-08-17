package com.ofos.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminDashboardPage {
	
	@FindBy(xpath="//span[text()='Restaurant']")
	private WebElement restaurantDropdown;
	
	@FindBy(xpath="//span[text()='Dashboard']")
	private WebElement dashboardBtn;
	
	@FindBy(xpath="//span[text()='Users']")
	private WebElement usersBtn;
	
	@FindBy(xpath="//span[text()='Menu']")
	private WebElement menuBtn;
	
	@FindBy(xpath="//span[text()='Orders']")
	private WebElement ordersBtn;
	
	@FindBy(xpath="//a[text()='All Restaurant']")
	private WebElement allRestaurantLink;
	
	@FindBy(xpath="//a[text()='Add Category']")
	private WebElement addCategoryLink;
	
	@FindBy(xpath="//a[text()='Add Restaurant']")
	private WebElement addRestaurantLink;
	
	@FindBy(xpath="//a[text()='Add Menues']")
	private WebElement addMenuesLink;
	
	@FindBy(xpath="//a[text()='Add Menu']")
	private WebElement addMenuLink;
	
	@FindBy(xpath="//img[@class='profile-pic']")
	private WebElement logoutImg;
	
	@FindBy(xpath="//a[@href='logout.php']")
	private WebElement logoutBtn;
		
	public AdminDashboardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getRestaurantDropdown() {
		return restaurantDropdown;
	}

	public WebElement getDashboardBtn() {
		return dashboardBtn;
	}

	public WebElement getUsersBtn() {
		return usersBtn;
	}

	public WebElement getMenuBtn() {
		return menuBtn;
	}

	public WebElement getOrdersBtn() {
		return ordersBtn;
	}

	public WebElement getAllRestaurantLink() {
		return allRestaurantLink;
	}

	public WebElement getAddCategoryLink() {
		return addCategoryLink;
	}

	public WebElement getAddRestaurantLink() {
		return addRestaurantLink;
	}

	public WebElement getAddMenuesLink() {
		return addMenuesLink;
	}

	public WebElement getAddMenuLink() {
		return addMenuLink;
	}
	
	public WebElement getLogoutImg() {
		return logoutImg;
	}
	
	public WebElement getLogoutBtn() {
		return logoutImg;
	}

	public void clickOnRestuarant() {
		restaurantDropdown.click();
		addCategoryLink.click();
 	}
	public void clickOnRestaurantCategory() {
		restaurantDropdown.click();
		addRestaurantLink.click();
	}
	
	public void clickOnLogout() {
		logoutImg.click();
		logoutBtn.click();
	}
	
}
