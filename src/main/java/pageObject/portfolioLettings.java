package pageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class portfolioLettings {
	public WebDriver driver;
	By plusSignToAddProperty = By.xpath("//*[contains(@class,'MuiSpeedDial-root')]");
	By clearAreaCode = By.xpath("//*[@title='Clear']");
	By countryUK = By.xpath("//*[text()='Search by Country']/parent::div//input");
	By areaCode = By.xpath("//*[text()='Search by AreaCode']/parent::div");
	By firstCheckBox = By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div/div/div[3]/div[1]/div/div[2]/div[3]/div[1]/div[2]/div[1]/div/div[1]/input");
	By secondCheckBox = By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div/div/div[3]/div[1]/div/div[2]/div[3]/div[1]/div[2]/div[2]/div/div[1]/input");
	By trade =By.xpath("//*[text()='Trade']");
	By withdrawFirstProperty= By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div/div/div[3]/div[1]/div/div[2]/div[3]/div[1]/div[2]/div[1]/div//*[@d='M6 19c0 1.1.9 2 2 2h8c1.1 0 2-.9 2-2V7H6v12zm2.46-7.12l1.41-1.41L12 12.59l2.12-2.12 1.41 1.41L13.41 14l2.12 2.12-1.41 1.41L12 15.41l-2.12 2.12-1.41-1.41L10.59 14l-2.13-2.12zM15.5 4l-1-1h-5l-1 1H5v2h14V4z']");
	By confirm = By.xpath("//*[text()='Confirm']");
	By ok = By.xpath("//*[text()='OK']");
	
	public portfolioLettings(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	public WebElement getplusSignToAddProperty() {
		
		return driver.findElement(plusSignToAddProperty);
	}
	public WebElement getclearAreaCode() {
		
		return driver.findElement(clearAreaCode);
	}
	public WebElement getcountryUK() {
		
		return driver.findElement(countryUK);
	}
	public WebElement getareaCode() {
		
		return driver.findElement(areaCode);
	}
	public WebElement getfirstCheckBox() {
		
		return driver.findElement(firstCheckBox);
	}
	public WebElement getsecondCheckBox() {
	
		return driver.findElement(secondCheckBox);
	}
	public WebElement gettrade() {
		
		return driver.findElement(trade);
	}
	public WebElement getwithdrawFirstProperty() {
		
		return driver.findElement(withdrawFirstProperty);
	}
	public WebElement getconfirm() {
		
		return driver.findElement(confirm);
	}
	public WebElement getok() {
		
		return driver.findElement(ok);
	}

}
