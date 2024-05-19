package com.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.AddToCartPage;
import com.mystore.pageobjects.AddressPage;
import com.mystore.pageobjects.IndexPage;
import com.mystore.pageobjects.LoginPage;
import com.mystore.pageobjects.OrderConfirmationPage;
import com.mystore.pageobjects.OrderPage;
import com.mystore.pageobjects.OrderSummeryPage;
import com.mystore.pageobjects.PaymentPage;
import com.mystore.pageobjects.SearchResultPage;
import com.mystore.pageobjects.ShippingPage;

public class EndToEndTest extends BaseClass {

IndexPage indexpage;
SearchResultPage searchresultpage;
AddToCartPage addtocartpage;
OrderPage orderpage;
LoginPage loginpage;
AddressPage addresspage;
ShippingPage shippingpage;
PaymentPage paymentpage;
OrderSummeryPage ordersummerypage;
OrderConfirmationPage orderconfirmationpage;
	
	
@BeforeMethod(groups = {"Smoke", "Sanity", "Regression"})
public void setup() {
launchApp();
}
	
@AfterMethod(groups = {"Smoke", "Sanity", "Regression"})
public void tearDown() {
getDriver().quit();	
}
	
@Test(groups="Regression")
public void endtoendtest() throws Throwable {
indexpage = new IndexPage();
searchresultpage=indexpage.SeearchProduct("DRESSES");
addtocartpage=searchresultpage.clickOnProduct();
Thread.sleep(5000);
addtocartpage.selectsize("M");
Thread.sleep(2000);
addtocartpage.enterquantity("2");	
addtocartpage.clickonAddToCart();
Thread.sleep(3000);
orderpage=addtocartpage.proceesedtocheckout();
Thread.sleep(3000);
loginpage=orderpage.clickOncheckout();
Thread.sleep(3000);
addresspage=loginpage.login1(prop.getProperty("username"), prop.getProperty("password"));
shippingpage=addresspage.clickOnCheckout();
Thread.sleep(3000);
shippingpage.checkterms();
paymentpage=shippingpage.clickonproceedtocheckout();
ordersummerypage=paymentpage.clickonpaybyBankwire();
Thread.sleep(4000);
orderconfirmationpage=ordersummerypage.clickonconfirmorder();	
String actmsg=orderconfirmationpage.validatemessage();
String expmsg="Your order on My Shop is complete.";
Assert.assertEquals(actmsg, expmsg);

}
	
}
