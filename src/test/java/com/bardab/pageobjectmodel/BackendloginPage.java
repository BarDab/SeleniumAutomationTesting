package com.bardab.pageobjectmodel;

import java.util.List;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.bardab.utilites.ScreenshotToPDF;

public class BackendloginPage extends WebPage {
	
	
	@FindBy(id="username")
	private WebElement usernameTextField;
	
	@FindBy(id="login")
	private WebElement passwordTextField;
	@FindBy(css=".form-button")
	private WebElement loginButton;
	
	@FindBy(css=".link-reorder")
	private WebElement reorderButton;

	public BackendloginPage (WebDriver driver) {
		super(driver);
	}
	
	

	public void enterUsername(String username) {
		this.sendKeysAfterExplicitWait(this.usernameTextField, username);
	}
	public void enterPassword(String password) {
		this.passwordTextField.sendKeys(password);
	}
	public void clickLoginButton() {
		this.loginButton.click();
	}
	

	

	


}
