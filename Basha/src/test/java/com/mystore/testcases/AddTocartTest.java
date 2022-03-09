package com.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.AddToCartpage;
import com.mystore.pageobjects.HomePage;
import com.mystore.pageobjects.IndexPage;
import com.mystore.pageobjects.LoginPage;
import com.mystore.pageobjects.OrderPage;
import com.mystore.pageobjects.Orderpopup;
import com.mystore.pageobjects.SearchResultPage;

public class AddTocartTest extends BaseClass {
	
	IndexPage indpage;
	LoginPage lgpage;
	HomePage hmpage;
	SearchResultPage srpage;
	AddToCartpage adcpage;
	OrderPage orpage;
	Orderpopup poppage;
	
	@Parameters("browser")
	@BeforeMethod(groups="smoke")
	public void setup(String browser) {
		launchapp(browser);}
	
	
	@AfterMethod(groups="smoke")
	public void teardown() {
		driver.quit();
	}
	
	@Test(groups="smoke")
	public void addtocart() throws InterruptedException {
		indpage =new IndexPage();
		srpage=indpage.searchproduct("t-shirt");
		adcpage=srpage.selectproduct();
		adcpage.enterquantity("1");
		adcpage.selectsize("M");
		poppage=adcpage.addtocard();
		Thread.sleep(4000);
		boolean msg=poppage.addtocardmessge();
		Thread.sleep(4000);
		
		Assert.assertTrue(msg);
		
		
		
	}

}
