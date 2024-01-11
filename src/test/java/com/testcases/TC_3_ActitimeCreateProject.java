package com.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.generics.Basetest;
import com.pages.createProjectActitime;
import com.pages.homePageActitime;
import com.pages.loginPageActitime;
import com.pages.taskPageActitime;

public class TC_3_ActitimeCreateProject extends Basetest
{
   @Test
   public void login() throws IOException
   {
	   loginPageActitime loginpage= new loginPageActitime(driver);
	   loginpage.loginMethod();
   }
	@Test(dependsOnMethods = "login")
   public void createProject() throws IOException
   {
	   homePageActitime homepage= new homePageActitime(driver);
	   homepage.taskBarMethod();
	   
	   taskPageActitime addnewoption = new taskPageActitime(driver);
	   addnewoption.newButtonMethod();
	   addnewoption.newProjectButtonMethod();
	   
	   createProjectActitime newproject= new createProjectActitime(driver);
	   newproject.createProjectMethod();
   }
	@Test(dependsOnMethods = "createProject")
	public void logout() throws InterruptedException
	{
		homePageActitime logout= new homePageActitime(driver);
		logout.logoutMethod();
	}
}
