package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Actions;
import com.mystore.base.BaseClass;

public class AccountCreationPage extends BaseClass {
	
	@FindBy(xpath = "//h1[@class='page-heading']")
	WebElement creationaccountheading;
	
	public AccountCreationPage() {
		PageFactory.initElements(driver, this);
	}

	public boolean createaccountheadingvisible() {
		return (Actions.isdisplayed(driver,creationaccountheading));
		
	}
	
	
}
