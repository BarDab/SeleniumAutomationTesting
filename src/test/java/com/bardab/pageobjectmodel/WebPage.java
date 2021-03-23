package com.bardab.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class WebPage {
	
	protected WebDriver driver;
	protected WebDriverWait explicitWait;
	
	
	public WebPage (WebDriver driver) {
		PageFactory.initElements(driver,this);
		explicitWait = new WebDriverWait(driver,6);
		this.driver=driver;
		
		}
	
	public void clearAndSendKeysAfterExplicitWait(WebElement element, String text) {
		this.explicitWait.until(ExpectedConditions.visibilityOf(element));
		element.clear();
		element.sendKeys(text);
	};
	
	
	public void clearAfterExplicitWait(WebElement element) {
		this.explicitWait.until(ExpectedConditions.visibilityOf(element));
		element.clear();
	};
	
	public void clickAfterExplicitWait(WebElement element) {
		this.explicitWait.until(ExpectedConditions.visibilityOf(element));
		element.click();
	};
	public void sendKeysAfterExplicitWait(WebElement element,String text){
		this.explicitWait.until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(text);
	};
	public String getTextAfterExplicitWait(WebElement element){
		this.explicitWait.until(ExpectedConditions.visibilityOf(element));
		return element.getText();
	};
	

	
}
