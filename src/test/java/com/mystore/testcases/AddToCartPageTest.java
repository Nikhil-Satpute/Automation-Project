package com.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.AddToCartPage;
import com.mystore.pageobjects.IndexPage;
import com.mystore.pageobjects.SearchResultPage;

public class AddToCartPageTest extends BaseClass{

IndexPage indexpage;
SearchResultPage searchresultpage;
AddToCartPage addtocartpage;
	
@BeforeMethod(groups = {"Smoke", "Sanity", "Regression"})
public void setup()	{
launchApp();	
}

@AfterMethod(groups = {"Smoke", "Sanity", "Regression"})
public void teardown() {
getDriver().quit();	
}

@Test(groups= {"Regression","Sanity"})
public void addtocarttest() throws Throwable {	
indexpage =new IndexPage();
searchresultpage=indexpage.SeearchProduct("DRESSES");
addtocartpage=searchresultpage.clickOnProduct();
Thread.sleep(5000);
addtocartpage.selectsize("M");
Thread.sleep(5000);
addtocartpage.enterquantity("2");	
addtocartpage.clickonAddToCart();
Thread.sleep(5000);
boolean Result=addtocartpage.validateAddToCart();
Assert.assertTrue(Result);	
}
}
