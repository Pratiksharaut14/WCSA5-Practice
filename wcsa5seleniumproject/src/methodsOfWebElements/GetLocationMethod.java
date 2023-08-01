
package methodsOfWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationMethod {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.selenium.dev/");
		
//		WebElement link = driver.findElement(By.xpath("//a[text()='MohabMohie']"));		
//		System.out.println(link.getLocation());
		
		Point link = driver.findElement(By.xpath("//a[text()='MohabMohie']")).getLocation();
		
		int xaxis = link.getX();
		int yaxis = link.getY();
		
		System.out.println("Locations of x axis is " + xaxis);
		
		System.out.println("Locations of y axis is " + yaxis);

	
	}

}
