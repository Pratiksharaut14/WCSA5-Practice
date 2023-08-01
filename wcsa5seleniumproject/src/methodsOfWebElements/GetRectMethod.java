package methodsOfWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRectMethod {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.selenium.dev/");
		
//		WebElement readmore = driver.findElement(By.xpath("//a[@class='selenium-button selenium-webdriver text-uppercase font-weight-bold']"));	
//		System.out.println(readmore.getRect());
		
		Rectangle readmore = driver.findElement(By.xpath("//a[@class='selenium-button selenium-webdriver text-uppercase font-weight-bold']")).getRect();
		
		int xaxis = readmore.getX();
		int yaxis = readmore.getY();
		
		int height = readmore.height;
		int width = readmore.width;
		
		System.out.println("x axis = "+xaxis+" y axis = "+yaxis+" Height = "+height+" Width = "+width	);

		
	}

}
