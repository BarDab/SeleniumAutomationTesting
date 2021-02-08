package com.bardab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutCartPage {
	
	
private WebDriver driver;
	
	@FindBy(linkText="MOBILE")
	private WebElement link;
	
	@FindBy(className="input-text qty")
	private WebElement qtyTextBox;
	
	@FindBy(className="button btn-update")
	private WebElement updateQtyButton;
	
	@FindBy(className="item-msg error")
	private WebElement errorMessage;

	@FindBy(className="empty_cart_button")
	private WebElement emptyCartButton;
	
	public CheckoutCartPage(WebDriver driver) {
		super();
		this.driver=driver;
		
	}
	
	public void clickMobile() {
//	System.out.println(	this.link.getText());
		this.link.click();
	}
	
	public void enterQTY(String qty) {
		this.qtyTextBox.clear();
		this.qtyTextBox.sendKeys(qty);
	}
	
	public void updateQtyButton () {
		this.updateQtyButton.click();
	}
	
	public String getErrorMessage() {
	 return	this.errorMessage.getText();
		
	}
	
	public void emptyCart() {
		this.emptyCartButton.click();
	}
	
	
	


}
