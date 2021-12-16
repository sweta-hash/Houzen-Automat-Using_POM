package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class bookAviewing {
	public WebDriver driver;
	By searchPreviousApplicant = By.xpath("//*[@placeholder='Search previous applicant']");
	By next = By.xpath("//*[text()='Next']");
	By applicantFullName = By.xpath("//*[@placeholder='Applicant full name']");
	By viewingDate = By.xpath("//*[@placeholder='Viewing Date']");
	By viewingDateNextMonth = By.xpath("//*[@class='rdtNext']");
	By randomDate = By.xpath("//*[@class='rdtDays']//tr[4]/td[4]");
	By viewingTime = By.xpath("//*[@placeholder='Viewing Time']");
	By increaseHrTime = By.xpath("//*[@class='rdtTime']//div[1]/span[1]");
	By decreaseHrTime = By.xpath("//*[@class='rdtTime']//div[1]/span[2]");
	By request = By.xpath("//*[text()='Request']");
	
	public bookAviewing(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	public WebElement getsearchPreviousApplicant(){
		return driver.findElement(searchPreviousApplicant);
	}
	public WebElement getnext(){
		return driver.findElement(next);
	}
	public WebElement getapplicantFullName(){
		return driver.findElement(applicantFullName);
	}
	public WebElement getviewingDate(){
		return driver.findElement(viewingDate);
	}
	public WebElement getviewingDateNextMonth(){
		return driver.findElement(viewingDateNextMonth);
	}
	public WebElement getrandomDate(){
		return driver.findElement(randomDate);
	}
	public WebElement getviewingTime(){
		return driver.findElement(viewingTime);
	}
	public WebElement getincreaseHrTime(){
		return driver.findElement(increaseHrTime);
	}
	public WebElement getdecreaseHrTime(){
		return driver.findElement(decreaseHrTime);
	}
	public WebElement getrequest(){
		return driver.findElement(request);
	}

}
