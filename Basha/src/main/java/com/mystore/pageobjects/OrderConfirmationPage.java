package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.base.BaseClass;

public class OrderConfirmationPage extends BaseClass {
	
	@FindBy(xpath = "//*[@id='center_column']/p[1]/text()")
	WebElement confirmationcheck;
	
	@FindBy(xpath="//*[@id='cart_navigation']/button")
	WebElement confirmorder;
	
	public OrderConfirmationPage() {
		PageFactory.initElements(driver,this);
	}
	
	public void confirmorder() {
		System.out.println(confirmorder.getText());
		confirmorder.click();
		//String msg=confirmationcheck.getText();
		//return msg;
		//SSystem.out.println(confirmorder.getText());
	}
}
