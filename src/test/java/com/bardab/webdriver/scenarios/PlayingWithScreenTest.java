package com.bardab.webdriver.scenarios;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import com.bardab.abstractions.ChromeDriverAbstraction;

public class PlayingWithScreenTest extends ChromeDriverAbstraction{
  @Test
  public void resizeWindowTest() {
	  webDriver.get("http://localhost:8081/pages/forms.html");
	  webDriver.manage().window().fullscreen();
	  sleep(2);
	  webDriver.manage().window().setSize(new Dimension (200,200));;
	  sleep(2);
	  webDriver.manage().window().setPosition(new Point(200,200));;
	  sleep(2);
	  webDriver.manage().window().maximize();
	  sleep(2);
  }
  
  @Test
  public void switchBetweenPagesTest() {
	  webDriver.get("http://localhost:8081/pages/forms.html");
	  sleep(1);
	  webDriver.get("http://localhost:8081/pages/index.html");
	  sleep(1);
	  webDriver.get("http://localhost:8081/pages/flot.html");
	  sleep(1);
	  webDriver.get("http://localhost:8081/pages/tables.html");
	  sleep(1);
	  webDriver.get("http://localhost:8081/pages/panels-wells.html");
	  sleep(1);
	  webDriver.navigate().back();
	  sleep(1);
	  webDriver.navigate().forward();
	  sleep(1);
	  webDriver.navigate().refresh();
	  sleep(1);
	  webDriver.navigate().to("http://localhost:8081/pages/forms.html");
	  sleep(1);
	  
}}
