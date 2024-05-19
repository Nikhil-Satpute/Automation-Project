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
public class AddToCartPage extends BaseClass {

Action action = new Action();	
	
@FindBy(xpath="//select[@id='group_1']")
private WebElement size;


@FindBy(xpath="//input[@id='quantity_wanted']")
private WebElement quantity;


@FindBy(xpath="//span[normalize-space()='Add to cart']")
private WebElement addTocartbtn;

@FindBy(xpath="//h2[normalize-space()='Product successfully added to your shopping cart']")
private WebElement Addtocartmessage;

@FindBy(xpath="//span[normalize-space()='Proceed to checkout']")	
private WebElement proceedtocheckoutbtn;

public AddToCartPage() {
PageFactory.initElements(getDriver(), this);
}


public void enterquantity(String quantity1) {
action.type(quantity, quantity1);	
}
	
public void selectsize(String size1) {
action.selectByVisibleText(size1, size);
}
	
public void clickonAddToCart() {
action.click(getDriver(), addTocartbtn);	
}
	
public boolean validateAddToCart() {
return action.isDisplayed(getDriver(), Addtocartmessage);	
}

public OrderPage proceesedtocheckout() {
action.JSClick(getDriver(), proceedtocheckoutbtn);	
return new OrderPage();
}
}
