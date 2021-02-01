package com.bardab.ddt;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	
	
	
	@BeforeTest
	public void before() {
		
		

	}
	
	
	// http://localhost:8081/login
	
	@DataProvider(name="user-ids-passwords-data-provider")
	public Object [][] Logins() {
		
		return new Object[][] {
			{"in28minutes","dummy",true},
			{"adam","adam",false},
			{"eve","eve",false}
			
		};
	}
	
	
	@Test (dataProvider="user-ids-passwords-data-provider")
  public void testSuccessfulLogins(String id,String password,boolean correct){
		
		
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

	
	
	
	
	
//	
//	@AfterTest
//	public void after() {
//		
//	}
	
}
