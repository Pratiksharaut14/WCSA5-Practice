package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorAssignment {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://omayo.blogspot.com/");

		Thread.sleep(2000);
		
//		driver.findElement(By.cssSelector("//input[@class='userid']")).sendKeys("abcd");
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("//input[@class='pswrd']")).sendKeys("abcd");
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("input[class='gsc-input']")).sendKeys("abcd");
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("input[id='radio1']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("input[id='radio2']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("input[id='alert1']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("input[id='checkbox1']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("input[id='checkbox2']")).click();
//		Thread.sleep(2000);
////		driver.findElement(By.cssSelector("input[id='rotb']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("input[id='prompt']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("input[id='confirm']")).click();
//		Thread.sleep(2000);
////	driver.findElement(By.cssSelector("button[id='samename']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("button[type='button']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("input[id='sa']"));
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("input[class='classone']"));
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("input[class='dropbtn']"));
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("//input[@class='vehicle']"));
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("input[value='Bicycle']"));
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("input[value='Car']"));
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("input[value='Pen']"));
		
		

	}

}
