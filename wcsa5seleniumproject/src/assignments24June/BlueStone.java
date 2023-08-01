package assignments24June;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BlueStone {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.bluestone.com/");
		
		driver.findElement(By.id("denyBtn")).click();
		
		Actions act = new Actions(driver);
		
		act.moveToElement(driver.findElement(By.xpath("//span[text()='Offers ']"))).perform();

		driver.findElement(By.xpath("//span[text()='Up To 20% Off Making Charges']")).click();
		
		act.moveToElement(driver.findElement(By.xpath("//span[text()='Offers']"))).perform();
		
		driver.findElement(By.xpath("//span[text()=' 20% Making Charge Off ']")).click();

		System.out.println(driver.findElement(By.xpath("//span[@class='offer']")).isDisplayed());
		
		driver.close();

		
	}

}
