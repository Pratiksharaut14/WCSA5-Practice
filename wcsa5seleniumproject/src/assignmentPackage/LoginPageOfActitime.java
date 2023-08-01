package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageOfActitime {

	public static void main(String[] args) throws InterruptedException {
      
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://127.0.0.1/login.do;jsessionid=7i35kpkegf5ft");
		
		driver.findElement(By.name("username")).sendKeys("admin");
		
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.className("logout")).click();
		
	}

}
