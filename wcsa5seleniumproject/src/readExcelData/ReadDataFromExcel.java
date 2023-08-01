package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

//		Read data from IPL excel sheet
		
//		Implementation of read the data from excel
		
		FileInputStream fis = new FileInputStream("./data/TestData.xlsx"); //Provide the path of file
		
		Workbook wb = WorkbookFactory.create(fis); //Make the file ready to read
		
		Sheet sheet = wb.getSheet("IPL"); //Get into the sheet
		
		Row row = sheet.getRow(3); //Get into the desired row
		
		Cell cell = row.getCell(1); //Get into desired cell/column
		
		String data = cell.getStringCellValue(); //Read the data from cell
		
		System.out.println(data); //Print data
			
		
	}

}
