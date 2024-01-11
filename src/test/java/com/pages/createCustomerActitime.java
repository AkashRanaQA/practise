package com.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.Autoconstant;
import com.generics.Basepage;
import com.generics.ExcelLibrary;

public class createCustomerActitime extends Basepage implements Autoconstant
{
   public WebDriver driver;
   
   @FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
   private WebElement customertextfield;
   
   @FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
   private WebElement descriptiontextfield;
   
   @FindBy(xpath="//div[text()='Create Customer']")
   private WebElement createcustomerbutton;
   
   public createCustomerActitime(WebDriver driver)
   {
	   this.driver= driver;
	   PageFactory.initElements(driver, this);
   }
   
   public void customerTextFieldMethod() throws IOException
   {
	   waitVisibilityOf(driver, customertextfield);
	   customertextfield.sendKeys(ExcelLibrary.getStringTypcellData(sheet_createcustomerpage, 0, 0));
	   
	   waitVisibilityOf(driver, descriptiontextfield);
	   descriptiontextfield.sendKeys(ExcelLibrary.getStringTypcellData(sheet_createcustomerpage, 0, 1));
	   
	   waitVisibilityOf(driver, createcustomerbutton);
	   javascriptClick(driver, createcustomerbutton);
   }
}
