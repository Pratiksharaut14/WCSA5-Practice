//13 June 2023

package actionsClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class First {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.flipkart.com/");
				
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
						
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hp Laptop");	
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
				
		WebElement target = driver.findElement(By.xpath("//span[text()='Home & Furniture']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(target).perform();

		
		
	}

}
