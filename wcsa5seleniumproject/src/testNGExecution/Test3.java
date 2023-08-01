package testNGExecution;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test3 {
  @Test
  public void test3(){
	  
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  
	  driver.get("http://google.com/");
	  
	  driver.switchTo().activeElement().sendKeys("Manual",Keys.ENTER);
	  
	  driver.quit();
	  
	  Reporter.log("Manual", true);
  }
}
