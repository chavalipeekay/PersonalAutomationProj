package com.peekay.dataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.hpsf.Array;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class GetExcelData {
	
	@Test
	public void getData() throws IOException {
		
		String path = "\\src\\test\\resources\\ExcelFiles\\SampleData.xlsx";
		XSSFWorkbook wb=new XSSFWorkbook(new FileInputStream(new File(System.getProperty("user.dir")+path)));
		XSSFSheet sheet= wb.getSheet("Sheet1"); 
		int rowCount=sheet.getPhysicalNumberOfRows();
		
		Map<Integer, Object> dataArray = new HashMap<Integer, Object>(); 
		
		for(int row=0;row<rowCount;row++) {
			int colCount=sheet.getRow(row).getPhysicalNumberOfCells();
			Map<String,Object> rowData=new HashMap<String, Object>();
			for(int col=0;col<colCount;col++) {
				//System.out.println(sheet.getRow(row).getCell(col).getStringCellValue());
				System.out.println(row +  " " + col);
				rowData.put(sheet.getRow(0).getCell(col).getStringCellValue(), 
						sheet.getRow(row).getCell(col).getStringCellValue());
				
				
				
			}
			dataArray.put(row, rowData);
//			System.out.println(dataArray);
			
		}
		System.out.println(dataArray);
		wb.close();
				
				
//		Object[][] data= {
//				{"R1 C1","R1 C2","R1 C3"},
//				{"R2 C1","R2 C2","R2 C3"},
//				{"R3 C1","R3 C2","R3 C3"},
//				{"R4 C1","R4 C2","R4 C3"}
//		};
//		
//		return data;
	}
	
}
