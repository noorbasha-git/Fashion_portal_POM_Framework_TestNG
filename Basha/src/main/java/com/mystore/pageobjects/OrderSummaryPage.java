package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Actions;
import com.mystore.base.BaseClass;

public class OrderSummaryPage  extends BaseClass{
	
	@FindBy(xpath ="//*[@id='cart_navigation']/button/span" )
	WebElement confirmorder;
	
	public OrderSummaryPage() {
		PageFactory.initElements(driver, this);
		
	}
	public OrderConfirmationPage confirmorder() {
		Actions.click(driver, confirmorder);
		return new OrderConfirmationPage();
		
	}

}
