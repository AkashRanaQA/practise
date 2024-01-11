package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.Autoconstant;
import com.generics.Basepage;

public class userPageActitime extends Basepage implements Autoconstant
{
   public WebDriver driver;
   
   @FindBy(xpath="(//div[@class='components_button_label'])[1]")
   private WebElement newuserlink;
   
   public userPageActitime(WebDriver driver)
   {
	   this.driver=driver;
	   PageFactory.initElements(driver, this);
   }
   
   public void newUserLinkMethod()
   {
	   waitVisibilityOf(driver, newuserlink);
	   javascriptClick(driver, newuserlink);
   }
}
