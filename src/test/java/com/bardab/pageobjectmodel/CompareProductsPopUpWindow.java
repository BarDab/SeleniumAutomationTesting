package com.bardab.pageobjectmodel;

import java.util.List;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.bardab.utilites.ScreenshotToPDF;
import com.bardab.utilites.Utility;

public class CompareProductsPopUpWindow extends WebPage {
	

	@FindBy(css=".page-title > h1:nth-child(1)")
	private WebElement pageTitle;
	
	public CompareProductsPopUpWindow (WebDriver driver) {
		super(driver);
		
		}
	
	public void switchToThisPopUpWindow() {
		driver.switchTo().window(Utility.getSecondWindowHandle(driver, driver.getWindowHandle()));
	}
	
	public String getWindowTitle() {
		return this.getTextAfterExplicitWait(this.pageTitle);
	}
	
	

	

	


}
