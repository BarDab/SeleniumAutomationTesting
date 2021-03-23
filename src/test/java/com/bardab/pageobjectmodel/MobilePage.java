package com.bardab.pageobjectmodel;

import java.util.List;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class MobilePage extends WebPage {
	
	
	@FindBy(tagName="h2")
	private List<WebElement> smartphones;
	
	@FindBy(css=".category-products > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > select:nth-child(2)")
	private WebElement select;
	
	@FindBy(css="#product-price-1 > span:nth-child(1)")
	private WebElement sonyXperia;
	
	@FindBy(css=".products-grid > li:nth-child(1) > div:nth-child(2) > div:nth-child(4) > button:nth-child(1)")
	private WebElement sonyXperiaAddToCartButton;
	
	@FindBy(css="li.item:nth-child(2) > div:nth-child(2) > div:nth-child(4) > button:nth-child(1)")
	private WebElement iphoneAddToCartButton;
	
	@FindBy(id="product-collection-image-1")
	private WebElement sonyXperiaPicture;
	
	@FindBy(css=".products-grid > li:nth-child(2) > div:nth-child(2) > div:nth-child(4) > ul:nth-child(2) > li:nth-child(2) > a:nth-child(2)")
	private WebElement addToCompareSamsungButton;
	
	@FindBy(css=".products-grid > li:nth-child(1) > div:nth-child(2) > div:nth-child(4) > ul:nth-child(2) > li:nth-child(2) > a:nth-child(2)")
	private WebElement addToCompareIphoneButton;
	
	@FindBy(css="div.block-content:nth-child(2) > div:nth-child(3) > button:nth-child(1)")
	private WebElement compareButton;
	
	public MobilePage(WebDriver driver) {
		super(driver);
		}
	
	public List<WebElement> getSmartphones() {
		this.explicitWait.until(ExpectedConditions.visibilityOfAllElements(smartphones));
		return smartphones;	
		}
	
	public List<WebElement> getSmartphonesSortedBy(String byVisibleText){
		Select selectBox = new Select(select);
		selectBox.selectByVisibleText(byVisibleText);
		return smartphones;
		}
	
	public String getSonyXperiaPrice() {
		return this.getTextAfterExplicitWait(this.sonyXperia);
		}
	
	public void goToSonyXperiaPage() {
		this.clickAfterExplicitWait(this.sonyXperiaPicture);
		
	}
	
	public void addToCartSonyXperia() {
		this.clickAfterExplicitWait(this.sonyXperiaAddToCartButton);
	}
	
	public void addToCartIphone() {
		this.clickAfterExplicitWait(this.iphoneAddToCartButton);
	}
	
	public void addToCompare() {
		this.clickAfterExplicitWait(this.addToCompareIphoneButton);
		this.addToCompareSamsungButton.click();
	}
	
	public void comparePopUp() {
		this.clickAfterExplicitWait(this.compareButton);
		}
	

	


}
