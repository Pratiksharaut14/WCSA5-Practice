package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageOfZomato {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.zomato.com/india");
		
		driver.findElement(By.linkText("Sign up")).click();
		
//		driver.findElement(By.xpath("//input[@class='sc-1yzxt5f-9 bbrwhB']")).sendKeys("Ab Cd");
//		
//		driver.findElement(By.xpath("//input[@class='sc-1yzxt5f-9 bbrwhB']")).sendKeys("abcd@gmail.com");
//		
//		driver.findElement(By.xpath("//input[@class='sc-1o2pknd-1 iPRmnw']")).click();
//		
//		driver.findElement(By.xpath("//span[@class='sc-1kx5g6g-2 eXneOi']")).click();

		driver.findElement(By.cssSelector("input[class='sc-1yzxt5f-9 bbrwhB']")).sendKeys("Ab Cd");
		
		driver.findElement(By.cssSelector("input[class='sc-1yzxt5f-9 bbrwhB']")).sendKeys("abcd@gmail.com");
		
		driver.findElement(By.cssSelector("input[class='sc-1o2pknd-1 iPRmnw']")).click();
		
		driver.findElement(By.cssSelector("span[class='sc-1kx5g6g-2 eXneOi']")).click();


		
	}

}
