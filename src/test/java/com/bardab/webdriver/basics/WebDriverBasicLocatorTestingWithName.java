package com.bardab.webdriver.basics;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebDriverBasicLocatorTestingWithName extends ChromeDriverAbstraction {
	

@Test
  public void testGetInformationAboutEmail() {
	  
	  WebElement nameElement = webDriver.findElement(By.name("email"));
	  assertEquals("input",nameElement.getTagName());
	  System.out.println("email type:"+ nameElement.getAttribute("type"));
	  System.out.println("email value:"+nameElement.getAttribute("value"));
	
	  
}
  
  @Test
  public void testGetInformationAboutPassword() {
	  
	  WebElement nameElement = webDriver.findElement(By.name("password"));
	  assertEquals("input",nameElement.getTagName());
	  System.out.println("password type:"+ nameElement.getAttribute("type"));
	  System.out.println("password value:"+ nameElement.getAttribute("value"));
	
	  
}  
  
  @Test
  public void testGetInformationAboutRememberMe() {
	  
	  WebElement nameElement = webDriver.findElement(By.name("remember"));
	  assertEquals("input",nameElement.getTagName());
	  System.out.println("remember type:"+ nameElement.getAttribute("type"));
	  System.out.println("remember value:"+ nameElement.getAttribute("value"));
	 
	  
}
  
}