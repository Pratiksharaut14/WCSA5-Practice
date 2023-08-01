package windowHandleAndHandlesAssignments;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAllBrowsersWithoutQuit {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://omayo.blogspot.com/");
		
		driver.findElement(By.linkText("Open a popup window")).click();
		
	    Set<String> allHandles = driver.getWindowHandles();  
	     
	    for( String wh : allHandles)
	    {
//	    	System.out.println(wh);
	    	driver.switchTo().window(wh).close();
	    }
		
	}

}
