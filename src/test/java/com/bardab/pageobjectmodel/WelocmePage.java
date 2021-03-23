package com.bardab.pageobjectmodel;

import java.util.List;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class WelocmePage extends WebPage{
	
	@FindBy(css=".success-msg > ul:nth-child(1) > li:nth-child(1) > span:nth-child(1)")
	private WebElement welcomeMsg;
	
	@FindBy(linkText="TV")
	private WebElement tv;
	
	@FindBy(linkText="MY WISHLIST")
	private WebElement myWishList;
	

	
	public WelocmePage(WebDriver driver) {
		super(driver);
		
	}
	
	public String getWelcomeMsg() {
		return this.getTextAfterExplicitWait(this.welcomeMsg);
		
	}
	
	public void goToTV() {
		this.clickAfterExplicitWait(this.tv);
		}
	
	public void goToMyWishList() {
		this.myWishList.click();
	}

	

	


}
