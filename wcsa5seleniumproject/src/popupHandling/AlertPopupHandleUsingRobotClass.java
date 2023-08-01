package popupHandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.beust.ah.A;

public class AlertPopupHandleUsingRobotClass {

	public static void main(String[] args) throws AWTException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///E:/WCSA5/WebElements/alert.html");
		
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		//Handle alert popup by using Robot Class
		
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
//		For edge browser
//		We need to use switchTo()
//		Alert al = driver.switchTo().alert();
//		al.accept(); -- For accepting the popup
//		al.dismiss(); -- For dismiss the popup
//		System.out.println(al.getText()); --Will print the text
		
//		Using SwitchTo()
		
//		Alert al = driver.switchTo().alert();
		
//		al.accept();
//		al.dismiss();
//		System.out.println(al.getText());
//		al.accept();

		
	}

}
