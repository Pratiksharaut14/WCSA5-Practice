package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocatorAssignment {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://omayo.blogspot.com/");

		Thread.sleep(2000);

//				driver.findElement(By.xpath("//input[@name='userid']")).sendKeys("abcd");
//				Thread.sleep(2000);
//				driver.findElement(By.xpath("//input[@name='pswrd']")).sendKeys("abcd");
//				Thread.sleep(2000);
//				driver.findElement(By.xpath("//input[@class='gsc-//input']")).sendKeys("abcd");
//				Thread.sleep(2000);
//				driver.findElement(By.xpath("//input[@id='radio2']")).click();
//				Thread.sleep(2000);
//				driver.findElement(By.xpath("//input[@id='alert1']")).click();
//				Thread.sleep(2000);
//				driver.findElement(By.xpath("//input[@id='checkbox1']")).click();
//				Thread.sleep(2000);
//				driver.findElement(By.xpath("//input[@id='checkbox2']")).click();
//				Thread.sleep(2000);
////				driver.findElement(By.xpath("//input[@id='rotb']")).click();
//				Thread.sleep(2000);
//				driver.findElement(By.xpath("//input[@id='prompt']")).click();
//				Thread.sleep(2000);
//				driver.findElement(By.xpath("//input[@id='confirm']")).click();
//				Thread.sleep(2000);
////			driver.findElement(By.xpath("//button[@id='samename']")).click();
//				Thread.sleep(2000);
//				driver.findElement(By.xpath("//button[@type='button']")).click();
//				Thread.sleep(2000);
//				driver.findElement(By.xpath("//input[@id='sa']"));
//				Thread.sleep(2000);
//				driver.findElement(By.xpath("//input[@class='classone']"));
//				Thread.sleep(2000);
//				driver.findElement(By.xpath("//input[@class='dropbtn']"));
//				Thread.sleep(2000);
//				driver.findElement(By.xpath("//input[@value='Bicycle']"));
//				Thread.sleep(2000);
//				driver.findElement(By.xpath("//input[@value='Car']"));
//				Thread.sleep(2000);
//				driver.findElement(By.xpath("//input[@value='Pen']"));

	}

}
