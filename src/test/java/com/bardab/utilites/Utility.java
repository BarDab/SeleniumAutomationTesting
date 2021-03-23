package com.bardab.utilites;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.XMLWorkerHelper;

public class Utility {
	
	
	
	public static List<String> getTextFromWebElements (List<WebElement> elements){
		List<String> list = new ArrayList<String>();
		for(WebElement element:elements) {
			System.out.println(element.getText());
			list.add(element.getText());
			}

		return list;
	}
	
	public static List<String> sortListByName(List<String> unsortedList){
		List<String> list = unsortedList;
		Collections.sort(list);
		return list;
		
	}
	
	public static String getSecondWindowHandle(WebDriver driver,String firstWindowHandle) {
		   for(String windowHandle: driver.getWindowHandles()) {
			if(!windowHandle.equals(firstWindowHandle)) {
				return windowHandle;
			}
		  }
		   return firstWindowHandle;
		}
	
	
	public static double extractDoubleFromDollarValue(String dollarValue) {
		return Double.parseDouble( dollarValue.replace("$", "").replace(",", ""));
	}
	
	

}
