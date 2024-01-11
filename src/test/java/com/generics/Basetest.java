package com.generics;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class Basetest implements Autoconstant
{
  public static WebDriver driver;
  
  @BeforeSuite
  public void executionStart()
  {
	  Reporter.log("execution starts at suite level" , true);
  }
  
  @Parameters("browser")
  @BeforeClass
  public void setup(String browser)
  {
	  
	  if (browser.equalsIgnoreCase("edge"))
	  {
		  driver=new EdgeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		  driver.get("https://online.actitime.com/swain/login.do");
	  }
	  else if (browser.equalsIgnoreCase("firefox"))
	  {
		  driver=new FirefoxDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		  driver.get("https://online.actitime.com/swain/login.do");
	  }
  }
  @AfterClass
  public void teardown()
  {
	  driver.quit();
  }
}
