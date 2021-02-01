package com.bardab.webdriver.scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.bardab.abstractions.ChromeDriverAbstraction;

public class CheckStyleTest extends ChromeDriverAbstraction {
//  @Test
//  public void getCSSStyles() {
//	  webDriver.get("http://localhost:8081/pages/forms.html");
//	  WebElement element =  webDriver.findElement(By.id("inputError"));
//	  System.out.println(element.getCssValue("color"));
//	  System.out.println(element.getCssValue("display"));
//	  System.out.println(element.getCssValue("border-color"));
//	  element =  webDriver.findElement(By.id("inputSuccess"));
//	  System.out.println(element.getCssValue("border-color"));
//	  
//  }
  
  @Test
  public void exploreWebElementInterface() {
	  
	  webDriver.get("http://localhost:8081/pages/forms.html");
	  WebElement disabledInut =  webDriver.findElement(By.id("disabledInput"));
	  System.out.println( disabledInut.getAttribute("placeholder"));
	  System.out.println( disabledInut.getLocation()); //(297, 1284)
	  System.out.println( disabledInut.getSize()); //(569, 34)
	  System.out.println( "====================");
	  WebElement textElement =  webDriver.findElement(By.id("textElement"));
	  System.out.println( textElement.getAttribute("placeholder")); 
	  System.out.println( textElement.getLocation()); //(297, 242)
	  System.out.println( textElement.getSize()); //(569, 34)
	  System.out.println( "====================");
	  WebElement fileElement =  webDriver.findElement(By.id("fileElement"));
	  System.out.println( fileElement.getAttribute("placeholder"));
	  System.out.println( fileElement.getLocation()); //(297, 489)
	  System.out.println( fileElement.getSize()); //(265, 22)
	  System.out.println( "====================");
	  WebElement textAreaElement =  webDriver.findElement(By.id("textAreaElement"));
	  System.out.println( textAreaElement.getAttribute("placeholder")); 
	  System.out.println( textAreaElement.getLocation()); //(297, 242)
	  System.out.println( textAreaElement.getSize()); //(569, 34)
	  
	  
	  
  }
  
}
