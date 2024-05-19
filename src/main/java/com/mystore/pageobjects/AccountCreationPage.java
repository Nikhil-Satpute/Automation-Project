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
public class AccountCreationPage extends BaseClass {

Action action = new Action();

@FindBy(xpath="//h1[@class='page-heading']")
WebElement formTitle;
	
public AccountCreationPage() {
	PageFactory.initElements(getDriver(), this);
}
	
public boolean validateAccount() {
return action.isDisplayed(getDriver(), formTitle);	
}
		
}
