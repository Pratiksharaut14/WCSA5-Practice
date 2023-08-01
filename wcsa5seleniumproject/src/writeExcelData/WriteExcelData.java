package writeExcelData;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteExcelData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

	 	FileInputStream fis = new FileInputStream("./data/TestData.xlsx");
	 	
	 	Workbook wb = WorkbookFactory.create(fis);
	 	
	 	Sheet sheet = wb.getSheet("IPL");
	 	
	 	Row row = sheet.getRow(12); // we can use createRow(); / getRow();
	 	
	 	//Create row by using Row interface
	 	
	 	Cell cell = row.createCell(0);
	 	
	 	//Write data into cell
	 	
	 	cell.setCellValue("AUS");
	 	
	 	FileOutputStream fos = new FileOutputStream("./data/TestData.xlsx");
	 	
	 	wb.write(fos);
	 	
	}

}
