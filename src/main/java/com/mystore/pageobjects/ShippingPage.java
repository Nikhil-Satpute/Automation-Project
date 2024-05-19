package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class ShippingPage extends BaseClass {

Action action = new Action();	
	
@FindBy(xpath="//input[@id='cgv']")	
WebElement terms;

@FindBy(xpath="//button[@name='processCarrier']//span[contains(text(),'Proceed to checkout')]")
WebElement ProceedToCheckOutBtn;

public ShippingPage() {
PageFactory.initElements(getDriver(), this);
}
	
public void checkterms() {
action.click(getDriver(), terms);
}
	
public PaymentPage clickonproceedtocheckout() {
action.click(getDriver(), ProceedToCheckOutBtn);
return new PaymentPage();
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
