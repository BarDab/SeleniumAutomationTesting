package com.bardab.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CreateAccountPage extends WebPage {
	
	
	@FindBy(id="firstname")
	private WebElement firstName;
	
	@FindBy(id="lastname")
	private WebElement lastName;
	
	@FindBy(id="email_address")
	private WebElement emailAddress;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="confirmation")
	private WebElement confirmation;
	
	@FindBy(css="button.button:nth-child(2)")
	private WebElement registerButton;
	
	@FindBy(css=".page-title > h1:nth-child(1)")
	private WebElement pageTitle;

	
	public CreateAccountPage(WebDriver driver) {
		super(driver);
		}
	

	
	public void populateAllFields(String firstName,String lastName,String emailAddress,String password,String confirmationPassword) {
		this.explicitWait.until(ExpectedConditions.visibilityOf(this.pageTitle));
		this.firstName.sendKeys(firstName);
		this.lastName.sendKeys(lastName);
		this.emailAddress.sendKeys(emailAddress);
		this.password.sendKeys(password);
		this.confirmation.sendKeys(confirmationPassword);
	}
	
	public void populateAllFieldsAndRegister(String firstName,String lastName,String emailAddress,String password,String confirmationPassword) {
		this.populateAllFields(firstName, lastName, emailAddress, password, confirmationPassword);
		this.registerButton.click();
	}
	


}
