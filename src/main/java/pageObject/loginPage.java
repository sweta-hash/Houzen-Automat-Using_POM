package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {

	public WebDriver driver;
	By logInEmail = By.cssSelector("input[id='email']");
	By loginPassword = By.cssSelector("input[id='password']");
	By loginButton = By.xpath("//*[text()='Log In']");
	public loginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	public WebElement getLogInEmail()
	{
		return driver.findElement(logInEmail);
	}
	public WebElement getLoginPassword()
	{
		return driver.findElement(loginPassword);
	}
	public WebElement getLoginButton()
	{
		return driver.findElement(loginButton);
	}
}
