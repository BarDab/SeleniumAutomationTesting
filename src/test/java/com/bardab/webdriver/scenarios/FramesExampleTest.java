package com.bardab.webdriver.scenarios;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.bardab.abstractions.ChromeDriverAbstraction;

public class FramesExampleTest extends ChromeDriverAbstraction {

  
  
  @Test
  public void getSecondWindowTest() {
	  webDriver.get("http://localhost:8081/pages/frames-example.html");
	  webDriver.switchTo().frame(0);
	  System.out.println(webDriver.findElement(By.tagName("h1")).getText());
	  
	  
	  assertEquals(webDriver.findElement(By.id("textElement")).getAttribute("value"),"in28minutes");
	  
	  webDriver.switchTo().parentFrame();
	  webDriver.switchTo().frame(1);
	  System.out.println(webDriver.findElement(By.tagName("h1")).getText());
	  assertEquals(webDriver.findElement(By.id("textElementWithPlaceHolder")).getAttribute("placeholder"),"Enter text");
	  


  }
  

  

  
}
