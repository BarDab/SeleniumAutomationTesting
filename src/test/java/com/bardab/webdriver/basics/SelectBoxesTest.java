package com.bardab.webdriver.basics;

import static org.testng.Assert.assertEquals;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectBoxesTest extends ChromeDriverAbstraction{
	  
	

//@Test
//public void selectBoxesTest() {
//	webDriver.get("http://localhost:8081/pages/forms.html");
//	Select selectBox = new Select( webDriver.findElement(By.id("selectElement1")));
//
//	selectBox.selectByIndex(0);
//	sleep(2);
//	assertEquals(selectBox.getFirstSelectedOption().getAttribute("value"),"1");
//	
//	}

@Test
public void multipleSelectBoxesTest() {
	webDriver.get("http://localhost:8081/pages/forms.html");
	
	selectMultipleSelectBoxesTest("multiSelectElement", new LinkedList<String>(Arrays.asList("1","2")));
	
	
	
	}

public void selectMultipleSelectBoxesTest(String multipleSelectsId, LinkedList<String> valuesOfSelectedBoxes) {
	Select selectBox = new Select( webDriver.findElement(By.id(multipleSelectsId)));
	selectBox.deselectAll();
	
	for(String value:valuesOfSelectedBoxes) {
	selectBox.selectByValue(value);
	sleep(2);
	}
	List<String> actualValues = new LinkedList<String>();
	for(WebElement element:selectBox.getAllSelectedOptions()) {
		actualValues.add(element.getAttribute("value"));
		}
	
	assertEquals(actualValues,valuesOfSelectedBoxes);
}

}
