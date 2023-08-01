//Date : 5 june 2023

package methodsOfWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysMethod {

	public static void main(String[] args) {

//Used to send input to textboxes and active elements
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
//Using method chaining
		
		driver.findElement(By.name("username")).sendKeys("admin");
		
//Identify web element and use method of webelement
		
//		WebElement username = driver.findElement(By.name("username"));
		
//		username.sendKeys("admin");
		
		
	
	}

}
