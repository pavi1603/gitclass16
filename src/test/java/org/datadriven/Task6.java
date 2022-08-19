package org.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task6 {
	public static WebDriver driver;

	// 1
	public static void launchChrome() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	// 2
	public static void winMax() {
		driver.manage().window().maximize();
	}
	// 3
	public static void loadUrl(String url) {
		driver.get(url);
	}
	// 4
	public static void printTitle() {
		System.out.println(driver.getTitle());
	}
	// 5
	public static void printCurrentUrl() {
		System.out.println(driver.getCurrentUrl());
	}
	
	public static void fill(WebElement ele, String value) {
		// webelementref.sendkeys("");
		ele.sendKeys(value);
	}
		public static void sign(WebElement ele) {
			ele.click();
		}	
		public static String  getData(int rowNumber,int cellNumber) throws IOException {
			//1.mention the file location
			File f = new File("C:\\Users\\Lenovo\\eclipse-workspace\\9.30FrameWorkProject\\src\\test\\resources\\TestData\\facebooks.xlsx");
			
			//2.Read the value from Excel
			FileInputStream fin = new FileInputStream(f);
			
			//3.type of Workbook
			Workbook w = new XSSFWorkbook(fin);
			
	         
			//4.get the sheet
			Sheet s = w.getSheet("sheet1");
			
		Row row=s.getRow(rowNumber);	
		
	   Cell cell = row.getCell(cellNumber);
	    
	   int cellType=cell.getCellType();
	   
	   String value="";
	   if(cellType==1) {
		   value=cell.getStringCellValue();
	   }
	   else if (DateUtil.isCellDateFormatted(cell)) {
			Date d=cell.getDateCellValue();
			 
			SimpleDateFormat sin = new SimpleDateFormat("dd,MMMM,yyyy");
			 value = sin.format(d);
	   }
	   else {
			double d=cell.getNumericCellValue();
			//newDataType ref=(newDataType)oldvariable
			long l=(long)d;
			 value = String.valueOf(l);
			
	   }
	   return value;
	}


				
	}
