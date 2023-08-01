package javascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import methodsOfWebElements.SendKeysMethod;

public class HandleDisabledWebElement {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///E:/WCSA5/WebElements/Disabled_ele.html");
		
		driver.findElement(By.id("i1")).sendKeys("admin");
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		jse.executeScript("document.getElementById('i2').value='manager'");
		
	}

}
