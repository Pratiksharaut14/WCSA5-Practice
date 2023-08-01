package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://pratiksha/login.do");
		
		//Read data from login page
		
		//Username

		 FileInputStream fis = new FileInputStream("./data/ActitimeData.xlsx");
		 
		 Workbook wb = WorkbookFactory.create(fis);
		 
		 Sheet sheet = wb.getSheet("valid");
		 
		 Row row = sheet.getRow(1);
		 
		 Cell cell = row.getCell(0); //Get into desired cell/column
			
		String validUsername = cell.getStringCellValue(); //Read the data from cell
			
		System.out.println(validUsername); //Print data
		
		Thread.sleep(1000);

		
		//Password
		
		FileInputStream fis1 = new FileInputStream("./data/ActitimeData.xlsx");
		 
		 Workbook wb1 = WorkbookFactory.create(fis1);
		 
		 Sheet sheet1 = wb1.getSheet("valid");
		 
		 Row row1 = sheet1.getRow(1);
		 
		 Cell cell1 = row1.getCell(1); //Get into desired cell/column
			
		String validPassword = cell1.getStringCellValue(); //Read the data from cell
			
		System.out.println(validPassword); //Print data
		
		Thread.sleep(1000);

		
		driver.findElement(By.name("username")).sendKeys(validUsername);
		Thread.sleep(1000);
		driver.findElement(By.name("pwd")).sendKeys(validPassword);
		Thread.sleep(1000);
		driver.findElement(By.id("loginButton")).click();

	}

}
