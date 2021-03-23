package com.bardab.pageobjectmodel;

import java.util.List;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class WishListPage extends WebPage{
	
	

	
	@FindBy(css=".btn-share")
	private WebElement shareWishList;
	
	@FindBy(linkText="email_address")
	private WebElement tv;
	
	@FindBy(css=".success-msg > ul:nth-child(1) > li:nth-child(1) > span:nth-child(1)")
	private WebElement successfulShareMsg;
	
	@FindBy(css=".btn-cart")
	private WebElement addToCartButton;
	
		

	
	public WishListPage(WebDriver driver) {
		super(driver);
		
}
	
	public void shareWishListLG() {
		 this.shareWishList.click();
		
	}
	
	public void goToTV() {
		this.tv.click();
	}
	
	public String getSuccesfulShareMsg() {
		return this.successfulShareMsg.getText();
	}

	
	public void addToCartLG() {
		this.addToCartButton.click();
		
	}
	

	


}
