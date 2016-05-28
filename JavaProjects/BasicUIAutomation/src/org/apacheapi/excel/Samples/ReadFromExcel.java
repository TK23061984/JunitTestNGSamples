package org.apacheapi.excel.Samples;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFromExcel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File src = new File("C:\\Thangakumar\\Development\\Self Projects\\JavaProjects\\External\\ExcelData\\TestData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook excel = new XSSFWorkbook(fis);
		
		XSSFSheet sheet1 = excel.getSheetAt(0);
		int sheet1RowCount= sheet1.getLastRowNum();
		
		for(int i=0; i<sheet1RowCount;i++)
		{
			System.out.println(sheet1.getRow(i).getCell(0).getStringCellValue());
			System.out.println(sheet1.getRow(i).getCell(1).getStringCellValue());
		}
		
		 
		
	}

}
