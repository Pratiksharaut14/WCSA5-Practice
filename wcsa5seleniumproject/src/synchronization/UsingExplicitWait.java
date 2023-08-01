package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsingExplicitWait {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
		driver.get("https://www.shoppersstack.com/");
		
		WebDriverWait explicitwait = new WebDriverWait(driver, Duration.ofSeconds(60));
		
		driver.findElement(By.xpath("//img[@alt='electronics']")).click();
		
		driver.findElement(By.linkText("MOBILES")).click();
		
		driver.findElement(By.xpath("//span[text()='MOBILE PHONE']")).click();
		
		driver.findElement(By.xpath("//input[text()='Check Delivery']")).sendKeys("411033");

		driver.findElement(By.id("Check")).click();
	}

}
