//We Use Flib Class to store Generic Reusable Methods(Non-Static)

//readExcelData() is a generic reusable method

package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {

//	To read data from excel sheet
	
	public String readExcelData(String excelPath, String sheetName, int rowCount, int cellCount) throws IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);
		
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet sheet = wb.getSheet(sheetName);
		
		Row row = sheet.getRow(rowCount);
		
		Cell cell = row.getCell(cellCount);
		
		String data = cell.getStringCellValue();
		
		return data;
		
	}
	
//	To get last row count of data
	
	public int getLastRowCount(String excelPath, String sheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);
		
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet sheet = wb.getSheet(sheetName);
		
		int rc = sheet.getLastRowNum();
		
		return rc;
	}
	
//	Use to write data into excel sheet
	
	public void writeExcelData(String excelPath, String sheetName, int rowCount, int cellCount, String data) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);
		
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet sheet = wb.getSheet(sheetName);
		
	 	Row row = sheet.getRow(rowCount);
	 	
	 	Cell cell = row.createCell(cellCount);
	 	
	 	cell.setCellValue(data);
	 	
	 	FileOutputStream fos = new FileOutputStream(excelPath);
	 	
	 	wb.write(fos);

	}

}








