package com.bardab.webdriver.basics;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LocateByClassTest extends ChromeDriverAbstraction{
  @Test
  public void locateByClass() {
	  
	  
	  
	  String url = "http://localhost:8081/pages/flot.html";
	  webDriver.get(url);
	  WebElement adminButton = webDriver.findElement(By.className("navbar-brand"));
	  adminButton.click();
	  sleep(2);
	  assertEquals(webDriver.getCurrentUrl(),"http://localhost:8081/pages/index.html");
	  }
}
