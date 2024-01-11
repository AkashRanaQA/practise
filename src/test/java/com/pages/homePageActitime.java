package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.Autoconstant;
import com.generics.Basepage;

public class homePageActitime extends Basepage implements Autoconstant
{
  public WebDriver driver;
  
  @FindBy(id="logoutLink")
  private WebElement logoutlink;
  
  @FindBy(xpath="(//div[@class='popup_menu_icon'])[2]")
  private WebElement settingslink;
  
  @FindBy(id="container_tasks")
  private WebElement taskbarlink;
  
  public homePageActitime(WebDriver driver)
  {
	  this.driver=driver;
	  PageFactory.initElements(driver, this);
  }
  
  public void logoutMethod() throws InterruptedException
  {
	 waitVisibilityOf(driver, logoutlink);
	  javascriptHighlightElement(driver, logoutlink);
	  javascriptClick(driver, logoutlink);
  }
  public void settingsMethod()
  {
	  waitVisibilityOf(driver, settingslink);
	  javascriptClick(driver, settingslink);
  }
  public void taskBarMethod()
  {
	  waitVisibilityOf(driver, taskbarlink);
	  javascriptClick(driver, taskbarlink);
  }
}
