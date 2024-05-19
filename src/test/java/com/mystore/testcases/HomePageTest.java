package com.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.HomePage;
import com.mystore.pageobjects.IndexPage;
import com.mystore.pageobjects.LoginPage;

public class HomePageTest extends BaseClass {

IndexPage indexpage;
LoginPage loginpage;
HomePage homepage;
	
	
	
	
@BeforeMethod(groups = {"Smoke", "Sanity", "Regression"})
public void setup() {
launchApp();	
}
	
@AfterMethod(groups = {"Smoke", "Sanity", "Regression"})
public void teardown() {
getDriver().quit();
}


@Test(groups="Smoke")
public void validateorderhistorytest() throws Throwable {
indexpage= new IndexPage();
loginpage= indexpage.clickonsignin();
homepage=loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
boolean result =homepage.validaterderHistory();	
Assert.assertTrue(result);
	
}

@Test(groups="Smoke")
public void validateaddresstest() throws Throwable {
indexpage= new IndexPage();
loginpage= indexpage.clickonsignin();
homepage=loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
boolean result =homepage.validatemyaddress();
Assert.assertTrue(result);
	
}	
}
