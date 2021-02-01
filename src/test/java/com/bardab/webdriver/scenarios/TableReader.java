package com.bardab.webdriver.scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TableReader {
	
	private WebDriver driver;
	private WebElement tBody;
	private String id;
	
	
	public TableReader(WebDriver driver, String tableID) {
		this.driver = driver;
		this.id = tableID;
		this.tBody = driver.findElement(By.cssSelector("#"
				+ id+
				" >tbody"));
	}
	
	public String getTableElement(int row, int column) {
		
	 return	tBody.findElement(By.cssSelector(
				 "tr:nth-child("
				+ row
				+ ") > td:nth-child("
				+ column
				+ ")")).getText();
	}
	
	
	

}
