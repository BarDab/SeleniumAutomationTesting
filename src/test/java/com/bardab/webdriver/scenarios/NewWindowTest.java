package com.bardab.webdriver.scenarios;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.bardab.abstractions.ChromeDriverAbstraction;

public class NewWindowTest extends ChromeDriverAbstraction {
//  @Test
//  public void testForWindows() {
//	  webDriver.get("http://localhost:8081/pages/notifications.html");
//	  System.out.println(webDriver.getWindowHandle());
//	  webDriver.findElement(By.id("newPageButton")).click();
//	  System.out.println(webDriver.getWindowHandles());
//
//  }
  
  
  @Test
  public void getSecondWindowTest() {
	  webDriver.get("http://localhost:8081/pages/notifications.html");
	  
	  String firstWindowHandle = webDriver.getWindowHandle();
	  System.out.println(firstWindowHandle);
	  webDriver.findElement(By.id("newPageButton")).click();
	  System.out.println(getSecondWindowHandle(firstWindowHandle));
	  

  }
  
  @Test
  public void switchToNewlyOpenedWindow() {
	  String firstWindowHandle = webDriver.getWindowHandle();
	  webDriver.findElement(By.id("newPageButton")).click();
	  
	  webDriver.switchTo().window(getSecondWindowHandle(firstWindowHandle));
	  
	  assertEquals(webDriver.getCurrentUrl(),"http://localhost:8081/pages/forms.html");
	  
	  
  }
  
  public String getSecondWindowHandle(String firstWindowHandle) {
	   for(String windowHandle: webDriver.getWindowHandles()) {
		if(!windowHandle.equals(firstWindowHandle)) {
			return windowHandle;
		}
	  }
	   return null;
	}
  
  
  
}
