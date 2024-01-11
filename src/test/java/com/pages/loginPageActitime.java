package com.pages;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.Autoconstant;
import com.generics.Basepage;
import com.generics.ExcelLibrary;

public class loginPageActitime extends Basepage implements Autoconstant
{
  public WebDriver driver;
  
  @FindBy(id="username")
  private WebElement usernameTextField;
  
  @FindBy(name="pwd")
  private WebElement passwordTextField;
  
  @FindBy(id="keepLoggedInCheckBox")
  private WebElement loggedinCheckbox;
  
  @FindBy(id="loginButton")
  private WebElement loginbutton;
  
  public loginPageActitime(WebDriver driver)
  {
	  this.driver=driver;
	  PageFactory.initElements(driver, this);
  }
  
  public void loginMethod() throws IOException
  {
	  waitVisibilityOf(driver, usernameTextField);
	  usernameTextField.sendKeys(ExcelLibrary.getStringTypcellData(sheet_login, 0, 1));
	  
	  waitVisibilityOf(driver, passwordTextField);
	  passwordTextField.sendKeys(ExcelLibrary.getStringTypcellData(sheet_login, 1, 1));
	  
	  waitVisibilityOf(driver, loggedinCheckbox);
	  javascriptClick(driver, loggedinCheckbox);
	  
	  waitVisibilityOf(driver, loginbutton);
	  javascriptClick(driver, loginbutton);
	  
  }
} 