package methodsOfWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValueMethod {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
//		Return type will depend on last method(have Object returntype)		
//		WebElement btn = driver.findElement(By.xpath("//button[text()=' Login ']"));
			
//		System.out.println(btn.getCssValue("font-size"));
		
//		Return type will depend on last method(getCssValue have String returntype)		
		String btn = driver.findElement(By.xpath("//button[text()=' Login ']")).getCssValue("font-size");
		
		
	}

}
