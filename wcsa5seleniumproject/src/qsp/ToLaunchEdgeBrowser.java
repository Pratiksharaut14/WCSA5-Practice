package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToLaunchEdgeBrowser {

	public static void main(String[] args) throws InterruptedException {
		//Relative path of driver executable file 

	//	System.setProperty("","");
		WebDriver driver = new EdgeDriver();
		
		Thread.sleep(3000);
	     driver.close();
	}
	

}
