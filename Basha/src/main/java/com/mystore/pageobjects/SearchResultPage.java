package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Actions;
import com.mystore.base.BaseClass;

public class SearchResultPage extends BaseClass {
	
	@FindBy(xpath ="//*[@id='center_column']//img")
	WebElement productresult;
	
	public SearchResultPage() {
		PageFactory.initElements(driver,this);
		
	}
	
	public boolean isproductvisible() {
		return Actions.isdisplayed(driver, productresult);
	}
	
	public AddToCartpage selectproduct() {
		Actions.click(driver, productresult);
		return new AddToCartpage();
	}

}
