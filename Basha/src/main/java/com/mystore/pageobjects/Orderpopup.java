package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.base.BaseClass;

public class Orderpopup extends BaseClass {
	
	
	@FindBy(xpath = "//div[@class='clearfix']")
	WebElement addtocardpopup;
	
	@FindBy(xpath = "//*[@id='layer_cart']/div[1]/div[2]/div[4]/a")
	WebElement proceedorderorderpopup;
	
	
	public Orderpopup() {
		PageFactory.initElements(driver,this);
	}
	
	public boolean addtocardmessge() {
		return addtocardpopup.isDisplayed();
	}
	
	public OrderPage proceedbutton() {
		proceedorderorderpopup.click();
		return new OrderPage();
	}

}
