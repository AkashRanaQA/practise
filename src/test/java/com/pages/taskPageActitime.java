package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.Autoconstant;
import com.generics.Basepage;

public class taskPageActitime extends Basepage implements Autoconstant
{
   public WebDriver driver;
   
   @FindBy(xpath="//div[@class='addNewButton']")
   private WebElement addnewbutton;
   
   @FindBy(xpath="//div[text()='+ New Customer']")
   private WebElement newcustomerlink;
   
   @FindBy(xpath="//div[@class='item createNewProject']")
   private WebElement newprojectlink;
   
   public taskPageActitime(WebDriver driver)
   {
	   this.driver = driver;
	   PageFactory.initElements(driver, this);
   }
   
   public void newButtonMethod()
   {
	   waitVisibilityOf(driver, addnewbutton);
	   javascriptClick(driver, addnewbutton);
   }
   public void newCustomerButtonMethod()
   {
      waitVisibilityOf(driver, newcustomerlink);
      javascriptClick(driver, newcustomerlink);
   }
   public void newProjectButtonMethod()
   {
	   waitVisibilityOf(driver, newprojectlink);
	   javascriptClick(driver, newprojectlink);
   }

}
