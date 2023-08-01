package windowHandleAndHandlesAssignments;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseOnlyChildBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://omayo.blogspot.com/");
		
		driver.findElement(By.linkText("Open a popup window")).click();
			    
//	    driver.switchTo().window(driver.getWindowHandle()).close();
		
	    String PWindow = driver.getWindowHandle();
	    
	    Set<String> allHandles = driver.getWindowHandles();
	    
	    for(String wh : allHandles)
	    {
	    	if(!PWindow.equals(wh))
	    	{
	    		Thread.sleep(1000);
	    		driver.switchTo().window(wh).close();
	    	}
	    }

	}

}
