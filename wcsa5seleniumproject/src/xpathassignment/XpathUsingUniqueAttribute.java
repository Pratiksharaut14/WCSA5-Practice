package xpathassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathUsingUniqueAttribute {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.linkedin.com/signup/");
		
		driver.findElement(By.xpath("//input[@id='email-or-phone']")).sendKeys("abcd@gmail.com");

		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abcdefgh");
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@id='join-form-submit']")).click();
		
	
	}

}
