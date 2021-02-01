package com.bardab.webdriver.scenarios;



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import com.bardab.abstractions.ChromeDriverAbstraction;

public class AutomatedScreenshotTest extends ChromeDriverAbstraction {

  
  
  @Test
  public void getSecondWindowTest() throws IOException {
	  webDriver.get("http://localhost:8081/pages/frames-example.html");
	  File screenShot = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.FILE);
	  System.out.println(screenShot.getAbsolutePath());
	  FileUtils.copyFile(screenShot, new File( "target\\"+"screenShot.png"));
	  }
  

  

  
}
