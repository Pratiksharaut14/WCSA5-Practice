//7 June 2023
package xpathassignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAssignmentFlipcart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
				
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hp Laptop");	

		driver.findElement(By.xpath("//button[@type='submit']")).click();
			
		driver.findElement(By.xpath("//div[@class='_3879cV' and text()='Core i7']")).click();
		
		driver.findElement(By.xpath("//div[text()='Brand']")).click();
		
		driver.findElement(By.xpath("//div[text()='HP' and @class='_3879cV']")).click();
		
		driver.findElement(By.xpath("//div[text()='Operating System']")).click();
		
		driver.findElement(By.xpath("//div[text()='Windows 11']")).click();
	
		driver.findElement(By.xpath("//div[text()='Customer Ratings']")).click();
		
		driver.findElement(By.xpath("//div[text()='4★ & above']")).click();
		
		
		
		
	}

}
