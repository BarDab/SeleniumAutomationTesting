package com.bardab.crossbrowserframework;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTest {
 
	private WebDriver driver = null;
	
	
	
	@Parameters("browser")
	@BeforeTest
	public void before(@Optional("chrome") String browser) {
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else {throw new RuntimeException("Does not support"+browser);
		
		}
		
	}
	
	
	@Test
	public void pageTest() {
		
		  driver.get("http://localhost:8081/pages/forms.html");
		  assertEquals( driver.findElement(By.className("page-header")).getText(),"Forms");
	}
	
	
	
		@AfterTest
		public void after() {
			driver.close();
		}
	
	
	
}
