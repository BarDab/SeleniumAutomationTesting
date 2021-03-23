package com.bardab.pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class StartingPage extends WebPage{
	
	

	
	@FindBy(linkText="MOBILE")
	private WebElement linkToMobilePage;
	
	@FindBy(css=".skip-account > span:nth-child(2)")
	private WebElement accountLabel;
	
	@FindBy(css=".page-title > h2:nth-child(1)")
	private WebElement pageTitle;
	
	@FindBy(linkText= "My Account")
	private WebElement myAccount;

	
	public StartingPage(WebDriver driver) {
		super(driver);
		
	}
	
	public void goToMobilePage() {
		this.clickAfterExplicitWait(this.linkToMobilePage);
	}
	
	public void goToLoginPage() {
		this.clickAccount();
		this.clickMyAccount();
	}
	
	public void clickAccount() {
		this.clickAfterExplicitWait(this.accountLabel);
		
	}
	public void clickMyAccount() {
		this.clickAfterExplicitWait(this.myAccount);
	}

	public String getTitleOfThePage() {
		return getTextAfterExplicitWait(this.pageTitle);
	}

}
