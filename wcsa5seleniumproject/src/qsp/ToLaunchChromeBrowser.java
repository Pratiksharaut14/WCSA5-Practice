package qsp;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver.Options;
//import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLaunchChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
	//Relative path of driver executable file 
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

	//Upcast into WebDriver Interface
     WebDriver driver = new ChromeDriver();
     
     //Maximize browser
     //Options manage = driver.manage();
     //Window win = manage.window(); 
     //win.maximize();       
     
     driver.manage().window().maximize();
     
     
     //Provide delay of 2 seconds
     Thread.sleep(2000); //Stop execution for 2 seconds
       
     //To close Browser
     driver.close();
	}

}
