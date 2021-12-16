package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class leftSideBar {
	
	public WebDriver driver;
	By instructions = By.xpath("//*[@id='root']//*[text()='Instructions']");
	By instructionsSales = By.xpath("//*[@id=\"root\"]//*[text()='Instructions - Sales']");
	By instructionsLettings = By.xpath("//*[@id=\"root\"]//*[text()='Instructions - Lettings']");
	By yourPortfolio = By.xpath("//*[@id='root']//*[text()='Your Portfolio']");
	By portfolioSales = By.xpath("//*[@id=\"root\"]//*[text()='Portfolio - Sales']");
	By portfolioLettings = By.xpath("//*[@id=\"root\"]//*[text()='Portfolio - Lettings']");
	By requestProperty = By.xpath("//*[@id=\"root\"]//*[text()='Request Property']");
	
	public leftSideBar(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	public WebElement getinstructions()
	{
		return driver.findElement(instructions);
	}
	public WebElement getinstructionsSales()
	{
		return driver.findElement(instructionsSales);
	}
	public WebElement getinstructionsLettings()
	{
		return driver.findElement(instructionsLettings);
	}
	public WebElement getyourPortfolio()
	{
		return driver.findElement(yourPortfolio);
	}
	public WebElement portfolioSales()
	{
		return driver.findElement(portfolioSales);
	}
	public WebElement getportfolioLettings()
	{
		return driver.findElement(portfolioLettings);
	}
	public WebElement getrequestProperty()
	{
		return driver.findElement(requestProperty);
	}
	

}
