package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Actions;
import com.mystore.base.BaseClass;

public class ShippingPage extends BaseClass {

	
	@FindBy(id = "cgv")
	WebElement checkbox;
	
	@FindBy(xpath = "//*[@id='form']/p/button/span")
	WebElement shippingproceedtocheckout;
	
	public ShippingPage() {
		PageFactory.initElements(driver,this);
	}
	
	public PaymentPage clickonshippingproceedtocheckout() {
		Actions.click(driver, checkbox);
		Actions.click(driver,shippingproceedtocheckout);
		return new PaymentPage();		
	}
}
