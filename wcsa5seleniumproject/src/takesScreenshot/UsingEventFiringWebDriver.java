package takesScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class UsingEventFiringWebDriver {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
				
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.edureka.co/community/48205/possible-screenshot-with-eventfiringwebdriver-selenium");
		
		EventFiringWebDriver efwd =new EventFiringWebDriver(driver); //Third party class
	
		File src = efwd.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("./screenshots/edureka.png");
		
		Files.copy(src, dest);
		
	}

}
