package com.bardab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SonyXperiaPage {
	
	
private WebDriver driver;
	
	@FindBy(css=".price")
	private WebElement productPrice;

	
	public SonyXperiaPage(WebDriver driver) {
		super();
		this.driver=driver;
		
	}
	
	public String getPrice() {
		System.out.println(this.productPrice.getText());
		return this.productPrice.getText();
	}


}
