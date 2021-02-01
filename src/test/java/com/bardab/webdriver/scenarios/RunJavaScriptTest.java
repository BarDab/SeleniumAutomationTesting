package com.bardab.webdriver.scenarios;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.bardab.abstractions.ChromeDriverAbstraction;

public class RunJavaScriptTest extends ChromeDriverAbstraction {

  
  
  @Test
  public void getSecondWindowTest() {
	  webDriver.get("http://localhost:8081/pages/tables.html");
	 JavascriptExecutor js = (JavascriptExecutor) webDriver; 
	 String title = (String)js.executeScript("return document.title;");
	 sleep(2);
	 js.executeScript("window.scrollBy(0,200)");
	 sleep(2);
	 js.executeScript("window.scrollBy(0,200)");
	  
	 

  }
  

  

  
}
