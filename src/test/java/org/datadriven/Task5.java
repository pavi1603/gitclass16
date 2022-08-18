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

public class Task5 {
	public static void main(String[] args) throws IOException {
		//1.mention the file location
		File f = new File("C:\\Users\\Lenovo\\eclipse-workspace\\9.30FrameWorkProject\\src\\test\\resources\\TestData\\hotels.xlsx");
		
		//2.create a new file
		boolean a = f.createNewFile();
		System.out.println(a);
		//3.Type of workbook
		Workbook w = new XSSFWorkbook();
		//4.create a sheet
		Sheet s = w.createSheet("sheet1");
		//5.create a row
		Row row = s.createRow(0);
		Cell cell = row.createCell(0);
		cell.setCellValue("username");
		
		//6.create a row
				Row row1= s.createRow(0);
				Cell cell1 = row1.createCell(1);
				cell1.setCellValue("password");
				
				//7.create a row
				Row row2 = s.createRow(0);
				Cell cell2 = row2.createCell(2);
				cell2.setCellValue("confirmpassword");
				
				//8.create a row
				Row row3 = s.createRow(0);
				Cell cell3 = row3.createCell(3);
				cell3.setCellValue("email");
		
		//9.create a row
		Row r = s.createRow(1);
		Cell c = r.createCell(0);
		c.setCellValue("pavi");
		
		//10.create a row
				Row r1 = s.createRow(1);
				Cell c1 = r.createCell(1);
				c1.setCellValue("87655346");
				
				//11.create a row
				Row r2 = s.createRow(1);
				Cell c2 = r.createCell(2);
				c2.setCellValue("87655346");
				
				//12.create a row
				Row r3 = s.createRow(1);
				Cell c3 = r.createCell(3);
				c3.setCellValue("pavi@123");
				
				
				
		
		
		//13.update the file
		FileOutputStream fout = new FileOutputStream(f);
		
		
		//14.write the changes
		w.write(fout);
		System.out.println("sucess");
	}

}
	


