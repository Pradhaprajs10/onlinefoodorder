package com.ofos.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserLoginPage {
	
	@FindBy(xpath="//a[text()='Home ']")
	private WebElement homeBtn;
	
	@FindBy(xpath="//a[text()='Restaurants ']")
	private WebElement restuarantBtn;
	
	@FindBy(xpath="//a[text()='Login']")
	private WebElement loginBtn;
	
	@FindBy(xpath="//a[text()='Register']")
	private WebElement registerBtn;

	@FindBy(name="username")
	private WebElement userNameField;
	
	@FindBy(name="password")
	private WebElement passwordField;

	@FindBy(xpath="//input[@id='buttn']")
	private WebElement submitBtn;
	
	 public UserLoginPage(WebDriver driver) {
		 PageFactory.initElements(driver, this);
	 }

	public WebElement getHomeBtn() {
		return homeBtn;
	}

	public WebElement getRestuarantBtn() {
		return restuarantBtn;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public WebElement getRegisterBtn() {
		return registerBtn;
	}

	public WebElement getUserNameField() {
		return userNameField;
	}

	public WebElement getPasswordField() {
		return passwordField;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}
     
	public void userLogin(String USERNAME, String PASSWORD) {
		loginBtn.click();
		userNameField.sendKeys(USERNAME); 
		passwordField.sendKeys(PASSWORD);
		submitBtn.click();
	 }
	
	public void clickonRegister() {
		registerBtn.click();
	 }
	
}
