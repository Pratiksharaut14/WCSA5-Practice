package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageOfNetflix {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.netflix.com/in/login");
		
		driver.findElement(By.id("id_userLoginId")).sendKeys("abcd@gmail.com");
		
		driver.findElement(By.id("id_password")).sendKeys("abcdabcd");
		
//		driver.findElement(By.xpath("//button[@class='btn login-button btn-submit btn-small']")).click();
		
		driver.findElement(By.cssSelector("button[class='btn login-button btn-submit btn-small']")).click();
		
		
	}

}
