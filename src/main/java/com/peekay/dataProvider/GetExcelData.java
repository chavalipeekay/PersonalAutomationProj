package com.peekay.dataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GetExcelData {

	public static Object[][] getData(String filePathName,String sheetName) {
		
		String path = filePathName;
		XSSFWorkbook wb=null;
		try {
			wb = new XSSFWorkbook(new FileInputStream(new File(System.getProperty("user.dir")+filePathName)));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
				Reporter.log("Issuue with excel File"+e.getMessage(),true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			Reporter.log("Issuue with excel File"+e.getMessage(),true);
		}
		XSSFSheet sheet= wb.getSheet(sheetName); 
		int rowCount = sheet.getPhysicalNumberOfRows();
		int colCount = sheet.getRow(0).getPhysicalNumberOfCells();
		
		
		Object[][] dataArray=new Object[rowCount][colCount]; 
		
		for(int row=0;row<rowCount;row++) {
			colCount=sheet.getRow(row).getPhysicalNumberOfCells();
//			Map<String,Object> rowData=new HashMap<String, Object>();
			for(int col=0;col<colCount;col++) {
				//System.out.println(sheet.getRow(row).getCell(col).getStringCellValue());
//				System.out.println(row +  " " + col);
				dataArray[row][col]= 
						sheet.getRow(row).getCell(col).getStringCellValue();
				
			}
			
		}
		try {
			wb.close();
		} catch (IOException e) {
			Reporter.log("Issuue with excel File"+e.getMessage(),true);
		}
		return dataArray;
//		for(int i=0;i<rowCount;i++)
//			for(int j=0;j<colCount;j++)
//			System.out.println(dataArray[i][j]);	
				
	}
	
}
