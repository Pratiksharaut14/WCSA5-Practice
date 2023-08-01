package javascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PumaAssignment {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://in.puma.com/in/en/womens");
		
		WebElement shoes = driver.findElement(By.xpath("//span[text()='PUMA Black-PUMA Black-Purple Charcoal-Rose Dust']"));
		 
		Point loc = shoes.getLocation();
		
		int xaxis = loc.getX();
		int yaxis = loc.getY();
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		jse.executeScript("window.scrollBy("+xaxis+","+yaxis+")");
		
	}

}
