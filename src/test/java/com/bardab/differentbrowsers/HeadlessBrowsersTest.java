package com.bardab.differentbrowsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessBrowsersTest {
//  @Test
	//  public void f() {
//	  WebDriverManager.phantomjs().setup();
//	 WebDriver driver = new PhantomJSDriver();
//	 driver.get("http://localhost:8081/pages/forms.html");
//	 driver.close();
//	  }
//  
  @Test
  public void headlessChrome() {
	  WebDriverManager.chromedriver().setup();
	  ChromeOptions options = new ChromeOptions();
	  options.setHeadless(true);
	  
	  WebDriver driver = new ChromeDriver(options);
	  driver.get("http://localhost:8081/pages/forms.html");
	  System.out.println( driver.findElement(By.className("page-header")).getText());
	  
	}
  
}
