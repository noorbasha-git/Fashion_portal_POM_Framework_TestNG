package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Actions;
import com.mystore.base.BaseClass;

public class PaymentPage extends BaseClass {
	
	@FindBy(xpath = "//*[@id='HOOK_PAYMENT']/div[1]/div/p/a")
	WebElement paybankwire;
	
	public PaymentPage() {
		PageFactory.initElements(driver,this);
	}
	public OrderConfirmationPage clickbankwire() {
		Actions.click(driver, paybankwire);
		return new OrderConfirmationPage();
	}

}
