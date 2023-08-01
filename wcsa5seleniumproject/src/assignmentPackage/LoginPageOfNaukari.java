package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageOfNaukari {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com/nlogin/login?msg=0&URL=https%3A%2F%2Fmy.naukri.com%3A80");
		
		driver.findElement(By.id("usernameField")).sendKeys("abcd@gmail.com");
		
		driver.findElement(By.id("passwordField")).sendKeys("abcdabcd");
		
		driver.findElement(By.xpath("//button[@class='waves-effect waves-light btn-large btn-block btn-bold blue-btn textTransform']")).click();
			
	}

}
