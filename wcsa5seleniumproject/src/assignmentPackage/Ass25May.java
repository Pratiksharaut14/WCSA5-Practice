package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass25May {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.linkedin.com/signup/cold-join?session_redirect=https%3A%2F%2Fwww%2Elinkedin%2Ecom%2Fmynetwork%2Fdiscover-hub%2F&trk=login_reg_redirect");
		
		Thread.sleep(2000);
		
//		Unique Attribute		
		driver.findElement(By.xpath("//input[@id='email-or-phone']")).sendKeys("abc@gmail.com");
		
		Thread.sleep(2000);
		
//		Multiple Attributes
		driver.findElement(By.xpath("//input[@class='input__input' and @id='password']")).sendKeys("abcdefgh");
//		driver.findElement(By.xpath("//input[@class='input__input' and @autocomplete='new-password']]")).sendKeys("abcdefgh");

		Thread.sleep(2000);
		
//		Text
		driver.findElement(By.xpath("//button[text()='Agree & Join']"));
		
		Thread.sleep(2000);

//		Using Contains
		driver.findElement(By.xpath("//a[contains(@class,'main__sign-in-link')]")).click();
		
		

	}

}
