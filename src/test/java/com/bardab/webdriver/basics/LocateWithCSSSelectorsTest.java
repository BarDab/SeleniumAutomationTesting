package com.bardab.webdriver.basics;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LocateWithCSSSelectorsTest extends ChromeDriverAbstraction {
  @Test
  public void locateByCSS() {
	  webDriver.get("http://localhost:8081/pages/tables.html");
	  //#dataTables-example > tbody > tr:nth-child(2) > td:nth-child(2)
	  WebElement element = webDriver.findElement(By.cssSelector("#dataTables-example > tbody > tr:nth-child(2) > td:nth-child(2)"));
	  assertEquals(element.getText(),"Firefox 1.5");
  }
  
  @Test
  public void locateByCSSAfterSorting() {
	  webDriver.get("http://localhost:8081/pages/tables.html");
	  WebElement element = webDriver.findElement(By.cssSelector("#dataTables-example > thead > tr > th:nth-child(2)"));
	  element.click();
	  element = webDriver.findElement(By.cssSelector("#dataTables-example > tbody > tr.gradeU.odd > td.sorting_1"));
	  assertEquals(element.getText(),"All others");
  }
}
