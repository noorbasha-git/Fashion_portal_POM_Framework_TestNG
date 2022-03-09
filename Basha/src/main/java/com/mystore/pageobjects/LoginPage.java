package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Actions;
import com.mystore.base.BaseClass;

public class LoginPage extends BaseClass {
	
	@FindBy(xpath = "//input[@id='email']")
	WebElement inputemail;
	
	
	@FindBy(xpath = "//input[@id='passwd']")
	WebElement inputpassword;
	
	@FindBy(xpath = "//button[@id='SubmitLogin']")
	WebElement signinsubmit;
	
	@FindBy(xpath = "//input[@id='email_create']")
	WebElement inputemailtocreate;
	
	
	@FindBy(xpath = "//button[@id='SubmitCreate']")
	WebElement createaccountbutton;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public HomePage login(String uname,String pass) {
		
		Actions.type(inputemail, uname);
		Actions.type(inputpassword, pass);
		Actions.click(driver, signinsubmit);
		
		return  new HomePage();
		
	}
	
	public AddressPage loginfromorgerpage(String uname,String pass) {
		
		Actions.type(inputemail, uname);
		Actions.type(inputpassword, pass);
		Actions.click(driver, signinsubmit);
		
		return  new AddressPage();
		
	}
	
	public AccountCreationPage createnewaccount(String userid) {
		
		Actions.type(inputemailtocreate, userid);
		Actions.click(driver,createaccountbutton);
		return new AccountCreationPage();
	}
	
	
	
	
	

}
