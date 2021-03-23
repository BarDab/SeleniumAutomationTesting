package com.bardab.pageobjectmodel;

import java.util.List;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.bardab.utilites.ScreenshotToPDF;

public class BackendPage extends WebPage {
	
	private Actions actions;
	
	@FindBy(css=".message-popup-head > a:nth-child(1)")
	private WebElement closePopUpButton;
	
	@FindBy(css="li.level0:nth-child(1) > a:nth-child(1)")
	private WebElement salesButton;
	@FindBy(css="li.level0:nth-child(1) > ul:nth-child(2) > li:nth-child(1) > a:nth-child(1)")
	private WebElement orderButton;
	

	
	public BackendPage(WebDriver driver) {
		super(driver);
		actions = new Actions(driver);
		// TODO Auto-generated constructor stub
	}
	

	public void closePopUpWindow() {
		this.clickAfterExplicitWait(this.closePopUpButton);
	}
	
	public void openOrders() {
		this.explicitWait.until(ExpectedConditions.visibilityOf(this.salesButton));
		actions.moveToElement(this.salesButton).build().perform();
		this.clickAfterExplicitWait(this.orderButton);
	}


	

	


}
