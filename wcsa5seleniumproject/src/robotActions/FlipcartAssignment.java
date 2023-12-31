package robotActions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FlipcartAssignment {

	public static void main(String[] args) throws InterruptedException, AWTException {

		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		//To generate print popup
		
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_CONTROL);//Virtual Key
		
		robot.keyPress(KeyEvent.VK_P);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		robot.keyRelease(KeyEvent.VK_P);

		Thread.sleep(4000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		for(int i=1; i<=10; i++)
		{
			robot.keyPress(KeyEvent.VK_TAB);
			
			Thread.sleep(1000);
			
			robot.keyRelease(KeyEvent.VK_TAB);
			
		}
		
		Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
				
		robot.keyRelease(KeyEvent.VK_ENTER);

	}

}
