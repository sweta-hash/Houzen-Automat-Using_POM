package automation;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.bookAviewing;
import pageObject.leftSideBar;
import pageObject.loginPage;
import pageObject.portfolioLettings;
import pageObject.salesInstructions;
import pageObject.tradeProperty;
import pageObject.uploadPropety;
import resources.base;

public class addProperty extends base{
	
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
	
	

	@Test()
	
	public void addPropertyPlus() throws InterruptedException, IOException {
		log.info("Started adding property");
		portfolioLettings pl= new portfolioLettings(driver);
		
		leftSideBar lsb = new leftSideBar(driver);
		lsb.getyourPortfolio().click();
		lsb.getportfolioLettings().click();
		Thread.sleep(5000);
		
		pl.getplusSignToAddProperty().click();
		uploadPropety up= new uploadPropety(driver);
		up.getselectListingType().click();
		up.getselectListingTypeRent().click();
		up.getincreaseNumberOfUnits().click();
		up.getincreaseNumberOfUnits().click();
		
		up.getaddress().sendKeys("7a, I Block Road, Block I, Lajpat Nagar I, Lajpat Nagar, New Delhi, Delhi, India");
		
		up.getaddress().sendKeys(Keys.ARROW_DOWN);
		up.getaddress().sendKeys(Keys.ENTER);
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='110024']")));
		Thread.sleep(5000);
		up.getnext().click();
		up.getavailableDate().click();
		up.getincreaseAvailableDate().click();
		up.getincreaseAvailableDate().click();
		up.getselectDate().click();
		up.getaddNoOfBathrooms().click();;
		up.getaddNoOfFloors().click();
		up.getaddNoOfBedrooms().click();
		up.getselectAmenities().click();
		up.getfurnishedAmenities().click();
		up.getyogaRoomAmenities().sendKeys(Keys.ESCAPE);
		up.getprice().sendKeys("1111");
		up.getrentalFrquency().click();
		up.getrentalFrquencyPerMonth().click();
		up.getselectPropertyType().click();
		up.getselectPropertyTypeTerraced().click();
		up.getdescription().sendKeys("This is first unit of the property. This is a rented property, 1BHK terraced furnished flat. This is first unit of the property. This is a rented property, 1BHK terraced furnished flat");
		up.getinsertImages().click();
		Thread.sleep(5000);
		Runtime.getRuntime().exec("E:\\imageUpload.exe");
		Thread.sleep(5000);
		up.getinsertFloorPlan().click();
		Thread.sleep(5000);
		Runtime.getRuntime().exec("E:\\floorPlanUpload.exe");
		Thread.sleep(5000);
		up.getduplicate().click();
		up.getupload().click();
		Thread.sleep(15000);
		up.getok().click();
		Thread.sleep(2000);
		lsb.getyourPortfolio().click();
		lsb.getportfolioLettings().click();
		Thread.sleep(9000);
		pl.getareaCode().click();
		pl.getclearAreaCode().click();
		Thread.sleep(5000);
		pl.getcountryUK().sendKeys(Keys.chord(Keys.CONTROL, "a"));
		pl.getcountryUK().sendKeys("india");
		Thread.sleep(2000);
		pl.getcountryUK().sendKeys(Keys.ARROW_DOWN);
		pl.getcountryUK().sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		pl.getfirstCheckBox().click();
		pl.getsecondCheckBox().click();
		pl.gettrade().click();
		Thread.sleep(2000);
		tradeProperty tp = new tradeProperty(driver);
		tp.getdefaultCheckBox().click();
		tp.getcommission().sendKeys("2");
		tp.getincentive().sendKeys("2222");
		tp.getsubmit().click();
		tp.getok().click();
		Thread.sleep(3000);
		pl.getwithdrawFirstProperty().click();
		pl.getconfirm().click();
		pl.getok().click();
		Thread.sleep(3000);
		pl.getwithdrawFirstProperty().click();
		pl.getconfirm().click();
		pl.getok().click();
		
		
		
	}
	
	
}
