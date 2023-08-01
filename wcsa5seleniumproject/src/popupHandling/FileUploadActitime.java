package popupHandling;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadActitime {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
		driver.get("http://pratiksha/login.do");
		
		driver.findElement(By.name("username")).sendKeys("admin");
		
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		driver.findElement(By.id("loginButton")).click();
		
		driver.findElement(By.xpath("//div[text()='Settings']/ancestor::a")).click();
		
		driver.findElement(By.xpath("//a[text()='Logo & Color Scheme']")).click();
		
		driver.findElement(By.id("uploadNewLogoOption")).click();
		
		WebElement target = driver.findElement(By.name("formCustomInterfaceLogo.logo"));

		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
				
		Actions file = act.moveToElement(target);
		
		file.click().perform();
		
		Thread.sleep(1000);
		
		Runtime.getRuntime().exec("./autoItPrograms/ActitimeFileUpload.exe");
		
//		driver.quit();
	}

}
