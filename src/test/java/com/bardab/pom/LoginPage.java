package com.bardab.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
private WebDriver driver;
	
	@FindBy(id="name")
	private WebElement name;
	@FindBy(id="password")
	private WebElement password;
	@FindBy(id="submit")
	private WebElement submit;
	
	public LoginPage(WebDriver driver) {
		super();
		this.driver=driver;
		
	}
	
	public void enterDescription(String name) {
		this.name.clear();
		this.name.sendKeys(name);
	}
	public void enterTargetDate(String password) {
		this.password.clear();
		this.password.sendKeys(password);
	}
	public void submit() {
		this.submit.submit();
	}

}
