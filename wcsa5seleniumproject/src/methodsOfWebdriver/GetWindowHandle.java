package methodsOfWebdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle {

	public static void main(String[] args) {
        
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		 
        driver.get("https://www.amazon.in/");
        
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
//		driver.switchTo().activeElement().sendKeys("Samsung mobiles",Keys.ENTER);	
        
        driver.findElement(By.xpath("//label[text()='Search Amazon.in']")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Samsung Galaxy M14 5G (ICY Silver, 6GB, 128GB Storage) | 50MP Triple Cam | 6000 mAh Battery | 5nm Octa-Core Processor | 12GB RAM with RAM Plus | Android 13 | Without Charger')]")).click();

        
//        String windowHandle = driver.getWindowHandle();
//        
//        System.out.println(windowHandle);
	}

}
