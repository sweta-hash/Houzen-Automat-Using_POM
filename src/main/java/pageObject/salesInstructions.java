package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class salesInstructions {
	public WebDriver driver;
	By heading = By.xpath("//*[text()='Sales Instructions']");
	By secondPropertyViewingFromTable = By.xpath("//*[@class='rt-tbody']/div[2]//*[@title='Book a viewing']");
	
	public salesInstructions(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	public WebElement getheading(){
		return driver.findElement(heading);
	}
	public WebElement getsecondPropertyViewingFromTable(){
		return driver.findElement(secondPropertyViewingFromTable);
	}
	

}
