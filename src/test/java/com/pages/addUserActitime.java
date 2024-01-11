package com.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.Autoconstant;
import com.generics.Basepage;
import com.generics.ExcelLibrary;

public class addUserActitime extends Basepage implements Autoconstant
{
   public WebDriver driver;
   
   @FindBy(xpath="(//input[@name='firstName'])[2]")
   private WebElement firstnametextfield;
   
   @FindBy(xpath="(//input[@name='lastName'])[2]")
   private WebElement lastnametextfield;
   
   @FindBy(xpath="(//input[@placeholder='Email'])[3]")
   private WebElement emaillink;
   
   @FindBy(xpath="//div[text()='Save & Send Invitation']")
   private WebElement savesendbutton;
   
   @FindBy(xpath="(//span[text()='Close'])[1]")
   private WebElement closelink;
   
   public addUserActitime(WebDriver driver)
   {
	   this.driver=driver;
	   PageFactory.initElements(driver, this);
   }
   
   public void addUserMethod() throws IOException
   {
	   waitVisibilityOf(driver, firstnametextfield);
	   firstnametextfield.sendKeys(ExcelLibrary.getStringTypcellData(sheet_workpage, 2, 0));
	   
	   waitVisibilityOf(driver, lastnametextfield);
	   lastnametextfield.sendKeys(ExcelLibrary.getStringTypcellData(sheet_workpage, 2, 1));
	   
	   waitVisibilityOf(driver, emaillink);
	   emaillink.sendKeys(ExcelLibrary.getStringTypcellData(sheet_workpage, 2, 2));
	   
	   waitVisibilityOf(driver, savesendbutton);
	   savesendbutton.click();
	   
	   waitVisibilityOf(driver, closelink);
	   javascriptClick(driver, closelink);
   }
}
