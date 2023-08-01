package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLoginPage {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("abc@gmail.com");
		
//		driver.wait();
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("abcdefghij");
		
//		driver.wait();
		
		driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']")).click();
	}

}
