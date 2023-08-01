//24 May 2023 //29 May 2023

package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FlipCartAssignment {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
				
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
				
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Mobile");
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
