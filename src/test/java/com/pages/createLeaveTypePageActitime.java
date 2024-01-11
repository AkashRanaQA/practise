package com.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.Autoconstant;
import com.generics.Basepage;
import com.generics.ExcelLibrary;

public class createLeaveTypePageActitime extends Basepage implements Autoconstant
{
    public WebDriver driver;
    
    @FindBy(xpath="//input[@placeholder='Enter name']")
    private WebElement leavetextfield;
    
    @FindBy(xpath="//button[@type='submit']")
    private WebElement savebutton;
    
    public createLeaveTypePageActitime(WebDriver driver)
    {
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
    }
    
    public void createLeaveTypeMethod() throws IOException
    {
    	waitVisibilityOf(driver, leavetextfield);
    	leavetextfield.sendKeys(ExcelLibrary.getStringTypcellData(sheet_leavetypepage, 0, 0));
    	
    	waitVisibilityOf(driver, savebutton);
    	javascriptClick(driver, savebutton);
    }
}
