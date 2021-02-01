package com.bardab;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class StandaloneTest {
	
	
	
	
//	@Test
//	public void standalone() throws MalformedURLException, InterruptedException {
//		DesiredCapabilities capabilities = new DesiredCapabilities();
//		capabilities.setBrowserName("chrome");
//		
//		
//		WebDriver remoteDriver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),capabilities);
//		remoteDriver.get("https://www.facebook.com/");
//	
//		assertEquals(remoteDriver.findElement(By.id("consent_cookies_title")).getText(),"Accept cookies from Facebook on this browser?");
//		Thread.sleep(2000);
//		remoteDriver.close();
//		
//	}
	
	@Test(threadPoolSize=2, invocationCount=4)
	public void hub() throws MalformedURLException, InterruptedException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setBrowserName("chrome");
		
		
		WebDriver remoteDriver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),capabilities);
		remoteDriver.get("https://www.facebook.com/");
	
		assertEquals(remoteDriver.findElement(By.id("consent_cookies_title")).getText(),"Accept cookies from Facebook on this browser?");
		Thread.sleep(2000);
		remoteDriver.close();
		
	}
	

}
