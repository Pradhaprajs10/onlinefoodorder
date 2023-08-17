package com.ofos.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	@FindBy(name="username")
	private WebElement userNameField;
	
	@FindBy(name="firstname")
	private WebElement firstNameField;
    
	@FindBy(name="lastname")
	private WebElement lastNameField;
    
	@FindBy(name="email")
	private WebElement emailField;
    
	@FindBy(name="phone")
	private WebElement phoneField;
    
	@FindBy(name="password")
	private WebElement passwordField;
    
	@FindBy(name="cpassword")
	private WebElement cpasswordField;
    
	@FindBy(name="address")
	private WebElement lastnameField;
	
	@FindBy(name="submit")
	private WebElement submitBtn;
    
	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getUserNameField() {
		return userNameField;
	}

	public WebElement getFirstNameField() {
		return firstNameField;
	}

	public WebElement getLastNameField() {
		return lastNameField;
	}

	public WebElement getEmailField() {
		return emailField;
	}

	public WebElement getPhoneField() {
		return phoneField;
	}

	public WebElement getPasswordField() {
		return passwordField;
	}

	public WebElement getCpasswordField() {
		return cpasswordField;
	}

	public WebElement getLastnameField() {
		return lastnameField;
	}
		
	public WebElement getSubmitBtn() {
		return submitBtn;
	}

	public void enterAllRegisterField() {
		
		userNameField.sendKeys("pradhap");
		firstNameField.sendKeys("pradhapraj");
		lastNameField.sendKeys("skmar");
		emailField.sendKeys("prad@gmail.com");
		phoneField.sendKeys("8234567896545");
		passwordField.sendKeys("12345");
		cpasswordField.sendKeys("12345");
		lastnameField.sendKeys("salem");
		submitBtn.click();
	}
	   
	
}
