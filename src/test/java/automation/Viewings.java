package automation;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.bookAviewing;
import pageObject.loginPage;
import pageObject.salesInstructions;
import resources.base;

public class Viewings extends base{
	
	public static Logger log = LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException {
		driver=initializeDriver();
		log.info("Driver is initialized");
		driver.get(prop.getProperty("url"));
		loginPage l = new loginPage(driver);
		l.getLogInEmail().sendKeys(prop.getProperty("email"));
		l.getLoginPassword().sendKeys(prop.getProperty("password"));
		l.getLoginButton().click();
		}
	
	

	@Test(dataProvider= "getData")
	
	public void viewingFromTable(String applicant) throws InterruptedException {
		log.info("viewing from Table start");
		salesInstructions si = new salesInstructions(driver);
		Assert.assertTrue(si.getheading().isDisplayed());
		si.getsecondPropertyViewingFromTable().click();
		bookAviewing bv = new bookAviewing(driver);
		bv.getsearchPreviousApplicant().sendKeys(applicant);
		Thread.sleep(5000);
		bv.getsearchPreviousApplicant().sendKeys(Keys.RETURN);
		
		Thread.sleep(2000);
		bv.getnext().click();
		log.info("adding applicant");
		bv.getnext().click();
		bv.getviewingDate().click();
		bv.getviewingDateNextMonth().click();
		bv.getviewingDateNextMonth().click();
		bv.getviewingDateNextMonth().click();
		bv.getviewingDateNextMonth().click();
		
		bv.getrandomDate().click();
		log.info("date added");
		Thread.sleep(500);
		bv.getviewingTime().click();
		bv.getincreaseHrTime().click();
		bv.getincreaseHrTime().click();
		Thread.sleep(500);
		bv.getdecreaseHrTime().click();
		log.info("time added");
		bv.getrequest().click();
		log.info("viewing booked");
		Thread.sleep(5000);
	}
	@DataProvider
	public Object[] getData()
	{
		Object[][] data = new Object[1][1];
		data[0][0] = "Applicant test two";
		return data;
	}
	@AfterTest
	public void teardown() {
		driver.close();
	}
}
