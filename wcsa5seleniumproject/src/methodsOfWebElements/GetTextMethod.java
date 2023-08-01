//Date 5 June 2023

package methodsOfWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMethod {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		driver.get("http://desktop-mm32fck/login.do");
		
		WebElement text = driver.findElement(By.className("initial"));
	
//		Will print address of web element
//		System.out.println(text); 
		
		System.out.println(text.getText());
		
	
	}

}
