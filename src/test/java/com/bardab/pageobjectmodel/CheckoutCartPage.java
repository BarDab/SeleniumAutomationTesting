package com.bardab.pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.bardab.utilites.Utility;

public class CheckoutCartPage extends WebPage{
	
	@FindBy(id="billing:street1")
	private WebElement address;
	
	@FindBy(id="billing:city")
	private WebElement city;
	
	@FindBy(id="billing:region_id")
	private WebElement state;

	@FindBy(id="billing:postcode")
	private WebElement zip;
	
	@FindBy(id="billing:country_id")
	private WebElement country;
	
	@FindBy(id="billing:telephone")
	private WebElement telephone;
	
	@FindBy(css="#billing-buttons-container > button:nth-child(1)")
	private WebElement continueFromBilling;
	
	@FindBy(css="#payment-buttons-container > button:nth-child(2)")
	private WebElement continueFromPaymentMethod;
	
	
	@FindBy(css="#shipping-method-buttons-container > button:nth-child(2)")
	private WebElement continueFromShipping;
	

	
	
	
	@FindBy(css="#checkout-shipping-method-load > dl:nth-child(1) > dd:nth-child(2) > ul:nth-child(1) > li:nth-child(1) > label:nth-child(2) > span:nth-child(1)")
	private WebElement shippingCost;
	
	@FindBy(id="p_method_checkmo")
	private WebElement moneyOrderRadioButton;
	

	
	@FindBy(css="#checkout-review-table > tfoot:nth-child(3) > tr:nth-child(1) > td:nth-child(2) > span:nth-child(1)")
	private WebElement subTotal;
	
	@FindBy(css="tr.last:nth-child(3) > td:nth-child(2) > strong:nth-child(1) > span:nth-child(1)")
	private WebElement grandTotal;
	
	@FindBy(css=".btn-checkout")
	private WebElement placeOrderButton;
	
	@FindBy (css=".col-main > p:nth-child(3) > a:nth-child(1)")
	private WebElement orderNumber;
	
	@FindBy(css=".count")
	private WebElement currentQuantityInBasket; 
	
	
	public CheckoutCartPage(WebDriver driver) {
		super(driver);
	}
	
	public void enterBillingDetails (String address,String city,String state,String zip,String country,String telephone) {
		this.address.sendKeys(address);
		this.city.sendKeys(city);
		new Select(this.state).selectByVisibleText(state);
		this.zip.sendKeys(zip);
		this.telephone.sendKeys(telephone);
		this.continueFromBilling.click();
	}

	
	public void selectPaymentMethod() {
		this.moneyOrderRadioButton.click();
	}
	
	
	
	public void placeOrder() {
		this.clickAfterExplicitWait(this.placeOrderButton);
	}
	
	public String getOrderNumber() {
		return getTextAfterExplicitWait(this.orderNumber);
	}

	
	
	public void continueFromShipping() {
		this.clickAfterExplicitWait(this.continueFromShipping);
	}
	
	public void selectMoneyOrderButton() {
		this.clickAfterExplicitWait(this.moneyOrderRadioButton);
	}
	
	public void continueFromPaymentMethod() {
		this.clickAfterExplicitWait(this.continueFromPaymentMethod);
	}
	
	public void continueFromBilling() {
		this.clickAfterExplicitWait(this.continueFromBilling);
	}
	
	public double getShippingCost() {
		return Utility.extractDoubleFromDollarValue(getShippingCostWithCurrency());
	}


	public double getSubTotal() {
		return Utility.extractDoubleFromDollarValue(getSubTotalWithCurrency());
	}
	
	public double getGrandTotal() {
		return Utility.extractDoubleFromDollarValue(getGrandTotalWithCurrency());
		}
	
	
	
	
	
	public int getNumberOfProductsInBasket() {
		return Integer.parseInt(getTextAfterExplicitWait(this.currentQuantityInBasket));
	}
	
	
	public String getShippingCostWithCurrency() {
		return getTextAfterExplicitWait(this.shippingCost);
	}



	public String getSubTotalWithCurrency() {
		return getTextAfterExplicitWait(this.subTotal);
	}
	
	public String getGrandTotalWithCurrency() {
		return getTextAfterExplicitWait(this.grandTotal);
		
	}
	

}
