package com.bardab.pom;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ToDoPage {
	private WebDriver driver;



@FindBy(id="desc")
private WebElement desc;
@FindBy(id="targetDate")
private WebElement targetDate;
@FindBy(id="save")
private WebElement save;

public ToDoPage(WebDriver driver) {
	super();
	this.driver=driver;
}

public void enterDescription(String description) {
	this.desc.clear();
	this.desc.sendKeys(description);
}
public void enterTargetDate(String targetDate) {
	this.targetDate.clear();
	this.targetDate.sendKeys(targetDate);
}
public void submit() {
	this.save.submit();
}


public void updateToDo(String description, String targetDate) {
	enterDescription(description);
	enterTargetDate(targetDate);
	submit();
}
}