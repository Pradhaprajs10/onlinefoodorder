package com.ofos.objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpdateCategoryPage {
	
	@FindBy(name="c_name")
	private WebElement updateCategoryField;
	
	@FindBy(name="submit")
	private WebElement updateSaveBtn;
	
	@FindBy(xpath="//strong[text()='Updated!']")
	private WebElement updateMessage;
	
	@FindBy(xpath="//a[text()='Cancel']")
	private WebElement updateCancelBtn;
	
	public UpdateCategoryPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getUpdateCategoryField() {
		return updateCategoryField;
	}

	public WebElement getUpdateSaveBtn() {
		return updateSaveBtn;
	}

	public WebElement getUpdateMessage() {
		return updateMessage;
	}

	public WebElement getUpdateCancelBtn() {
		return updateCancelBtn;
	}
	
	public void verifyUpdate() {
		
		updateCategoryField.sendKeys("masalroast");
		updateSaveBtn.click();
		String expResult= "Updated!";
		String actResult = updateMessage.getText();
		
		if(actResult.contains(expResult)) {
			System.out.println("Updated Successfully");
		} else {
			System.out.println("Not Updated Successfully");
		}
	}
	
	public void clickOnCancel() {
		updateCancelBtn.click();
	}
	

}
