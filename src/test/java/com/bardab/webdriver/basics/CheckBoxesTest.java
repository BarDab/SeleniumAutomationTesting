package com.bardab.webdriver.basics;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CheckBoxesTest extends ChromeDriverAbstraction{
  @Test
  public void checkBoxesTest() {
	  webDriver.get("http://localhost:8081/pages/forms.html");
	
		 
		  checkACheckBox("checkboxElement1");
		  checkACheckBox("checkboxElement2");
		  checkACheckBox("checkboxElement3");
		  
		  checkACheckBox("inlineCheckboxElement1");
		  checkACheckBox("inlineCheckboxElement2");
		  checkACheckBox("inlineCheckboxElement3");

		  
		  uncheckACheckBox("checkboxElement1");
		  uncheckACheckBox("checkboxElement2");
		  uncheckACheckBox("checkboxElement3");
		  
		  uncheckACheckBox("inlineCheckboxElement1");
		  uncheckACheckBox("inlineCheckboxElement2");
		  uncheckACheckBox("inlineCheckboxElement3");
		  
	  }
  public void checkACheckBox(String checkBoxId) {
	  if( !webDriver.findElement(By.id(checkBoxId)).isSelected()) {
		  webDriver.findElement(By.id(checkBoxId)).click();
		  sleep(2);
		  assertTrue(webDriver.findElement(By.id(checkBoxId)).isSelected());
		 }
	  }
  
  public void uncheckACheckBox(String checkBoxId) {
	  if( webDriver.findElement(By.id(checkBoxId)).isSelected()) {
		  webDriver.findElement(By.id(checkBoxId)).click();
		  sleep(2);
		  assertFalse(webDriver.findElement(By.id(checkBoxId)).isSelected());
		 }
	  }
  
}
