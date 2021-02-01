package com.bardab.webdriver.basics;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LinkTextTest extends ChromeDriverAbstraction {
  
	
	
@Test
  public void getLinkAndClickIt() {
		
		webDriver.get("http://localhost:8081/pages/index.html");
		WebElement webElement = webDriver.findElement(By.linkText("Forms"));
		assertEquals("http://localhost:8081/pages/forms.html",webElement.getAttribute("href"));
//		webElement.click();
//		sleep(2);
//		
//		assertEquals("http://localhost:8081/pages/forms.html",webDriver.getCurrentUrl());
		
		
  }

@Test
public void getByPartialLinkTextAndClickIt() {
		
		webDriver.get("http://localhost:8081/pages/forms.html");
		WebElement webElement = webDriver.findElement(By.partialLinkText("Admin"));
		assertEquals("http://localhost:8081/pages/index.html",webElement.getAttribute("href"));
		webElement.click();
		sleep(2);
		
		assertEquals("http://localhost:8081/pages/index.html",webDriver.getCurrentUrl());
		
		
}


}
