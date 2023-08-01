package methodsOfWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizeMethod {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.selenium.dev/");
		
//		WebElement text = driver.findElement(By.xpath("//h1[@class='display-1']"));		
//		System.out.println(text.getSize());
		
		Dimension text = driver.findElement(By.xpath("//h1[@class='display-1']")).getSize();
		
		int height = text.height;
		int width = text.width;
		
		System.out.println("Height is " + height);
		
		System.out.println("Width is " + width);

	}

}
