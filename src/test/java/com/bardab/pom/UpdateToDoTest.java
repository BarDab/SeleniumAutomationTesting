package com.bardab.pom;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UpdateToDoTest {
	
	
	
	
	@Test
	public void updateToDo() throws InterruptedException {
		String updatedDesc = "This is an updated subscription";
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8081/login");
		
		LoginPage loginPage = PageFactory.initElements(driver,LoginPage.class);
		loginPage.enterDescription("in28minutes");
		loginPage.enterTargetDate("dummy");
		loginPage.submit();
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("Click here")).click();
		Thread.sleep(2000);
		
		ToDoListPage toDoListPage = PageFactory.initElements(driver, ToDoListPage.class);
		toDoListPage.clickUpdate(10002);
		Thread.sleep(2000);
		ToDoPage toDoPage =  PageFactory.initElements(driver,ToDoPage.class);
		toDoPage.updateToDo(updatedDesc, "10/10/2021");

		Thread.sleep(2000);
		assertEquals(toDoListPage.getDescription(10002),updatedDesc);
		assertEquals(toDoListPage.getTargetDate(10002),"10/10/2021");

		driver.close();
	}
	

}
