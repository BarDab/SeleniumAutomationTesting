package com.bardab.webdriver.basics;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LocateWithXPathTest extends ChromeDriverAbstraction {
	  @Test
	  public void locateByXPath() {
		  webDriver.get("http://localhost:8081/pages/tables.html");
		  //#dataTables-example > tbody > tr:nth-child(2) > td:nth-child(2)
		  WebElement element = webDriver.findElement(By.xpath("//*[@id='dataTables-example']/tbody/tr[1]/td[2]"));
		  assertEquals(element.getText(),"Firefox 1.0");
	  }
	  
	  @Test
	  public void locateByXPathAfterSorting() {
		  webDriver.get("http://localhost:8081/pages/tables.html");
		  WebElement element = webDriver.findElement(By.xpath("//*[@id='dataTables-example']/thead/tr/th[2]"));
		  element.click();
		  element = webDriver.findElement(By.xpath("//*[@id='dataTables-example']/tbody/tr[1]/td[2]"));
		  assertEquals(element.getText(),"All others");
	  }
	}
