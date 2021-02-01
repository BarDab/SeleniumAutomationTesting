package com.bardab.webdriver.scenarios;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.bardab.abstractions.ChromeDriverAbstraction;

public class AccessTablesTest extends ChromeDriverAbstraction {

  
  
  @Test
  public void getTableCell() {
	  webDriver.get("http://localhost:8081/pages/tables.html");
	  TableReader tableReader = new TableReader(webDriver,"dataTables-example");
	  System.out.println( tableReader.getTableElement(2, 2));
	 

  }
  

  

  
}
