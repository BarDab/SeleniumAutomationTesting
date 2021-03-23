package com.bardab.pageobjectmodel;

import java.util.List;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class TVPage extends WebPage{
	
	

	
	@FindBy(css="li.item:nth-child(1) > div:nth-child(2) > div:nth-child(4) > ul:nth-child(2) > li:nth-child(1) > a:nth-child(1)")
	private WebElement addToWishListLG;
	
	
	

	
	public TVPage(WebDriver driver) {
		super(driver);
		
	}
	
	public void addToWishListLG() {
		 this.addToWishListLG.click();
		
	}
	


	

	


}
