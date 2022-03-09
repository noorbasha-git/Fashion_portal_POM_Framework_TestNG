package com.mystore.pageobjects;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Actions;
import com.mystore.base.BaseClass;

public class AddressPage extends BaseClass {

	
	@FindBy(xpath="//button[@type='submit']/span[text()='Proceed to checkout']")
	WebElement adresspagecheckout;
	
	public AddressPage() {
		PageFactory.initElements(driver, this);
		
	}
	
	public ShippingPage clickonproceedcheckoutadreesspage() {
		Actions.click(driver, adresspagecheckout);
		return new ShippingPage();
	}
}
