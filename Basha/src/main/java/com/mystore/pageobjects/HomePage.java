package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Actions;
import com.mystore.base.BaseClass;

public class HomePage extends BaseClass {
	
	@FindBy(xpath ="//span[text()='Order history and details']" )
	WebElement orderhistory;
	
	@FindBy(xpath ="//span[text()='My wishlists']" )
	WebElement wishlist;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean validateorderhistory() {
		return (Actions.isdisplayed(driver, orderhistory));
		
	}
	
	public boolean validatewishlist() {
		return (Actions.isdisplayed(driver, wishlist));
		
	}
	
	public void orderhistoryclick() {
		Actions.click(driver,orderhistory);
	}
	public void wishlistclick() {
		Actions.click(driver,wishlist);
		
	}

}
