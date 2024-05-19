package com.mystore.dataprovider;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcelsheet {
          
	     @Test
	     public void readExcel() throws Exception {	
		 String excelpath ="C:\\Users\\NikhilSatpute\\eclipse-workspace\\MyStore\\TestData\\TestData.xlsx";
		 String filename = "TestData";
		 String sheetname ="Test";

		 File file = new File(excelpath);

		 FileInputStream fis = new FileInputStream(file);	

		 XSSFWorkbook wb = new XSSFWorkbook(fis);
		 	
		 XSSFSheet sheet = wb.getSheet(sheetname);

		 int rowcount = sheet.getLastRowNum();
		 System.out.println("Total Rows: "+rowcount);	
	
		 
		 String data=sheet.getRow(0).getCell(1).getStringCellValue();
         System.out.println(data);
         
         
         for(int i=0;i<=rowcount;i++) {
        	 Row row=sheet.getRow(i);
        	 for(int j=0;j<=row.getLastCellNum();j++) {
        	 String data1=sheet.getRow(i).getCell(j).getStringCellValue();
        	 
        	 System.out.println(data1+" ");
        	 }
        	 System.out.println();
            }		 
             wb.close();    
	     }
	     
	     
}