package xpathassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathUsingDependantAndIndependant {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
				
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
				
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hp Laptop");
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		Thread.sleep(2000);
				
		driver.findElement(By.xpath("//div[@class='_3879cV' and text()='Core i5']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='Brand']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='HP' and @class='_3879cV']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='Operating System']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='Windows 10']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='HP Omen Core i5 7th Gen - (8 GB/1 TB HDD/128 GB SSD/Windows 10 Home/4 GB Graphics/NVIDIA GeForce GTX 1...']/../..//div[text()='₹87,490']")).click();


		
		

		

	}

}
