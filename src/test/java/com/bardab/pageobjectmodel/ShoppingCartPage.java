package com.bardab.pageobjectmodel;

import java.util.List;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.bardab.utilites.Utility;

public class ShoppingCartPage extends WebPage {
	

	@FindBy(css=".top > li:nth-child(1) > button:nth-child(1)")
	private WebElement proceedToCheckOutButton;
	
	@FindBy(css=".product-cart-actions > input:nth-child(1)")
	private WebElement quantityTextField;
	@FindBy(css="button.btn-update:nth-child(2) > span:nth-child(1) > span:nth-child(1)")
	private WebElement updateButton;
	@FindBy(css="#shopping-cart-totals-table > tfoot:nth-child(2) > tr:nth-child(1) > td:nth-child(2) > strong:nth-child(1) > span:nth-child(1)")
	private WebElement grandTotal;
	
	@FindBy(css=".button-wrapper > button:nth-child(1)")
	private WebElement applyDiscountButton;
	
	@FindBy(css="#shopping-cart-totals-table > tbody:nth-child(3) > tr:nth-child(2) > td:nth-child(2) > span:nth-child(1)")
	private WebElement discountValue;
	
	@FindBy(css=" #coupon_code")
	private WebElement discountCodeTextField;  
	
	@FindBy(css=".item-msg")
	private WebElement quantityWarning; 
	
	@FindBy(css=".product-cart-price > span:nth-child(1) > span:nth-child(1)")
	private WebElement firstProductPrice; 
	
	
	@FindBy(css=".page-title > h1:nth-child(1)")
	private WebElement emptyCartMessage;
	
	@FindBy(css="#empty_cart_button")
	private WebElement emptyCartButton;
	

	
	

	
	public ShoppingCartPage(WebDriver driver) {
		super(driver);
		}
	

	
	public void proceedToCheckout() {
		this.clickAfterExplicitWait(this.proceedToCheckOutButton);
		}
	
	
	
	public int getQuantityFromTextField()
	{
		return Integer.parseInt(this.getTextAfterExplicitWait(quantityTextField));
	}
	
	public void changeQuantity(int quantity)
	{
		this.clearAndSendKeysAfterExplicitWait(this.quantityTextField,String.valueOf(quantity));
	}
	
	public void updateQuantity() {
	
		this.clickAfterExplicitWait(this.updateButton);
		
}
	
	public String getGrandTotal() {
		return this.getTextAfterExplicitWait( this.grandTotal);
	}
	
	public void enterDiscountCode(String discountCode) {
		this.sendKeysAfterExplicitWait(this.discountCodeTextField, discountCode);
	}
	
	public void applyDiscount() {
		this.clickAfterExplicitWait(this.applyDiscountButton);
		}
	
	public String discountValue () {
		return this.getTextAfterExplicitWait( this.discountValue);
	}

	public String getErrorMessage() {
		return this.getTextAfterExplicitWait( this.quantityWarning);
		}
	
	public void emptyCart() {
		this.clickAfterExplicitWait(this.emptyCartButton);
	}
	
	public String getEmptyCartMessage() {
		return this.getTextAfterExplicitWait( this.emptyCartMessage); 
	}
	
	public double getFirstProductInTheLstPrice() {
		return Utility.extractDoubleFromDollarValue( this.getTextAfterExplicitWait( this.firstProductPrice));
	}

	


}
