package com.bardab.abstractions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import io.github.bonigarcia.wdm.managers.FirefoxDriverManager;

public abstract class FireFoxDriverAbstraction {

	private String url = "http://localhost:8081/login";
	protected WebDriver webDriver;

	public FireFoxDriverAbstraction() {
		super();
	}

	@BeforeTest
	public void setUp() {
	
		FirefoxDriverManager.getInstance(FirefoxDriver.class).setup(); 
		webDriver = new FirefoxDriver();
		webDriver.get(url);
		
	}

	@AfterTest
	public void cleanUp() {
	  webDriver.quit();	  
	  }
	
	public void sleep(int seconds) {
		
		try {
			Thread.sleep(seconds*1000);
		} 
		
		catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}

}