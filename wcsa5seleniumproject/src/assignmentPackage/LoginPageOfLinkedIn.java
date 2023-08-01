package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageOfLinkedIn {

	public static void main(String[] args) {

	    System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
		
		driver.findElement(By.id("username")).sendKeys("abcd@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("abcdabcd");
		
		driver.findElement(By.xpath("//button[@class='btn__primary--large from__button--floating']")).click();

	}

}
