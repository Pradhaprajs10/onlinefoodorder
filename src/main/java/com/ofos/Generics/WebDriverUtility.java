package com.ofos.Generics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {
	/**
	 * This method is used to maximize the browser
	 * @param driver
	 */
	public void maximizeBrowser(WebDriver driver) {
		driver.manage().window().maximize();
	}
	/**
	 * This method is used to wait 
	 * @param driver
	 */
	public void implicitWait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	/**
	 * This method is used to wait for particular method at a time
	 * @param driver
	 * @param element
	 */
	public void explicitWait(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void explicitWaitAlert(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.alertIsPresent());
	}
	/**
	 * This method is used to select index 
	 * @param element
	 * @param index
	 */
	public void select(WebDriver driver, WebElement element, int index ) {
		Select s = new Select(element);
		s.selectByIndex(index);
	}
	/**
	 * This method is used to select value
	 * @param element
	 * @param value
	 */
	public void select(WebDriver driver, WebElement element, String value) {
		Select s = new Select(element);
		s.selectByValue(value);
	}
	/**
	 * This method is used to select visible text
	 * @param text
	 * @param element
	 */
	public void select(WebDriver driver, String text, WebElement element) {
		Select s = new Select(element);
	    s.selectByVisibleText(text);
	}
	/**
	 * This method is used to handle mouseHoverAction
	 * @param driver
	 * @param element
	 */
	public void mouseHover(WebDriver driver, WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).perform();
	}
	/**
	 * This method is used to handle contextClick action
	 * @param driver
	 * @param element
	 */
	public void rightClick(WebDriver driver, WebElement element) {
		Actions a = new Actions(driver);
		a.contextClick(element).perform();
	}
	/**
	 * This method is used to handle doubleClick action
	 * @param driver
	 * @param element
	 */
	public void doubleClick(WebDriver driver, WebElement element) {
		Actions a = new Actions(driver);
		a.doubleClick(element).perform();
	}
	/**
	 * This method is used to handle dragAndDrop action
	 * @param driver
	 * @param src
	 * @param des
	 */
	public void dragAndDrop(WebDriver driver, WebElement src, WebElement des) {
		Actions a = new Actions(driver);
		a.dragAndDrop(src,des).perform();
	}
	/**
	 * This method is used to handle enterKey action
	 * @param driver
	 */
	public void enterKey(WebDriver driver) {
		Actions a = new Actions(driver);
		a.sendKeys(Keys.ENTER).perform();
	}
	/**
	 * This method is used to handle robot for keyPress
	 * @param driver
	 * @throws Throwable
	 */
	public void enterKeyPress(WebDriver driver) throws Throwable {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
	}
	/**
	 * This method is used to handle robot for keyRelease
	 * @param driver
	 * @throws Throwable
	 */
	public void enterKeyRelease(WebDriver driver) throws Throwable {
		Robot r = new Robot();
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	/**
	 * This method is used to handle the particular index of frame
	 * @param driver
	 * @param index
	 */
	public void switchToFrame(WebDriver driver, int index) {
		driver.switchTo().frame(index);
	}
	/**
	 * This method is used to handle id or name of frame
	 * @param driver
	 * @param nameorid
	 */
	public void switchToFrame(WebDriver driver, String nameorid) {
		driver.switchTo().frame(nameorid);
	}
	/**
	 * This method is used to handle address of frame
	 * @param driver
	 * @param address
	 */
	public void switchToFrame(WebDriver driver, WebElement address) {
		driver.switchTo().frame(address);
	}
	/**
	 * This method is used to handle alert for accept
	 * @param driver
	 */
	public void acceptAlert(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	/**
	 * This method is used to handle alert for dismiss
	 */
	public void acceptSecondAlert(WebDriver driver) {
	    Alert a = driver.switchTo().alert();
	    a.accept();
	}
	/**
	 * This method is used to handle alert again for accept
	 * @param driver
	 */
	public void dismissAlert(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
	/**
	 * This method is used to handle multiple windows
	 * @param driver
	 * @param partialTitle
	 */
	public void switchToWindow(WebDriver driver, String partialTitle) {
		
		//step1 : use getWindowHandle to capture all window id's
		Set<String> allWindowId = driver.getWindowHandles();
		
		//step2 : iterate throgh the windows
		Iterator<String> it = allWindowId.iterator();
		
		//step3 : check whether there is next window id
		while(it.hasNext()) {
		
		//step4 : check current window id
		String winId = it.next();
		
		//step5 : switch to current window and capture title
		String currentWindowTitle = driver.switchTo().window(winId).getTitle();
		
		//step6 : check whether current window is expected
		if(currentWindowTitle.contains(partialTitle)) {
			break;
		}
		}
	}
	/**
	 * This method is used to scrollBarAction for up and down
	 * @param driver
	 */
		public void scrollBarAction(WebDriver driver) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("windows.scrollBy(0,500)", "");
		}
	/**
	 * This method is used to scrollX-Axis	
	 * @param driver
	 * @param element
	 */
		public void scrollXAction(WebDriver driver, WebElement element) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
		     int x = element.getLocation().getX();
		     js.executeScript("windows.scrollBy(0,"+x+")", element);
		}
	/**
	 * This method is used to scrollY-Axis	
	 * @param driver
	 * @param element
	 */
		public void scrollYAction(WebDriver driver, WebElement element) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			int y = element.getLocation().getY();
			js.executeScript("windows.scrollBy(0,"+y+")", element);			
		}
	/**
	 * This method is used to quit the browser
	 * @author Pradhap	
	 * @param driver
	 */
		public void closeBrowser(WebDriver driver) {
			driver.quit();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	


