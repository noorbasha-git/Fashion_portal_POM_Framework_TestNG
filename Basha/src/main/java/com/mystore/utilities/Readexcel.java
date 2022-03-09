package com.mystore.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Readexcel {
	public static int rowcount;
	public static int columncount;
	public static String filename;
	public static String sheetname;
	public static String path;
	public static FileInputStream fis;
	public static XSSFWorkbook excel;
	public static XSSFSheet sheet;

	public Readexcel(){
		path = "C:\\Users\\HP\\eclipse-workspace-new\\Basha\\Testdata\\exceldata.xlsx";
		filename = "exceldata";
		sheetname = "logindata";
	}

	public Object[][] readexceldata() throws IOException {
		File file = new File(path);
		fis = new FileInputStream(file);
		excel = new XSSFWorkbook(fis);
		sheet = excel.getSheet(sheetname);
		rowcount = sheet.getLastRowNum();
		columncount = sheet.getRow(0).getLastCellNum();
		System.out.println(rowcount);
		System.out.println(columncount);
		Object[][] totaldata = new Object[rowcount][columncount];
		for (int i = 0; i<rowcount; i++) {
			Row row = sheet.getRow(i);
			System.out.print("userid & password-->");

			for (int j = 0; j<row.getLastCellNum(); j++) {
				String data = row.getCell(j).getStringCellValue();
				 System.out.println(i+" "+j+" "+data);
				totaldata[i][j] = data;

			}
			// System.out.println();

		}
		return totaldata;
		

	}
	

	
}