package xpathassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathUsingContains {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.udemy.com/join/login-popup/?locale=en_US&response_type=html&next=https%3A%2F%2Fwww.udemy.com%2Fjoin%2Flogin");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys("abcd@gmail.com");
	
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[contains(@id,'form-group--3')]")).sendKeys("abcdefgh");
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[contains(@type,'submit') and contains(@class,'ud-btn ud-btn-large ud-btn-brand ud-heading-md helpers--auth-submit-button--2K2dh') ]")).click();
	}

}
