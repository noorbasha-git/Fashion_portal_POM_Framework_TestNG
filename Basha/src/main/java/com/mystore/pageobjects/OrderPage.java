package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Actions;
import com.mystore.base.BaseClass;

public class OrderPage extends BaseClass {
	
	@FindBy(xpath = "//td[@class='cart_unit']/span/span")
	WebElement unitprice;
	
	@FindBy(xpath = "//*[@id='total_price']")
	WebElement totalprice;
	
	@FindBy(xpath = "//span[text()='Proceed to checkout']")
	WebElement proceedtocheckout;
	
	
	public OrderPage() {
		PageFactory.initElements(driver,this);
	}
	
	public Double getprice() {
		String st= unitprice.getText();
		
		st=st.replace("$","").trim();
		//System.out.println(st);
		
		Double price= Double.parseDouble(st);
		return price/100;
		
	}
	
	public Double gettotalprice() {
		String stp= totalprice.getText();
		
		stp=stp.replace("$","");
		System.out.println(stp);
		
		Double totalprice= Double.parseDouble(stp);
		System.out.println(totalprice);
		return totalprice/100;
		
	}
	
	public LoginPage proceedtocheckout() {
		Actions.click(driver, proceedtocheckout);
		return new LoginPage();
	}
	
	
	
	

}
