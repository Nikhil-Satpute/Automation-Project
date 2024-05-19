package com.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.IndexPage;

public class IndexPagetest extends BaseClass {
IndexPage indexPage;	

@BeforeMethod(groups = {"Smoke", "Sanity", "Regression"})
public void setup() {
launchApp();
}

@AfterMethod(groups = {"Smoke", "Sanity", "Regression"})
public void tearDown() {
getDriver().quit();	
}
	
@Test(groups="Smoke")
public void verifylogo() throws Throwable {
IndexPage indexpage = new IndexPage();
boolean result=indexpage.validatelogo();
Assert.assertTrue(result);
}

@Test(groups="Smoke")
public void verifyTitle() {

String actTitle=indexPage.getMystoreTitle();
Assert.assertEquals(actTitle, "My Store");
}
}
