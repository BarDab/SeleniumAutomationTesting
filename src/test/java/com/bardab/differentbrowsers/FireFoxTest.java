package com.bardab.differentbrowsers;

import org.testng.annotations.Test;

import com.bardab.abstractions.FireFoxDriverAbstraction;

public class FireFoxTest extends FireFoxDriverAbstraction{
  @Test
  public void runInFirefox() {
	  webDriver.get("http://localhost:8081/pages/tables.html");
  }
}
