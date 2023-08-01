package dataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLoginTestCase {

	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("http://pratiksha/login.do");

		//Read data from excel file and test login page

		Flib flib = new Flib();
		
//		int rc = flib.getLastRowCount("./data/ActitimeData.xlsx", "Valid");

		
//		String validUsername = flib.readExcelData("./data/ActitimeData.xlsx", "Valid", 1, 0);
//
//		String validPassword = flib.readExcelData("./data/ActitimeData.xlsx", "Valid", 1, 1);


//		driver.findElement(By.name("username")).sendKeys(validUsername);
//		Thread.sleep(1000);
//		driver.findElement(By.name("pwd")).sendKeys(validPassword);
//		Thread.sleep(1000);
//		driver.findElement(By.id("loginButton")).click();
		
		driver.findElement(By.name("username")).sendKeys(flib.readExcelData("./data/ActitimeData.xlsx", "Valid", 1, 0));
		Thread.sleep(1000);
		driver.findElement(By.name("pwd")).sendKeys(flib.readExcelData("./data/ActitimeData.xlsx", "Valid", 1, 1));
		Thread.sleep(1000);
		driver.findElement(By.id("loginButton")).click();
		
//		System.out.println(rc+1);
//		
//		flib.writeExcelData("./data/ActitimeData.xlsx", "Valid", rc+1, 0, "Manager");
	}

}
