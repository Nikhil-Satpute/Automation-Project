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
public class SearchResultPage extends BaseClass {

Action action = new Action();	
	
@FindBy(xpath="//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[4]/div[1]/div[2]/h5[1]/a[1]")
WebElement productResult;

public SearchResultPage() {
	PageFactory.initElements(getDriver(), this);
}
	
public boolean isProductAvailable() {
	return action.isDisplayed(getDriver(), productResult);
}

public AddToCartPage clickOnProduct() {
action.click(getDriver(), productResult);
return new AddToCartPage();
}
		
}
