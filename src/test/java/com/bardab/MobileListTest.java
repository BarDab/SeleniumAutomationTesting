package com.bardab;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MobileListTest {
	
	private WebDriver driver;
	private StartingPage startingPage;
	private WebDriverWait explicitWait;
	private MobilePage mobilePage;
	private SonyXperiaPage sonyXperiaPage;
	
	
	@BeforeTest
	public void init() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get(" http://live.demoguru99.com/\r\n");
		
		startingPage = PageFactory.initElements(driver, StartingPage.class);
		mobilePage = PageFactory.initElements(driver, MobilePage.class);
		sonyXperiaPage = PageFactory.initElements(driver, SonyXperiaPage.class);
		
		explicitWait = new WebDriverWait(driver,10);
		}
	
//	@Test
//	public void sortMobileList() throws InterruptedException {
//		Thread.sleep(3000);
//		assertEquals(driver.findElement(By.tagName("h2")).getText(),"THIS IS DEMO SITE FOR   ");
//		startingPage.clickMobile();
//		
//		explicitWait.until(ExpectedConditions.titleContains("Mobile"));
//		
//		List<String> list = Utility.getTextFromWebElements(mobilePage.getSmartphones(),true);
//		assertEquals(Utility.getTextFromWebElements(mobilePage.getSmartphonesSortedBy("Name"),false),list);
//		}
	
	@Test 
	public void checkIfPriceValueIsEqual() {
		startingPage.clickMobile();
		explicitWait.until(ExpectedConditions.titleContains("Mobile"));
		String priceFromList = mobilePage.getSonyXperiaPrice();
		mobilePage.goToSonyXperiaPage();
		assertEquals(sonyXperiaPage.getPrice(),priceFromList);
		
	}
	
	
	
		
	
	@AfterTest
	public void after() {
		
		driver.close();
	}

}
