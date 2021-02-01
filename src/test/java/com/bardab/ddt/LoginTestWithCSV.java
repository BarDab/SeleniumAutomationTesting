package com.bardab.ddt;

import static org.testng.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.opencsv.CSVReader;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTestWithCSV {
	
	
	
	
	@BeforeTest
	public void before() {
		
		

	}
	
	
	// http://localhost:8081/login
	
	@DataProvider(name="user-ids-passwords-data-provider-csv")
	public Iterator<String[]> Logins() {
		
		return readCSV("src\\test\\resources\\logins.csv").iterator();
	}
	
	
	@Test (dataProvider="user-ids-passwords-data-provider-csv")
  public void testSuccessfulLogins(String id,String password,String validation){
		
		boolean correct = Boolean.valueOf(validation); 
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8081/login");
		driver.findElement(By.id("name")).sendKeys(id);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("submit")).click();
		if(correct) {
		assertEquals(driver.findElement(By.id("welcome-message")).getText(),"Welcome in28minutes!! Click here to manage your todo's.");
		}
		else if(!correct) {
		assertEquals(driver.findElement(By.id("error-message")).getText(),"Invalid Credentials");
		}
		
		 
		 driver.close();
		}
	
	
	
	public List<String[]> readCSV(String csvFilePath)  {
		
		try {
			CSVReader csvReader = new CSVReader(new FileReader(csvFilePath));
			List<String[]> data = csvReader.readAll();
			return data;
			}
		catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		
		
		
	}
	
	
	
//	
//	@AfterTest
//	public void after() {
//		
//	}
	
}
