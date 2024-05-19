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
public class HomePage extends BaseClass {

Action action = new Action();	
	
@FindBy(xpath="//span[normalize-space()='Order history and details']")	
WebElement myaddress;	
	
@FindBy(xpath="//span[normalize-space()='My addresses']")	
WebElement orderHistory;

public HomePage() {
	PageFactory.initElements(getDriver(), this);
}

public boolean validatemyaddress() {
    return action.isDisplayed(getDriver(), myaddress);    
}

public boolean validaterderHistory() {
	return action.isDisplayed(getDriver(), orderHistory);
}
	
public String getcurrURL() {
	String homePageURL=getDriver().getCurrentUrl();
	return homePageURL;	
}
	
	
}
