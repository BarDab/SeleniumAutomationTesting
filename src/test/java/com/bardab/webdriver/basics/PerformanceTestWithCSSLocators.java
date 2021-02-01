package com.bardab.webdriver.basics;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class PerformanceTestWithCSSLocators extends ChromeDriverAbstraction {
	  @Test
	  public void locateByXPath() {
		  webDriver.get("http://localhost:8081/pages/tables.html");
		  //#dataTables-example > tbody > tr:nth-child(2) > td:nth-child(2)
		  WebElement element = webDriver.findElement(By.xpath("//*[@id='dataTables-example']/tbody/tr[1]/td[2]"));
		  assertEquals(element.getText(),"Firefox 1.0");
		  
		  element = webDriver.findElement(By.xpath("//*[@id='dataTables-example']/tbody/tr[2]/td[2]"));
		  assertEquals(element.getText(),"Firefox 1.5");
		  
		  element = webDriver.findElement(By.xpath("//*[@id='dataTables-example']/tbody/tr[3]/td[2]"));
		  assertEquals(element.getText(),"Firefox 2.0");
		  
		  element = webDriver.findElement(By.xpath("//*[@id='dataTables-example']/tbody/tr[4]/td[2]"));
		  assertEquals(element.getText(),"Firefox 3.0");
		  }
	  
	  @Test
	  public void locateByCSS() {
	  
	  webDriver.get("http://localhost:8081/pages/tables.html");
	  //#dataTables-example > tbody > tr:nth-child(2) > td:nth-child(2)
	 
	  
	  WebElement element = webDriver.findElement(By.cssSelector("#dataTables-example > tbody > tr:nth-child(1) > td:nth-child(2)"));
	  assertEquals(element.getText(),"Firefox 1.0");
	  
	  element = webDriver.findElement(By.cssSelector("#dataTables-example > tbody > tr:nth-child(2) > td:nth-child(2)"));
	  assertEquals(element.getText(),"Firefox 1.5");
	  
	  element = webDriver.findElement(By.cssSelector("#dataTables-example > tbody > tr:nth-child(3) > td:nth-child(2)"));
	  assertEquals(element.getText(),"Firefox 2.0");
	  
	  element = webDriver.findElement(By.cssSelector("#dataTables-example > tbody > tr:nth-child(4) > td:nth-child(2)"));
	  assertEquals(element.getText(),"Firefox 3.0");
	  
	  }
	  
	  @Test
	  public void locateByCSSPerformance() {
	  
	  webDriver.get("http://localhost:8081/pages/tables.html");
	  //#dataTables-example > tbody > tr:nth-child(2) > td:nth-child(2)
	 
	  WebElement tbody = webDriver.findElement(By.cssSelector("#dataTables-example > tbody"));
	  
	  
	  WebElement element = tbody.findElement(By.cssSelector("#dataTables-example > tbody > tr:nth-child(1) > td:nth-child(2)"));
	  assertEquals(element.getText(),"Firefox 1.0");
	  
	  element = tbody.findElement(By.cssSelector("#dataTables-example > tbody > tr:nth-child(2) > td:nth-child(2)"));
	  assertEquals(element.getText(),"Firefox 1.5");
	  
	  element = tbody.findElement(By.cssSelector("#dataTables-example > tbody > tr:nth-child(3) > td:nth-child(2)"));
	  assertEquals(element.getText(),"Firefox 2.0");
	  
	  element = tbody.findElement(By.cssSelector("#dataTables-example > tbody > tr:nth-child(4) > td:nth-child(2)"));
	  assertEquals(element.getText(),"Firefox 3.0");
	  
	  }
	  
	  
	  
	  
	  
	}
