package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageOfInstagramUsingxpathLocator {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromdriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("abc@gmail.com");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Itsmepratiksha");

		driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']")).click();

	}

}
