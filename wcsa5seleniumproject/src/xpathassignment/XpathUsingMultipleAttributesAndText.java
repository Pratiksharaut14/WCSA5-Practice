package xpathassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathUsingMultipleAttributesAndText {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.netflix.com/in/login");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='text' and @name='userLoginId']")).sendKeys("abcd@gmail.com");
//      driver.findElement(By.xpath("//input[@type='text' or @name='userLoginId']")).sendKeys("abcd@gmail.com");
	
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@type='password' and @autocomplete='password']")).sendKeys("abcdefgh");
//		driver.findElement(By.xpath("//input[@type='password' or @autocomplete='password']")).sendKeys("abcdefgh");
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		
	}

}
