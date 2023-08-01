package dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultiSelectDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///E:/WCSA5/WebElements/multiselectdropdown.html");
		
		WebElement msdropdown = driver.findElement(By.id("menu"));
		
		Select sel = new Select(msdropdown);
		
		sel.selectByIndex(2);	
		
		Thread.sleep(1000);
		
		sel.selectByVisibleText("Icecream");
		
		Thread.sleep(1000);
		
		sel.selectByValue("b2");
		
		
		
	}

}
