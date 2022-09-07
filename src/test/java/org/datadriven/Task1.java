package org.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Task1 {
	public static void main(String[] args) throws IOException {
		//1.mention the file location
				File f = new File("C:\\Users\\Lenovo\\OneDrive\\Desktop\\clone\\gitclass16\\src\\test\\resources\\TestData\\student.xlsx");
				
				//2.Read the value from Excel
				FileInputStream fin = new FileInputStream(f);
				
				//3.type of Workbook
				Workbook w = new XSSFWorkbook(fin);
				
				//4.get the sheet
				Sheet s = w.getSheet("sheet1");
				
				//get the physical number of rows
				int pRows = s.getPhysicalNumberOfRows();
				System.out.println("physical number rows:"+pRows);
				
				//get the row
				Row r1 = s.getRow(4);  
				
				//get the physical number of cells
				int pCells = r1.getPhysicalNumberOfCells();
				System.out.println("physical number of cells:"+pCells); 
				
	}
}
