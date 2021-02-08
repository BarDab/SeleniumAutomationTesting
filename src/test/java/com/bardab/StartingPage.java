package com.bardab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StartingPage {
	
	
private WebDriver driver;
	
	@FindBy(linkText="MOBILE")
	private WebElement link;

	
	public StartingPage(WebDriver driver) {
		super();
		this.driver=driver;
		
	}
	
	public void clickMobile() {
//	System.out.println(	this.link.getText());
		this.link.click();
	}


}
