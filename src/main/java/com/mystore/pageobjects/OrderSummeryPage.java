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
public class OrderSummeryPage extends BaseClass {

Action action = new Action();	
	
@FindBy(xpath="//span[normalize-space()='I confirm my order']")
WebElement confirmorder;

public OrderSummeryPage() {
PageFactory.initElements(getDriver(),this);	
}
	
public OrderConfirmationPage clickonconfirmorder() {
action.click(getDriver(), confirmorder);
return new OrderConfirmationPage();
}	
}
