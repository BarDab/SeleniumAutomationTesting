package com.bardab.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ToDoListPage {
	private WebDriver driver;


public ToDoListPage(WebDriver driver) {
	super();
	this.driver=driver;
}

public String getDescription(int idNumber) {
	return driver.findElement(By.id("desc-"+idNumber)).getText();
	
}
public String getTargetDate(int idNumber) {
	return driver.findElement(By.id("targetdate-"+ idNumber)).getText();
	}
public void clickUpdate(int idNumber) {
	 driver.findElement(By.id("update-"+idNumber)).click();
	
}
public void clickDelete(int idNumber) {
	 driver.findElement(By.id("delete-"+idNumber)).click();
	}



}