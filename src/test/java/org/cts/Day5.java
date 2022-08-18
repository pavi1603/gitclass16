package org.cts;

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

public class Day5 {
	public static void main(String[] args) throws IOException {
		//1.mention the file location
				File f = new File("C:\\Users\\Lenovo\\eclipse-workspace\\9.30FrameWorkProject\\src\\test\\resources\\TestData\\Evana.xlsx");
				
				//2.Read the value from Excel
				FileInputStream fin = new FileInputStream(f);
				
				//3.type of Workbook
				Workbook w = new XSSFWorkbook(fin);
				
		         
				//4.get the sheet
				Sheet s = w.getSheet("sheet1");
				
				for(int i=0;i<s.getPhysicalNumberOfRows();i++) {
					Row row = s.getRow(i);
					
					for(int j=0;j<row.getPhysicalNumberOfCells();j++) {
						Cell cell = row.getCell(j);
						int cellType = cell.getCellType(); //1->string,//a->int or data
						
						if(cellType==1) {
							String value = cell.getStringCellValue();
							System.out.println(value);
						}
						else if (DateUtil.isCellDateFormatted(cell)) {
							Date d=cell.getDateCellValue();
							 
							SimpleDateFormat sin = new SimpleDateFormat("dd,MMMM,yyyy");
							String value = sin.format(d);
							System.out.println(value);	
						}
						else {
							double d=cell.getNumericCellValue();
							//newDataType ref=(newDataType)oldvariable
							long l=(long)d;
							String value = String.valueOf(1);
							System.out.println(value);  
							}
					}
				}
	}

}
