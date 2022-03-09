package com.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.HomePage;
import com.mystore.pageobjects.IndexPage;
import com.mystore.pageobjects.LoginPage;
import com.mystore.pageobjects.SearchResultPage;

public class SearchResultTest extends BaseClass {
	IndexPage indpage;
	LoginPage lgpage;
	HomePage hmpage;
	SearchResultPage srpage;
	
	@Parameters("browser")
	@BeforeMethod(groups="smoke")
	public void setup(String browser) {
		launchapp(browser);
		
	}
	
	@AfterMethod(groups="smoke")
	public void teardown() {
		driver.quit();
	}
	@Test(groups="smoke")
	public void productavailabilitytest() {
		
		indpage= new IndexPage();
		srpage=indpage.searchproduct("t-shirt");
		Assert.assertTrue(srpage.isproductvisible());
		
	}

}
