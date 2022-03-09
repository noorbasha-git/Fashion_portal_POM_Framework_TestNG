package com.mystore.actiondriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.mystore.base.BaseClass;

public class Actions extends BaseClass {

	
	

	public static void  click(WebDriver driver ,WebElement element) {
		
		element.click();
		
	
	}

	public static boolean isdisplayed(WebDriver driver, WebElement element) {
		// TODO Auto-generated method stub
		return (element.isDisplayed());
	}

	public static void type(WebElement searchbox, String input) {
		// TODO Auto-generated method stub
		searchbox.clear();
		searchbox.sendKeys(input);
		
	}

	
	public static void select( WebElement element, String option) {
		// TODO Auto-generated method stub
		Select sec= new Select(element);
		element.click();
		sec.selectByVisibleText(option);
		
		
	}

	public static void jclick(WebDriver driver, WebElement element) {
		// TODO Auto-generated method stub
		JavascriptExecutor js =  (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		
	}
	
	@SuppressWarnings("deprecation")
	public static void implicitwait(WebDriver driver,int time) {
		driver.manage().timeouts().implicitlyWait(time,TimeUnit.SECONDS);
		
	}
}
