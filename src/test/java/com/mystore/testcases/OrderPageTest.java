package com.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.AddToCartPage;
import com.mystore.pageobjects.IndexPage;
import com.mystore.pageobjects.OrderPage;
import com.mystore.pageobjects.SearchResultPage;

public class OrderPageTest extends BaseClass{
IndexPage indexpage;
SearchResultPage searchresultpage;
AddToCartPage addtocartpage;
OrderPage orderpage;
	
	
@BeforeMethod(groups = {"Smoke", "Sanity", "Regression"})
public void setup() {
launchApp();
}
	
@AfterMethod(groups = {"Smoke", "Sanity", "Regression"})
public void tearDown() {
getDriver().quit();	
}
	
@Test(groups="Regression")
public void verifyTotalPrice() throws Throwable {
indexpage = new IndexPage();
searchresultpage=indexpage.SeearchProduct("DRESSES");
addtocartpage=searchresultpage.clickOnProduct();
Thread.sleep(5000);
addtocartpage.selectsize("M");
addtocartpage.enterquantity("2");
addtocartpage.clickonAddToCart();
Thread.sleep(5000);
orderpage=addtocartpage.proceesedtocheckout();
Double Unitprize=orderpage.getUnitPrize();
Thread.sleep(3000);
Double totalprize=orderpage.getTotalPrize();
Double totalExpectedPrice=(Unitprize*2)+7;
Assert.assertEquals(totalprize, totalExpectedPrice);

}	
}
