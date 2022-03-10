package com.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.IndexPage;
import com.mystore.utilities.Log;



public class Indexpagetest extends BaseClass {
	public IndexPage indpage;
	
	
	@Parameters("browser")
	@BeforeMethod(groups={"smoke","sanity"})
	public void setup(String browser) {
		Log.log.info("________________________setup running");
		launchapp(browser);
	}
	
	
	@AfterMethod(groups={"smoke","sanity"})
	public void teardown() throws InterruptedException {
		Log.log.info("________________________closing browser");
		Thread.sleep(1000);
		driver.quit();
	}
	
	@Test(groups={"smoke","sanity"})
	public void verifylogo() {
		//System.out.println()
		Log.log.info("_________________________first test");
		indpage=new IndexPage();
		Assert.assertTrue(indpage.validatelogo());
	
	}
	@Test(groups={"smoke","sanity"})
	public void verifytitle() {
		//indpage=new IndexPage();
		Log.log.error("___________________________second test");
		String title=indpage.getTitle();
		Assert.assertEquals(title,"My Store");
	}

}
