package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeSynchronizaltion {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
						
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://desktop-mm32fck/login.do");
		
		String actualTitleOfLoginPage = driver.getTitle();
        explicitWaitMethod(driver,30, actualTitleOfLoginPage);

		
			System.out.println("Title is matched, Test Case is passed");
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
			driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
			driver.findElement(By.xpath("//a[@id='loginButton']")).click();

		
			System.out.println("Title is matched, Test Case is Passed!");	
		
	}
	
			public static void explicitWaitMethod(WebDriver driver,int sec,String title)
			{
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(sec));
				wait.until(ExpectedConditions.titleContains(title));
			}
		
	

}
