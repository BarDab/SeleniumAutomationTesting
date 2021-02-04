package com.bardab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	
private WebDriver driver;
	
	@FindBy(name="uid")
	private WebElement name;
	@FindBy(name="password")
	private WebElement password;
	@FindBy(name="btnLogin")
	private WebElement submit;
	
	public LoginPage(WebDriver driver) {
		super();
		this.driver=driver;
		
	}
	
	public void enterUserId(String name) {
//		this.name.clear();
		this.name.sendKeys(name);
	}
	public void enterPassword(String password) {
//		this.password.clear();
		this.password.sendKeys(password);
	}
	public void submit() {
		this.submit.submit();
	}


}
