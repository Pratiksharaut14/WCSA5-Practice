package javascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;

		
//		SCROLL UP AND DOWN
		
//		driver.get("https://in.puma.com/in/en");
//		
//		jse.executeScript("window.scrollBy(0,350);");
//		
//		Thread.sleep(2000);
//		
//		jse.executeScript("window.scrollBy(0,-350);");
		
		
		
//		SCROLL LEFT AND RIGHT
		
//		driver.get("https://dashboards.handmadeinteractive.com/jasonlove/");
//		
//		Thread.sleep(2000);
//		
//		jse.executeScript("window.scrollBy(5000,0)");
//		
//		Thread.sleep(2000);
//
//		jse.executeScript("window.scrollBy(-5000,0)");
		
		driver.get("file:///E:/WCSA5/WebElements/Disabled_ele.html");
		
		driver.findElement(By.id("i1")).sendKeys("admin");
		
		jse.executeScript("document.getElementById('i2').value='manager'");
		
		
	}

}
