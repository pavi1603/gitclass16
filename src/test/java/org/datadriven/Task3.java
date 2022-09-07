package org.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Task3 {
	public static void main(String[] args) throws IOException {
		//1.mention the file location
				File f = new File("C:\\Users\\Lenovo\\OneDrive\\Desktop\\clone\\gitclass16\\src\\test\\resources\\TestData\\sch.xlsx");
				
				//2.create a new file
				boolean a = f.createNewFile();
				System.out.println(a);
				
				//3.Type of workbook
				Workbook w = new XSSFWorkbook();
				
				//4.create a sheet
				Sheet s = w.createSheet("sheet1");
				
				//5.create a row
				Row row = s.createRow(0);
				
				//6.create a cell
				Cell cell = row.createCell(0);
				
				//7.set the value
				cell.setCellValue("priya");
				
				//8.create a row
				Row r = s.createRow(0);
				
				//9.create a cell
				Cell c = r.createCell(1);
				
				//10.set the value
				c.setCellValue("eng");
				
				//11.update the file
				FileOutputStream fout = new FileOutputStream(f);
				
				
				//12.write the changes
				w.write(fout);
				System.out.println("sucess");


		
	}
	}
