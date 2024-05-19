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
public class OrderPage extends BaseClass {

Action action = new Action();	
	
@FindBy(xpath="//li[@class='price']")
WebElement Unitprize;

@FindBy(xpath="//span[@id='total_price']")
WebElement totalprize;

@FindBy(xpath="//a[@class='button btn btn-default standard-checkout button-medium']//span[contains(text(),'Proceed to checkout')]")
WebElement proceedTocheckout;

public OrderPage() {
  PageFactory.initElements(getDriver(),this);
}
 
public double getUnitPrize() {
	String Unitprize1=Unitprize.getText();	
	String unit=Unitprize1.replaceAll("[^a-zA-Z0-9]", Unitprize1);
	double finalUnitprize = Double.parseDouble(unit);
	return finalUnitprize/100;
}	


public double getTotalPrize() {
	String Totalprize1=Unitprize.getText();	
	String tot=Totalprize1.replaceAll("[^a-zA-Z0-9]", Totalprize1);
	double finalTotalprize = Double.parseDouble(tot);
	return finalTotalprize/100;
	
}

public LoginPage clickOncheckout() {
	action.click(getDriver(), proceedTocheckout);
	return new LoginPage();
}
	
	
	
	
}
