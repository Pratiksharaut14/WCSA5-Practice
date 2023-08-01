package pom;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import keywordDrivenFramework.Flib;

public class BaseTest extends Flib implements IautoConstant {
	static WebDriver driver;
	
	public void setUp() throws IOException
	{
		Flib flib = new Flib();
		
		String browserValue = flib.readPropertyData(PROP_PATH, "Browser");
		
		String url = flib.readPropertyData(PROP_PATH, "Url");	
		
		if(browserValue.equalsIgnoreCase("chrome"))
		{
			System.setProperty(CHROME_KEY, CHROME_PATH);
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);
		}
		
		else if(browserValue.equalsIgnoreCase("Firefox"))
		{
			System.setProperty(GECKO_KEY, GECKO_PATH);
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);
		}
		
		else if(browserValue.equalsIgnoreCase("Edge"))
		{
			System.setProperty(EDGE_KEY, EDGE_PATH);
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);
		}
		
		else
		{
			System.out.println("Enter valid Browser!!!");
		}
		
	}

	public void tearDown()
	{
		driver.quit();
	}
}
