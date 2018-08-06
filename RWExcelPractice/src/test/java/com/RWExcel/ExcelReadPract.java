package com.RWExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadPract {

	public static void main(String[] args) throws IOException {

		File f = new File("src/test/resources/RWPractice.xlsx");

		FileInputStream fis;
		
			fis = new FileInputStream(f);
			XSSFWorkbook excel = new XSSFWorkbook(fis);

			XSSFSheet sh = excel.getSheet("Selenium");
			
		int a= sh.getLastRowNum();
			System.out.println(a);
			for (int i = 0; i <= a; i++) {
				String username = sh.getRow(i).getCell(0).getStringCellValue();
				System.out.println(username);
				
			}
			
				
				
		/*
				FileOutputStream fos= new FileOutputStream(f);
			sh.getRow(2).createCell(6).setCellValue("ABC");
			
			excel.write(fos);
			fos.flush();
					*/
			excel.close();
			fis.close();
			

		

	}

}
