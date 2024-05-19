package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class LoginPage extends BaseClass {

Action action= new Action();	
	
@FindBy(xpath="//input[@id='email']")	
WebElement username;
	
@FindBy(xpath="//input[@id='passwd']")	
WebElement password;

@FindBy(xpath="//span[normalize-space()='Sign in']")
WebElement signinbtn;

@FindBy(xpath="//input[@id='email_create']")
WebElement emailForNewAccount;

@FindBy(xpath="//span[normalize-space()='Create an account']")
WebElement createNewAccountBtn;	

public LoginPage() {
	PageFactory.initElements(getDriver(), this);
}
	
public HomePage login(String uname, String pswd) {
action.type(username, uname);
action.type(password, pswd);
action.click(getDriver(), signinbtn);
return new HomePage();
}

public AddressPage login1(String uname, String pswd) {
action.type(username, uname);
action.type(password, pswd);
action.click(getDriver(), signinbtn);
return new AddressPage();
}

public AccountCreationPage createNewAccount(String newEmail) {
action.type(emailForNewAccount,newEmail);
action.click(getDriver(), createNewAccountBtn);
return new AccountCreationPage();	
}

public String getcurrURL() {
String homepageURL=action.getCurrentURL(getDriver());
return homepageURL;
}

}	
	
	
	

