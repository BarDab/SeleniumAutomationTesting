package com.bardab.webdriver.basics;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FromElementTextTest extends ChromeDriverAbstraction{
  
	
	
   @Test
  public void findByTextElement() {
	   webDriver.get("http://localhost:8081/pages/forms.html");
	   assertEquals(webDriver.findElement(By.id("textElement")).getAttribute("value"),"in28minutes");
	   
	   webDriver.findElement(By.id("textElement")).clear();
	   webDriver.findElement(By.id("textElement")).sendKeys("NewValue");
	   
	   assertEquals(webDriver.findElement(By.id("textElement")).getAttribute("value"),"NewValue");
	   }
   
   
   @Test
  public void findTextAreaElement() {
	   webDriver.get("http://localhost:8081/pages/forms.html");
	   
	   webDriver.findElement(By.id("textAreaElement")).clear();
	   webDriver.findElement(By.id("textAreaElement")).sendKeys("First Line\nSecond Line");
	   sleep(3);
	   assertEquals(webDriver.findElement(By.id("textAreaElement")).getAttribute("value"),"First Line\nSecond Line");
	   
		
  }
}
