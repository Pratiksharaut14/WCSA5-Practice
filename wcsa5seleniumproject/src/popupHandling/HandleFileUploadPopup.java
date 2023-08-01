package popupHandling;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleFileUploadPopup {

	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://omayo.blogspot.com/");
		
//		driver.get("http://pratiksha/login.do");
		
//		driver.findElement(By.name("username")).sendKeys("admin");
//		
//		driver.findElement(By.name("pwd")).sendKeys("manager");
//		
//		driver.findElement(By.id("loginButton")).click();
//		
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		
		WebElement uploadBtn = driver.findElement(By.id("uploadfile"));
				
		Actions file = act.moveToElement(uploadBtn);
		
		file.click().perform();
		
		Runtime.getRuntime().exec("./autoItPrograms/OmayoFileUpload.exe");
		
		Thread.sleep(2000);
		
		driver.quit();
		
		
	}

}
