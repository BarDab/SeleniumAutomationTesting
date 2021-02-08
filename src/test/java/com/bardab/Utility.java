package com.bardab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebElement;

public class Utility {
	
	
	
	public static List<String> getTextFromWebElements (List<WebElement> elements, boolean sortUsingCollections){
		List<String> list = new ArrayList<String>();
		for(WebElement element:elements) {
			System.out.println(element.getText());
			list.add(element.getText());
			}
		if(sortUsingCollections) {
			Collections.sort(list);
		}
		return list;
	}
	

}
