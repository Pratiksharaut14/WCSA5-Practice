package takesScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreeenShotUsingExplicitTypecasting {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://google.com/");
		
//		Typecasting from WebDriver to TakesScreeenShot
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
//		OutputType : In which type we want screen shot and file is type
		
		File dest = new File("./screenshots/google.png"); //1)Path 2)Name 3)Extension
		
		Files.copy(src, dest);
		
	}

}
