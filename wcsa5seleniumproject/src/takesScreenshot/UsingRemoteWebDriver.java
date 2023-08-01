package takesScreenshot;

import java.io.File;
import java.io.IOException;
import java.rmi.Remote;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class UsingRemoteWebDriver {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		RemoteWebDriver rwd = new ChromeDriver(); // upcasting BSC into RemoteWebDriver class
		
		rwd.manage().window().maximize();
		
		rwd.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		rwd.get("https://www.instagram.com/");
		
		File src = rwd.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("./screenshots/insta.png");
		
		Files.copy(src, dest);
			
		
	}

}
