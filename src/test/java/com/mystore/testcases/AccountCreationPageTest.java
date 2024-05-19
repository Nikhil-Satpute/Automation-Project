package com.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.AccountCreationPage;
import com.mystore.pageobjects.IndexPage;
import com.mystore.pageobjects.LoginPage;

public class AccountCreationPageTest extends BaseClass {

IndexPage indexpage;
LoginPage loginpage;
AccountCreationPage accountcreationpage;	
	
@BeforeMethod(groups = {"Smoke", "Sanity", "Regression"})
public void setup() {
launchApp();	
}
	
@AfterMethod(groups = {"Smoke", "Sanity", "Regression"})
public void tearDown() {
getDriver().quit();	
}
	

@Test(groups="Sanity")
public void verifycreateaccountpagetest() throws Throwable {

indexpage = new IndexPage();
loginpage = indexpage.clickonsignin();
accountcreationpage =loginpage.createNewAccount("nikhilsatpute097@gmail.com");
boolean result=accountcreationpage.validateAccount();
Assert.assertTrue(result);
  }	
}
