package com.mystore.pageobjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class IndexPage extends BaseClass  {

Action action= new Action();	


@FindBy(xpath="//a[@title='Log in to your customer account']")	
WebElement signinbutton;

@FindBy(xpath="//img[@alt='My Shop']")
WebElement mystorelogo;

@FindBy(xpath="//input[@id='search_query_top']")
WebElement searchproductbox;
	
@FindBy(xpath="//button[@name='submit_search']")
WebElement searchbutton;
	
	
public IndexPage() {
	PageFactory.initElements(getDriver(), this);
}
	
public LoginPage clickonsignin()throws Throwable {	
       action.click(getDriver(), signinbutton);
       return new LoginPage();
}
	
public boolean validatelogo()throws Throwable {
	return action.isDisplayed(getDriver(), mystorelogo);
}

public  String getMystoreTitle() {
	String mystoreTitle = getDriver().getTitle();
	return mystoreTitle;
}

public SearchResultPage SeearchProduct(String productName)throws Throwable {
	action.type(searchproductbox, productName);
	action.click(getDriver(),searchbutton);
	return new SearchResultPage();
}

}
