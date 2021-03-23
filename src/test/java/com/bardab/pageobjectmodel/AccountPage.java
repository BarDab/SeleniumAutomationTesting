package com.bardab.pageobjectmodel;

import java.util.List;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.bardab.utilites.ScreenshotToPDF;

public class AccountPage extends WebPage {
	
		
	@FindBy(css=".block-account > div:nth-child(2) > ul:nth-child(1) > li:nth-child(4) > a:nth-child(1)")
	private WebElement myOrdersGoToButton;
	
	@FindBy(css=".a-center > span:nth-child(1) > a:nth-child(1)")
	private WebElement viewOrderButton;
	@FindBy(css=".link-print")
	private WebElement printOrderButton;
	
	@FindBy(css=".link-reorder")
	private WebElement reorderButton;

	public AccountPage (WebDriver driver) {
		super(driver);
		
		}
	
	
	public void goToMyOrders() {
		this.myOrdersGoToButton.click();
	}
	
	public void clickViewOrder() {
		this.clickAfterExplicitWait(this.viewOrderButton);
	}
	
	public void printOrderToPDF() throws Exception {
		this.clickAfterExplicitWait(this.printOrderButton);
		ScreenshotToPDF.screenShotToPDF(this.driver);
		
		
	}
	
	public void reorder() {
		this.reorderButton.click();
	}
	
	

	

	


}
