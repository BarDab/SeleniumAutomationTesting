package com.bardab.webdriver.basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LocateAllElementsOfClassHuge extends ChromeDriverAbstraction {
  @Test
  public void locateAllElements() {
	  webDriver.get("http://localhost:8081/pages/index.html");
	  List<WebElement> allHugeElements = webDriver.findElements(By.className("huge"));
	  for(WebElement element:allHugeElements) {
		  System.out.println(element.getText());
		  
	  }
	  
	  
  }
}
