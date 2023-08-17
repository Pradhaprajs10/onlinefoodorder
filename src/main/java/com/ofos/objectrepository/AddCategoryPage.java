package com.ofos.objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCategoryPage {
	
	@FindBy(name="c_name")
	private WebElement addCategoryField;
	
	@FindBy(name="submit")
	private WebElement saveBtn;
	
	@FindBy(xpath="//a[text()='Cancel']")
	private WebElement cancelBtn;
	
	@FindBy(xpath="//th[text()='Category Name']//ancestor::table//tbody//tr[2]/descendant::td[.='chola']")
	private WebElement deleteBtn;
	
	@FindBy(xpath="//th[text()='Action']//ancestor::table//tbody//tr[1]/descendant::a[@class='btn btn-info btn-flat btn-addon btn-sm m-b-10 m-l-5']")
	private WebElement updateBtn;
	
	public AddCategoryPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getCategoryField() {
		return addCategoryField;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}

	public WebElement getCancelBtn() {
		return cancelBtn;
	}
	
	public WebElement getUpdateBtn() {
		return updateBtn;
	}
	
	public void clickOnSave() {
		addCategoryField.sendKeys("masaldosa");
		saveBtn.click();	
	}
	
	public void clickOnCancel() {
		cancelBtn.click();
	}
	
	public void addCategoryResult(WebDriver driver) {
		String expData = "masaldosa";
		String actData = driver.findElement(By.xpath("//th[text()='Category Name']//ancestor::table//tbody//tr[2]/descendant::td[.='chola']")).getText();
        System.out.println(actData);
		if (actData.contains(expData)) {
			System.out.println("Item added successfully");
		} else {
			System.out.println("Item not added successfully");
		}
	}
	
	public void clickOnDelete(WebDriver driver) {
		 String expData = "602";
		 driver.findElement(By.xpath("//th[text()='Action']//ancestor::table//tbody//tr[1]/descendant::a[@class='btn btn-danger btn-flat btn-addon btn-xs m-b-10']")).click();
		 String actData = driver.findElement(By.xpath("//th[text()='ID']//ancestor::table//tbody//tr[1]/descendant::td[.='602']")).getText();
	        System.out.println(actData);
			if (actData.contains(expData)) {
				System.out.println("Item deleted successfully");
			} else {
				System.out.println("Item not deleted successfully");
			}
	}
	
	public void clickOnUpdate(WebDriver driver) {
		updateBtn.click();
	}

}
