package robotActions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BluestoneAssignment {

	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.bluestone.com/");

		// If popup is inspectable we call it as hidden division popup(Handle hidden
		// division popup)

		driver.findElement(By.id("denyBtn")).click();

		Actions act = new Actions(driver);

//		To reduce lines of code instead of creating object and storing target we passed web element directly
//		(generalization)
		act.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Watch Jewellery ')]"))).perform();

		driver.findElement(By.xpath("//a[contains(text(),'Band')]")).click();
		
		Thread.sleep(4000);
		
		WebElement target = driver.findElement(By.xpath("//div[text()='Filter by']"));
		
		for(int i=0; i<2; i++)
		{
			act.doubleClick(target).perform();
			act.clickAndHold(target).perform();
		}
			

		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_C);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);		
		robot.keyRelease(KeyEvent.VK_C);
		
//		Identify Search box
		driver.findElement(By.id("searchbox_elastic_search")).click();
		
//		Paste filter by text 
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		Thread.sleep(2000);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);		
		robot.keyRelease(KeyEvent.VK_V);
			
//		Click enter button
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(2000);

//		Verify 1 Design button is displayed or not
		if(driver.findElement(By.xpath("//span[text()='1 Designs']")).isDisplayed())
		{
			Thread.sleep(2000);
			driver.quit();
		}
		else
		{
			System.out.println("Exception!!!");
		}
		
	}

}
