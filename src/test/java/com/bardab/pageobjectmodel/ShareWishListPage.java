package com.bardab.pageobjectmodel;

import java.util.List;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ShareWishListPage extends WebPage {
	
	
	@FindBy(id="email_address")
	private WebElement emailAddress;
	
	@FindBy(id="message")
	private WebElement message;
	
	@FindBy(css=".buttons-set > button:nth-child(3)")
	private WebElement shareButton;
	
	
	

	
	public ShareWishListPage(WebDriver driver) {
		super(driver);
		
	}
	
	public void enterEmailAndCustomMessageAndClick(String email) {
		 this.emailAddress.sendKeys(email);
		 this.enterMessage();
		 this.shareButton.click();
		
	}
	
	public void enterMessage() {
		this.message.sendKeys("[Placeholder] This message is part of testing");
	}

	

	


}
