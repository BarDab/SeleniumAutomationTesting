package com.bardab.webdriver.basics;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebDriverBasicLocatorsWithTagTest extends ChromeDriverAbstraction {
	
	
  
	
  @Test
  public void testLoginButton() {
	  WebElement webElement = webDriver.findElement(By.tagName("a"));
	  System.out.println( webElement.getAttribute("class"));
	  }
  
  @Test
  public void testFirstInput() {
	  List<WebElement> webElements = webDriver.findElements(By.tagName("input"));
	  for(WebElement element:webElements) {
		  String type =  element.getAttribute("type");
		  System.out.println(element.getAttribute("type"));
		  if(type.equals("text")) {
			  System.out.println(element.getTagName());
			  
			  element.sendKeys("in28minutes");
		  }
		  else if (type.equals("password")) {
			  System.out.println(element.getTagName());
			  element.sendKeys("dummy");
		  }
		  else if (type.equals("submit")) {
			  element.click();
		  }
		  sleep(2);
		  
	  }
	  assertEquals(webDriver.getCurrentUrl(),"http://localhost:8081/welcome");
	  
	  
  }
  
}
