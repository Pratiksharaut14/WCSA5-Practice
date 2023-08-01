package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(xpath="//*[@name='username']") private WebElement usn;
	@FindBy(xpath="//*[@name='pwd']") private WebElement pwd;
	@FindBy(xpath="//*[contains(@class,'initial')]") private WebElement loginButton;
	@FindBy(id="keepLoggedInCheckBox") private WebElement checkBox;
	@FindBy(partialLinkText="Actimind Inc.") private WebElement actimind;

//Initialization

public LoginPage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}

//Utilization

public WebElement getUsn() {
	return usn;
}

public WebElement getPwd() {
	return pwd;
}

public WebElement getLoginButton() {
	return loginButton;
}

public WebElement getCheckBox() {
	return checkBox;
}

public WebElement getActimind() {
	return actimind;
}

//Operational Method

public void validLoginMethod(String validUsername,String validPassword)
{
	usn.sendKeys(validUsername);
	pwd.sendKeys(validPassword);
	loginButton.click();
}

public void inValidLoginMethod(String invalidUsername,String invalidPassword) throws InterruptedException
{
	usn.sendKeys(invalidUsername);
	pwd.sendKeys(invalidPassword);
	loginButton.click();
	Thread.sleep(1000);
	usn.clear();
}


}