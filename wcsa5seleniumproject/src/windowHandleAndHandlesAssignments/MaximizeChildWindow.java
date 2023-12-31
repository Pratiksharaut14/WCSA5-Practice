package windowHandleAndHandlesAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeChildWindow {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://omayo.blogspot.com/");
		
		driver.findElement(By.linkText("Open a popup window")).click();
	
		driver.close();
	}

}
