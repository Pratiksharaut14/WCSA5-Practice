//23 May 2023

package xpathlocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathCase3 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/downloads/");
		
		Thread.sleep(2000);
		
		//Using or for attribute
		driver.findElement(By.xpath(""));
		
		//Using and for attributes
		driver.findElement(By.xpath("//button[@type='button' and @class='btn btn-dark btn-lg btn-block rounded-0 text-left collapsed']]"));

		//using or for text
		driver.findElement(By.xpath("//p[text()='Java' or text()='Python']"));

	}

}
