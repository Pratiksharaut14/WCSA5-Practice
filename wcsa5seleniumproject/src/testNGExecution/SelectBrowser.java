package testNGExecution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SelectBrowser {
  static WebDriver driver;
  @Test
  @Parameters({"browser", "url", "Vusername", "Vpassword"})
  public void testParallelMethod(String browserValue, String url, String usn, String pwd) throws InterruptedException {
	  
	  if(browserValue.equalsIgnoreCase("Chrome"))
	  {
	  
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	  
	   driver = new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  
	  driver.get(url);
	  
	  driver.findElement(By.name("username")).sendKeys(usn);
	  
	  driver.findElement(By.name("pwd")).sendKeys(pwd);
	  
	  driver.findElement(By.id("loginButton")).click();
	  
	  Thread.sleep(1000);
	  
	  driver.quit();
	  
	  }	  
	  
	  else if(browserValue.equalsIgnoreCase("Firefox"))
	  {
	  
	  System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	  
	   driver = new FirefoxDriver();
	  
	  driver.manage().window().maximize();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  
	  driver.get(url);
	  
	  driver.findElement(By.name("username")).sendKeys(usn);
	  
	  driver.findElement(By.name("pwd")).sendKeys(pwd);
	  
	  driver.findElement(By.id("loginButton")).click();
	  
	  Thread.sleep(1000);
	  
	  driver.quit();
	  
	  }	  
  }
}
