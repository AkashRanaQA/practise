package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.Autoconstant;
import com.generics.Basepage;

public class TypesOfDeleteLeaveActitime extends Basepage implements Autoconstant
{
  public WebDriver driver;
  
  @FindBy(xpath="//div[text()='New Type']")
  private WebElement newleavetypelink;
  
  @FindBy(xpath="//span[text()='dengu2']")  //pare dekhahaba
  private WebElement deleteleavelink;
  
  @FindBy(xpath="//span[text()='Delete']")
  private WebElement deletebutton;
  
  @FindBy(xpath="//button[text()='Ok, Delete']")
  private WebElement deleteconfirmlink;
  
  public TypesOfDeleteLeaveActitime(WebDriver driver)
  {
	  this.driver=driver;
	  PageFactory.initElements(driver, this);
  }
  
  public void typeOfLeaveMethod()
  {
	  waitVisibilityOf(driver, newleavetypelink);
	  javascriptClick(driver, newleavetypelink);
  }
  public void deleteLeaveMethod()
  {
	  waitVisibilityOf(driver, deleteleavelink);
	  javascriptClick(driver, deleteleavelink);
	  waitVisibilityOf(driver, deletebutton);
	  javascriptClick(driver, deletebutton);
	  waitVisibilityOf(driver, deleteconfirmlink);
	  javascriptClick(driver, deleteconfirmlink);
  }
}
