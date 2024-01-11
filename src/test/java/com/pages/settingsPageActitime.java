package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.Autoconstant;
import com.generics.Basepage;

public class settingsPageActitime extends Basepage implements Autoconstant
{
   public WebDriver driver;
   
   @FindBy(xpath="//a[.='Types of Work']")
   private WebElement typesofworklink;
   
   @FindBy(xpath="//a[text()='Leave Types']")
   private WebElement leavetypelink;
   
   public settingsPageActitime(WebDriver driver)
   {
	   this.driver=driver;
	   PageFactory.initElements(driver, this);
   }
   
   public void typeOfWorkMethod()
   {
	   waitVisibilityOf(driver, typesofworklink);
	   javascriptClick(driver, typesofworklink);
	   
	   waitVisibilityOf(driver, leavetypelink);
	   javascriptClick(driver, leavetypelink);
   }
}
