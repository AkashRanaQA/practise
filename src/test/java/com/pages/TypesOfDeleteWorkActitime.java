package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.Autoconstant;
import com.generics.Basepage;

public class TypesOfDeleteWorkActitime extends Basepage implements Autoconstant
{
   public WebDriver driver;
   
   @FindBy(xpath="//div[.='New Type']")
   private WebElement newtypelink;
   
   @FindBy(xpath="//span[text()='professor']")  //path ta padiva thk se
   private WebElement deleteworklink;
   
   @FindBy(xpath="//div[text()='Delete']")
   private WebElement deletework;
   
   @FindBy(xpath="//button[text()='Ok, Delete']")
   private WebElement deletebutton;
   
   public TypesOfDeleteWorkActitime(WebDriver driver)
   {
	   this.driver=driver;
	   PageFactory.initElements(driver, this);
   }
   
   public void newTypeMethod()
   {
	   waitVisibilityOf(driver, newtypelink);
	newtypelink.click();
   }
   public void deleteWorkMethod()
   {
	   waitVisibilityOf(driver, deleteworklink);
	   deleteworklink.click();
	   waitVisibilityOf(driver, deletework);
	   deletework.click();
	   waitVisibilityOf(driver, deletebutton);
	   deletebutton.click();
   }
}
