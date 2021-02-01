package com.bardab.abstractions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public abstract class ChromeDriverAbstraction {

	private String url = "http://localhost:8081/login";
	protected WebDriver webDriver;

	public ChromeDriverAbstraction() {
		super();
	}

	@BeforeTest
	public void setUp() {
	
		ChromeDriverManager.getInstance(ChromeDriver.class).setup(); 
		webDriver = new ChromeDriver();
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