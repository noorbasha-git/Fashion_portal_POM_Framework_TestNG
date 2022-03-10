package com.mystore.utilities;

import java.sql.Date;
import java.time.LocalDate;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentManager {

	public static ExtentHtmlReporter extenthtmlreport;
	public static ExtentReports extentrepo;
	public static ExtentTest test;
	
	public static void setextent() {
		Log.log.info("setting extentreport");
		LocalDate d=LocalDate.now();
		
		extenthtmlreport=new ExtentHtmlReporter(System.getProperty("user.dir")+"\\extentreport\\extent\\extent.html");
		extenthtmlreport.loadXMLConfig(System.getProperty("user.dir")+"\\extent.xml");
		
		extentrepo=new ExtentReports();
		extentrepo.attachReporter(extenthtmlreport);
		extentrepo.setSystemInfo("Projectname","noorsPractice Project");
	}
	
	public static void endreport() {
		Log.log.info("ending extent report");
		extentrepo.flush();
	}
	
}
