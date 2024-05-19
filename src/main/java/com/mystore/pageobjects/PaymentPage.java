/**
 * 
 */
package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

/**
 * 
 */
public class PaymentPage extends BaseClass{

Action action = new Action();	
	
@FindBy(xpath="//a[@title='Pay by bank wire']")
WebElement PaybyBankwire;

@FindBy(xpath="//a[@title='Pay by check.']")
WebElement PaybyCheck;

public PaymentPage() {
PageFactory.initElements(getDriver(), this);	
}
	
public OrderSummeryPage clickonpaybyBankwire() {
action.click(getDriver(), PaybyBankwire);
return new OrderSummeryPage();
}
	
public OrderSummeryPage clickonpaybycheck() {
action.click(getDriver(), PaybyCheck);	
return new OrderSummeryPage();
}
		
}
