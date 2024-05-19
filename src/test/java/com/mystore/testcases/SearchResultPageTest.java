package com.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.AddToCartPage;
import com.mystore.pageobjects.IndexPage;
import com.mystore.pageobjects.SearchResultPage;

public class SearchResultPageTest extends BaseClass{

IndexPage indexpage;
SearchResultPage searchresultpage;
AddToCartPage addtocartpage;
	
	
@BeforeMethod(groups = {"Smoke", "Sanity", "Regression"})
public void setup() {
launchApp();
}

@AfterMethod(groups = {"Smoke", "Sanity", "Regression"})
public void tearDown() {
getDriver().quit();	
}
	
@Test(groups="Smoke")
public void productavailabilitytest() throws Throwable {
indexpage = new IndexPage();
searchresultpage =indexpage.SeearchProduct("DRESSES");
Thread.sleep(10000);
boolean result=searchresultpage.isProductAvailable();
Assert.assertTrue(result);
}	

@Test(groups="Smoke")
public void clickonproduct() throws Throwable {
indexpage = new IndexPage();
searchresultpage=indexpage.SeearchProduct("DRESSES");
Thread.sleep(10000);	
addtocartpage=searchresultpage.clickOnProduct();

	
	
	
	
	
}





}
