package org.cts;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
	public static void main(String[] args) throws IOException {
		//1.mention the file location
		File f = new File("C:\\Users\\Lenovo\\eclipse-workspace\\9.30FrameWorkProject\\src\\test\\resources\\TestData\\costcopage.xlsx");
		
		//2.create a new file
		boolean a = f.createNewFile();
		System.out.println(a);
		
		//3.Type of workbook
		Workbook w = new XSSFWorkbook();
		
		//4.create a sheet
		Sheet s = w.createSheet("costco");
		
		//5.create a row
		Row row = s.createRow(0);
		
		//6.create a cell
		Cell cell = row.createCell(0);
		
		//7.set the value
		cell.setCellValue("selenium");
		
		//8.update the file
		FileOutputStream fout = new FileOutputStream(f);
		
		
		//9.write the changes
		w.write(fout);
		System.out.println("sucess");
		
	}

}
