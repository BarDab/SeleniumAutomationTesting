package com.bardab.webdriver.basics;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class RAdioButtonTest  extends ChromeDriverAbstraction{
		  
	

	@Test
	public void selectRadioButtonTest() {
		webDriver.get("http://localhost:8081/pages/forms.html");
		selectRadioButton("optionsRadios","optionsRadios1");
		selectRadioButton("optionsRadiosInline","optionsRadiosInline1");
		}
	
	
    public void selectRadioButton(String radioButtonsName, String radioButtonId) {
	
	List<WebElement> radioButtons = webDriver.findElements(By.name(radioButtonsName));
	
	for(WebElement radioButton: radioButtons) {
		if(!radioButton.isSelected()&radioButton.getAttribute("id").equals(radioButtonId)) {
			radioButton.click();
			sleep(2);
			}
	}
	assertTrue(webDriver.findElement(By.id(radioButtonId)).isSelected());
	}
			
}
