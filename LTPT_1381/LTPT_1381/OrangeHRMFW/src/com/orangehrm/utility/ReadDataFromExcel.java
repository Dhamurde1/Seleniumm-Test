package com.orangehrm.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {
 
	static Workbook wbook;
	static Sheet oSheet;
	public static void setupExcel(String path,String sheet) throws IOException {
		File Fobj = new File(path);
		FileInputStream FInput = new FileInputStream(Fobj);
		wbook= new XSSFWorkbook(FInput);
		oSheet = wbook.getSheet(sheet);
	}

	public static int getRowCount() {		
		return oSheet.getLastRowNum();
	}

	public static String readData(int rowval,int colval) {
		Row row=oSheet.getRow(rowval);		
	     String cellvalue=row.getCell(colval).getStringCellValue();
	     return cellvalue;
					
	}

}