package com.bardab;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.bardab.ExcelReadUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageTest {
	
	private WebDriver driver;
	private LoginPage loginPage;
	private WebDriverWait explicitWait;
	private String url;
	
	
	@BeforeTest
	public void initialize() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();	
		loginPage = PageFactory.initElements(this.driver, LoginPage.class);
		explicitWait = new WebDriverWait(driver,10);
		url = "http://www.demo.guru99.com/V4/";
		
	}
	
	
	@DataProvider(name="user-ids-passwords-data-provider-xlsx")
	public String[][] Logins() {
		
		return ExcelReadUtil.readExcelInto2DArray("src\\\\test\\\\resources\\\\BankingAppTestData.xlsx", "LoginPageTestData", 4);
	}
	
	
	@Test(dataProvider="user-ids-passwords-data-provider-xlsx")
	public void loginTest(String id, String password, String nameOrAlertText, String results) throws InterruptedException, IOException {
		boolean result = Boolean.valueOf(results);
		driver.get(url);
		loginPage.enterUserId(id);
		loginPage.enterPassword(password);
		loginPage.submit();
		
	
		if(result) { 
			explicitWait.until(ExpectedConditions.titleContains("Guru99 Bank Manager HomePage"));
			File screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenShot, new File( "target\\"+"screenShot.png"));
			assertEquals(this.driver.findElement(By.cssSelector("#site-name > a:nth-child(1)")).getText(),nameOrAlertText);
			assertEquals(this.driver.findElement(By.cssSelector("tr.heading3 > td:nth-child(1)")).getText(),"Manger Id : "+id);
			
		}
		else if(!result) {
			explicitWait.until(ExpectedConditions.alertIsPresent());  
			Alert alert = driver.switchTo().alert();
			assertEquals(alert.getText(),nameOrAlertText);
			alert.dismiss();
		  }
	 }
	
	
	@AfterTest
	public void after() {
		this.driver.close();
		}
	
	
			  
			  
			  
			
			
			
			 
			
			
	
	
	

}
