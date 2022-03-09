package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Actions;
import com.mystore.base.BaseClass;

public class IndexPage extends BaseClass{
	
	@FindBy(xpath = "//a[@class='login']")
	WebElement signinbutton;
	
	@FindBy(xpath = "//img[@class='logo img-responsive']")
	WebElement logo;
	
	@FindBy(xpath = "//input[@id='search_query_top']")
	WebElement searchbox;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement searchbutton;
	
	public IndexPage() {
		PageFactory.initElements(driver, this);
	}
	
	public LoginPage signin() {
		Actions.click(driver,signinbutton);
		return new LoginPage();
	}
	
	public  boolean validatelogo() {
		System.out.println(logo.getText());
		return Actions.isdisplayed(driver,logo );
		
	}
	
	public String getTitle() {
		String title=driver.getTitle();
		return title;
	}
	
	public SearchResultPage searchproduct(String product) {
		Actions.type(searchbox,product);
		Actions.click(driver, searchbutton);
		return new SearchResultPage();
	}
}
