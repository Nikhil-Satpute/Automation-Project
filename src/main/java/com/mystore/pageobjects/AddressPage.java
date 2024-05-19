package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class AddressPage extends BaseClass {

Action action = new Action();	
	
@FindBy(xpath="//button[@name='processAddress']//span[contains(text(),'Proceed to checkout')]")
WebElement proceedTocheckout;

public AddressPage() {
PageFactory.initElements(getDriver(),this);	
}

public ShippingPage clickOnCheckout() {
 action.click(getDriver(), proceedTocheckout);
 return new ShippingPage();

}	
	
}
