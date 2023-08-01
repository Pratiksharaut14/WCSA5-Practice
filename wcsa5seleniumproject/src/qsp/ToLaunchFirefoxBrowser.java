package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToLaunchFirefoxBrowser {

	public static void main(String[] args) throws InterruptedException {
		//Relative path of driver executable file 
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");

		//Upcast to WebDriver INnterface
        WebDriver driver= new FirefoxDriver();
        
        //Delay
        Thread.sleep(2000);
        
        driver.close();
	}

}
