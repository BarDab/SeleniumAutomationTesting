package com.bardab;

import java.util.List;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class MobilePage {
	
	
private WebDriver driver;
	
	@FindBy(tagName="h2")
	private List<WebElement> smartphones;
	
	@FindBy(css=".category-products > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > select:nth-child(2)")
	private WebElement select;
	
	@FindBy(css="#product-price-1 > span:nth-child(1)")
	private WebElement sonyXperia;
	
	@FindBy(css="li.item:nth-child(3) > div:nth-child(2) > div:nth-child(4) > button:nth-child(1)")
	private WebElement sonyXperiaAddToCartButton;
	
	@FindBy(id="product-collection-image-1")
	private WebElement sonyXperiaPicture;

	
	public MobilePage(WebDriver driver) {
		super();
		this.driver=driver;
		
	}
	
	public List<WebElement> getSmartphones() {
		return smartphones;	
		}
	
	public List<WebElement> getSmartphonesSortedBy(String byVisibleText){
		Select selectBox = new Select(select);
		selectBox.selectByVisibleText(byVisibleText);
		return smartphones;
		}
	
	public String getSonyXperiaPrice() {
		System.out.println(sonyXperia.getText());
		return sonyXperia.getText();	
		}
	
	public void goToSonyXperiaPage() {
		this.sonyXperiaPicture.click();
		
	}
	
	public void addToCartSonyXperia() {
		this.sonyXperiaAddToCartButton.click();
	}
	
	

	


}
