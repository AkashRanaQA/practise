package com.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.Autoconstant;
import com.generics.Basepage;
import com.generics.ExcelLibrary;

public class createProjectActitime extends Basepage implements Autoconstant
{
  public WebDriver driver;
  
  @FindBy(xpath="(//input[@placeholder='Enter Project Name'])[2]")
  private WebElement projectnamefield;
  
  @FindBy(xpath="//div[text()='-- Please Select Customer to Add Project for --']")
  private WebElement projecttextfield;
  
  @FindBy(xpath="(//div[text()='Galaxy Corporation'])[7]")
  private WebElement chooseoption;
  
  @FindBy(xpath="//textarea[@placeholder='Add Project Description']")
  private WebElement descriptiontextfield;
  
  @FindBy(xpath="//div[text()='Create Project']")
  private WebElement createprojectbutton;
  
  public createProjectActitime(WebDriver driver)
  {
	  this.driver = driver;
	  PageFactory.initElements(driver, this);
  }
  
  public void createProjectMethod() throws IOException
  {
	  waitVisibilityOf(driver, projectnamefield);
	  projectnamefield.sendKeys(ExcelLibrary.getStringTypcellData(sheet_projectpage, 0, 0));
	  
	  waitVisibilityOf(driver, projecttextfield);
	  javascriptClick(driver, projecttextfield);
	  
	  waitVisibilityOf(driver, chooseoption);
	  javascriptClick(driver, chooseoption);
	  
	  waitVisibilityOf(driver, descriptiontextfield);
	  descriptiontextfield.sendKeys(ExcelLibrary.getStringTypcellData(sheet_projectpage, 1, 0));
	  
	  waitVisibilityOf(driver, createprojectbutton);
	  javascriptClick(driver, createprojectbutton);
  }
}
