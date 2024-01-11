package com.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.generics.Basetest;
import com.pages.homePageActitime;
import com.pages.loginPageActitime;

public class TC_1_ActitimeLoginLogOut extends Basetest 
{
	@Test
	public void login() throws IOException
	{
		loginPageActitime loginpage= new loginPageActitime(driver);
		loginpage.loginMethod();
	}
  @Test(dependsOnMethods = "login")
  public void logout() throws InterruptedException
  {
	  homePageActitime homepage = new homePageActitime(driver);
	  homepage.logoutMethod();
  }
}
