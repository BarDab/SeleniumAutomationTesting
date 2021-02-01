package com.bardab.webdriver.scenarios;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.bardab.abstractions.ChromeDriverAbstraction;

public class AlertsTest extends ChromeDriverAbstraction {
  @Test
  public void javaScriptAlertTest() {
	  webDriver.get("http://localhost:8081/pages/notifications.html");
	  webDriver.findElement(By.id("alertButton")).click();
	  
	  sleep(2);
	  Alert alert = webDriver.switchTo().alert();
	  alert.sendKeys("Nothing to scare");
	  alert.accept();
	  sleep(2);
	  alert.accept();
	  sleep(2);
	  
	  
	  
  }
}
