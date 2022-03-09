package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Actions;
import com.mystore.base.BaseClass;

public class AddToCartpage extends BaseClass {

	@FindBy(xpath = "//*[@id='quantity_wanted']")
	WebElement quantityinput;
	
	@FindBy(xpath ="//select[@class='form-control attribute_select no-print']" )
	WebElement sizeselect;
	
	@FindBy(xpath = "//*[@id='add_to_cart']/button")
	WebElement addtocartbutton;
	
	
	
	@FindBy(xpath = "//*[@id='layer_cart']/div[1]/div[2]/div[4]/a")
	WebElement proceedtocheckout;
	
	public AddToCartpage() {
		PageFactory.initElements(driver,this);
		
	}
	
	public void enterquantity(String quantity) {
		Actions.type(quantityinput, quantity);
	}
	public void selectsize(String size) {
		
		Actions.select(sizeselect,size);
	}
	
	public Orderpopup addtocard() {
		Actions.jclick(driver, addtocartbutton);
		return new Orderpopup();
	}
	
	
}
