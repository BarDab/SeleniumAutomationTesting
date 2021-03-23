package com.bardab.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends WebPage{
	
	
	@FindBy(css=".col-1 > div:nth-child(2) > a:nth-child(1)")
	private WebElement createAccountButton;
	@FindBy (id="email")
	private WebElement emailTextField;
	
	@FindBy (id="pass")
	private WebElement passwordTextField;
	
	@FindBy (id="send2")
	private WebElement loginButton;

	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	

	
	public void clickCreateAccount() {
		this.createAccountButton.click();
		
	}
	
	public void enterCredentialsAndLogIn(String email, String password) {
		this.emailTextField.sendKeys(email);
		this.passwordTextField.sendKeys(password);
		this.loginButton.click();
		
	}
	

}
