package com.bardab.webdriver.scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.bardab.abstractions.ChromeDriverAbstraction;

public class ModalTests extends ChromeDriverAbstraction{
  @Test (expectedExceptions=ElementNotInteractableException.class)
  public void modalTest_expectingException() {
	  webDriver.get("http://localhost:8081/pages/notifications.html");
	  
	  webDriver.findElement(By.id("modalButton")).click();
//	  sleep(2);
	  webDriver.findElement(By.id("myModalCloseButton")).click();
	    
  }
  
  @Test
  public void modalTest() {
	  webDriver.get("http://localhost:8081/pages/notifications.html");
	  
	  webDriver.findElement(By.id("modalButton")).click();
	  sleep(2);
	  webDriver.findElement(By.id("myModalCloseButton")).click();
	    
  }
  
  public void modalWithExplicitWaitTest () {
	  WebDriverWait explicitWait = new WebDriverWait(webDriver,10);
	  explicitWait.withMessage("Close button not found");
	  webDriver.get("http://localhost:8081/pages/notifications.html");
	  webDriver.findElement(By.id("modalButton")).click();
	  WebElement myModalCloseButton = webDriver.findElement(By.id("myModalCloseButton"));
	  explicitWait.until(ExpectedConditions.visibilityOf(myModalCloseButton));
	  myModalCloseButton.click();
	  
	  
	  
	  
  }
  
}
