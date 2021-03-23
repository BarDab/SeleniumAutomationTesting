package com.bardab.pageobjectmodel;

import java.util.List;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.bardab.utilites.ScreenshotToPDF;

public class SalesOrderPage extends WebPage{
	
private Actions actions;

	@FindBy(xpath="/html/body/div[1]/div[4]/div/div[3]/div/table/tbody/tr/td[1]/input")
	private WebElement exportButton;
	
	@FindBy(css=".page")
	private WebElement pageTextField;
	

	public SalesOrderPage (WebDriver driver) {
		super(driver);
		this.actions = new Actions(driver);
		
	}
	
	
	public void setPageNumber(int pageNumber) {
		this.clearAndSendKeysAfterExplicitWait(this.pageTextField, String.valueOf(pageNumber));
	}
	


	
	public void exportToCSV() {
		this.clickAfterExplicitWait(this.exportButton);
	}


	

	


}
