package testNGPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionInTestNG {

	@Test
	public void verificationMethod() throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://pratiksha/login.do");
		
		String actualTitle = driver.getTitle();
		
//		Non-Crirical feature
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(driver.getTitle(),actualTitle);
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		System.out.println("title matched test case passed!!!");
		sa.assertAll();
		
//		Non-Crirical feature
		
//		if(driver.getTitle().equalsIgnoreCase(actualTitle))
//		{
//			driver.findElement(By.name("username")).sendKeys("admin");
//			
//			driver.findElement(By.name("pwd")).sendKeys("manager");
//			
//			driver.findElement(By.id("loginButton")).click();
//			
//			System.out.println("Login Page Title Matched!!! Test case passed");
//			
//			driver.quit();
//
//		}
//		
//		else
//		{
//			System.out.println("Login Page Title not Matched!!! Test case failed");
//			
//			driver.quit();
//		}
		
//		Crirical feature
		
		String actualTitleOfHomePage = driver.getTitle();
		Assert.assertEquals(driver.getTitle(),"Tanmay");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();
		
//		Crirical feature
		
//		if(driver.getTitle().equalsIgnoreCase("jhgf0"))
//		{
//			System.out.println("Home page title matched test case passed!!!");
//		}
//		
//		else
//		{
//			System.out.println("Home page Title not matched test case failed!!!");
//		}
	}

}
