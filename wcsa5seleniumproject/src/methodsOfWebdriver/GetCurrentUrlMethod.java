package methodsOfWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrlMethod {

	public static void main(String[] args) {
        
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		 
        driver.get("https://www.instagram.com/");
        
        driver.manage().window().maximize();
        
        String pageUrl = driver.getCurrentUrl();        
        
        System.out.println(pageUrl);
	}

}
