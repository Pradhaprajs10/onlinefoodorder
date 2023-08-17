package com.ofos.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminLoginPage {
	
     //declaration
	 @FindBy(name="username")
	 private WebElement usernameBtn;
	 
	 @FindBy(name="password")
	 private WebElement passwordBtn;
	 
	 @FindBy(name="submit")
	 private WebElement submitBtn;
	 
	//initialization
	 public AdminLoginPage(WebDriver driver) {
		 PageFactory.initElements(driver, this);
	 }
	 
    //utilization
	public WebElement getUsernameBtn() {
		return usernameBtn;
	}

	public WebElement getPasswordBtn() {
		return passwordBtn;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}

	public void adminLogin(String USERNAME, String PASSWORD) {
		usernameBtn.sendKeys(USERNAME);
		passwordBtn.sendKeys(PASSWORD);
		submitBtn.click();
	}
	 
	 
}
