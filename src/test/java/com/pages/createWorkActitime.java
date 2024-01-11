package com.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.Autoconstant;
import com.generics.Basepage;
import com.generics.ExcelLibrary;

public class createWorkActitime extends Basepage implements Autoconstant
{
   public WebDriver driver;
   
   @FindBy(xpath="//input[@placeholder='Enter name']")
    private WebElement worktextfield;
   
   @FindBy(xpath="//button[@type='submit']")
   private WebElement submitbutton;
   
   public createWorkActitime(WebDriver driver)
   {
	   this.driver=driver;
	   PageFactory.initElements(driver, this);
   }
   
   public void createWorkFieldMethod() throws IOException
   {
	   waitVisibilityOf(driver, worktextfield);
	   worktextfield.sendKeys(ExcelLibrary.getStringTypcellData(sheet_workpage, 0, 0));
	   
	   waitVisibilityOf(driver, submitbutton);
	   javascriptClick(driver, submitbutton);
   }
}
