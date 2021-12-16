package pageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class tradeProperty {
	public WebDriver driver;
	
	By defaultCheckBox = By.xpath("//*[contains(@class,'jss800')]");
	By commission = By.xpath("//*[@placeholder=\"Commission\"]");
	By incentive = By.xpath("//*[@placeholder=\"Incentive\"]");
	By submit = By.xpath("//*[text()='Submit']");
	By ok = By.xpath("//*[text()='OK']");
	
	public tradeProperty(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	public WebElement getdefaultCheckBox() {
		
		return driver.findElement(defaultCheckBox);
	}
	public WebElement getcommission() {
		
		return driver.findElement(commission);
	}
	public WebElement getincentive() {
	
	return driver.findElement(incentive);
	}
	public WebElement getsubmit() {
		
		return driver.findElement(submit);
	}
	public WebElement getok() {
		
		return driver.findElement(ok);
	}

}
