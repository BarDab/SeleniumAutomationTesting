package com.bardab.webdriver.basics;

import static org.testng.Assert.assertEquals;

import org.jsoup.select.Evaluator.Id;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class WebDriverBasicLocatorTest {
	
private WebDriver webDriver;
private String url = "http://localhost:8081/login";
private String title = "First Web Application";
	
	
	@BeforeTest
	public void setUp() {
	
		ChromeDriverManager.getInstance(ChromeDriver.class).setup(); 
		webDriver = new ChromeDriver();
		webDriver.get(url);
		
	}
	
	
  @Test
  public void f() {
	  System.out.println(webDriver.getTitle());
	  assertEquals(title,webDriver.getTitle());
	  

  }
  
  @Test
  public void testGetInformationAboutName() {
	  
	  WebElement nameElement = webDriver.findElement(By.id("submit"
	  		));
	  assertEquals("input",nameElement.getTagName());
	  System.out.println(nameElement.getAttribute("id"));
	  
	  
	  
	  
	  
  }
  
  
  @AfterTest
  public void cleanUp(){
	  webDriver.quit();	  
	  }
  
}
