package com.bardab.pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SonyXperiaPage extends WebPage {
	
	

	
	@FindBy(css=".price")
	private WebElement productPrice;

	
	public SonyXperiaPage(WebDriver driver) {
		super(driver);
		}
	
	public String getPrice() {
		System.out.println(this.productPrice.getText());
		return this.productPrice.getText();
	}


}
