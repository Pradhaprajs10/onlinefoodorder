package com.ofos.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddRestaurantPage {
	
	@FindBy(name="res_name")
	private WebElement restaurantName;
	
	@FindBy(name="email")
	private WebElement bussinessEmail;
	
	@FindBy(name="phone")
	private WebElement phoneNo;
	
	@FindBy(name="url")
	private WebElement websiteUrl;
	
	@FindBy(name="o_hr")
	private WebElement openHours ;
	
	@FindBy(name="c_hr")
	private WebElement closeHours ;
	
	@FindBy(name="o_days")
	private WebElement openDays ;
	
	@FindBy(name="file")
	private WebElement fileImage;
	
	@FindBy(name="c_name")
	private WebElement selectCategory;
	
	@FindBy(name="address")
	private WebElement restaurantAddress;
	
	@FindBy(xpath="//input[@value='Save']")
	private WebElement saveBtn;
	
	public AddRestaurantPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getRestaurantName() {
		return restaurantName;
	}

	public WebElement getBussinessEmail() {
		return bussinessEmail;
	}

	public WebElement getPhoneNo() {
		return phoneNo;
	}

	public WebElement getWebsiteUrl() {
		return websiteUrl;
	}

	public WebElement getOpenHours() {
		return openHours;
	}

	public WebElement getCloseHours() {
		return closeHours;
	}

	public WebElement getOpenDays() {
		return openDays;
	}

	public WebElement getFileImage() {
		return fileImage;
	}

	public WebElement getSelectCategory() {
		return selectCategory;
	}

	public WebElement getRestaurantAddress() {
		return restaurantAddress;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}

	
	
	
	

}
