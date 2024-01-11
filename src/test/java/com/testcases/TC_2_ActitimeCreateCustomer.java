package com.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.generics.Basetest;
import com.pages.createCustomerActitime;
import com.pages.homePageActitime;
import com.pages.loginPageActitime;
import com.pages.taskPageActitime;

public class TC_2_ActitimeCreateCustomer extends Basetest
 {
	@Test
   public void login() throws IOException
   {
	   loginPageActitime loginpage= new loginPageActitime(driver);
	   loginpage.loginMethod();
   }
	@Test(dependsOnMethods = "login")
   public void createCustomer() throws IOException
   {
	   homePageActitime homepage= new homePageActitime(driver);
	   homepage.taskBarMethod();
	   
	   taskPageActitime addnewoption = new taskPageActitime(driver);
	   addnewoption.newButtonMethod();
	   addnewoption.newCustomerButtonMethod();
	   
	   createCustomerActitime createcustomer = new createCustomerActitime(driver);
	   createcustomer.customerTextFieldMethod();
   }
	@Test(dependsOnMethods = "createCustomer")
	public void  logout() throws InterruptedException
	{
		homePageActitime logout = new homePageActitime(driver);
		logout.logoutMethod();
	}
}
