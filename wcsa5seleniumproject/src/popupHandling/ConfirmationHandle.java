package popupHandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ConfirmationHandle {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
		driver.get("file:///E:/WCSA5/WebElements/confirmation.html");
		
		driver.findElement(By.tagName("input")).click();
		
		Thread.sleep(2000);
		
//		Alert al = driver.switchTo().alert();
		
//		al.accept();
		
//		al.dismiss();
		
//		System.out.println(al.getText());
//		
//		al.accept();
		
//	Using Robot class
		
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		
	}

}
