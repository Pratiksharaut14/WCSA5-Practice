package dataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLoginTestCase {

	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("http://pratiksha/login.do");

		//Read data from excel file and test login page

		Flib flib = new Flib();
		
		int rc = flib.getLastRowCount("./data/ActitimeData.xlsx", "Invalid");
		
		//Multiple data for loop
		
		for(int i=1; i<=rc; i++)			
		{

//		String inValidUsername = flib.readExcelData("./data/ActitimeData.xlsx", "Invalid", i, 0);
//
//		String inValidPassword = flib.readExcelData("./data/ActitimeData.xlsx", "Invalid", i, 1);
//
//		driver.findElement(By.name("username")).sendKeys(inValidUsername);
//		Thread.sleep(1000);
//		driver.findElement(By.name("pwd")).sendKeys(inValidPassword);
//		Thread.sleep(1000);
//		driver.findElement(By.id("loginButton")).click();
		
//		driver.findElement(By.name("username")).clear();
		
		driver.findElement(By.name("username")).sendKeys(flib.readExcelData("./data/ActitimeData.xlsx", "Invalid", i, 0));
		Thread.sleep(1000);
		driver.findElement(By.name("pwd")).sendKeys(flib.readExcelData("./data/ActitimeData.xlsx", "Invalid", i, 1));
		Thread.sleep(1000);
		driver.findElement(By.id("loginButton")).click();

		driver.findElement(By.name("username")).clear();
		
		}
		
	}

}
