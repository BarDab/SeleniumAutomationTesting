package com.bardab.webdriver.basics;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginPageTest extends ChromeDriverAbstraction{
  
	
	
	@Test
	public void loginTest() {
	String url = "http://localhost:8081/pages/login.html";
	webDriver.get(url);
	
	WebElement email = webDriver.findElement(By.name("email"));
	email.sendKeys("email");
	sleep(2);
	
	WebElement password = webDriver.findElement(By.name("password"));
	password.sendKeys("password");
	sleep(2);
	
	WebElement loginButton = webDriver.findElement(By.tagName("a"));
	loginButton.click();
	sleep(2);
	
	assertEquals("http://localhost:8081/pages/index.html",webDriver.getCurrentUrl());
	
	
	}
}
