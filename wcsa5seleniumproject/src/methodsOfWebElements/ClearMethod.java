//Date 5 June 2023
package methodsOfWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		driver.get("http://desktop-mm32fck/login.do");
		
		WebElement un = driver.findElement(By.name("username"));
		
		un.sendKeys("admin");
		
		WebElement pwd = driver.findElement(By.name("pwd"));
		
		pwd.sendKeys("manager");
		
		Thread.sleep(2000);
		
		un.clear();
		
		pwd.clear();
		
	}

}
