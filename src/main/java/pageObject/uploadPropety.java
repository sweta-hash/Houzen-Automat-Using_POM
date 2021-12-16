package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class uploadPropety {
	public WebDriver driver;
	By selectListingType = By.xpath("//*[text()='Select Listing Type']");
	By selectListingTypeRent = By.xpath("//*[text()='Rent']");
	By selectPropertyType = By.xpath("//*[text()='Select Property Type']");
	By selectPropertyTypeTerraced = By.xpath("//*[text()='Terraced']");
	By address = By.xpath("//*[@placeholder ='Address']");
	By description = By.xpath("//*[@placeholder ='Description']");
	By next = By.xpath("//*[text()='Next']");
	By addNoOfBathrooms = By.xpath("//*[text()='No. of Bathrooms']/parent::div//*[@tabindex=\"0\"]");
	By addNoOfFloors = By.xpath("//*[text()='Floor Numbers']/parent::div//*[@tabindex=\"0\"]");
	By addNoOfBedrooms = By.xpath("//*[text()='No. of Bedrooms']/parent::div//*[@tabindex=\"0\"]");
	By increaseNumberOfUnits = By.xpath("/html/body/div[3]/div[3]/div/div[1]/div[3]/div/div[2]/div/div/div[1]/div[2]/div/div/button[2]");
	By availableDate = By.xpath("/html/body/div[3]/div[3]/div/div[1]/div[3]/div/div[2]/div/div/div[2]/div/div[1]/div/div[1]/div[2]/div/div[1]/div/div/input");
	By increaseAvailableDate = By.xpath("/html/body/div[3]/div[3]/div/div[1]/div[3]/div/div[2]/div/div/div[2]/div/div[1]/div/div[1]/div[2]/div/div[2]/div/div/table/thead/tr[1]/th[3]/span");
	By selectDate = By.xpath("/html/body/div[3]/div[3]/div/div[1]/div[3]/div/div[2]/div/div/div[2]/div/div[1]/div/div[1]/div[2]/div/div[2]/div/div/table/tbody/tr[3]/td[4]");
	By selectAmenities = By.xpath("//*[text()='Select Amenities']");
	By furnishedAmenities = By.xpath("//*[text()='Furnished']");
	By yogaRoomAmenities = By.xpath("//*[text()='Yoga Room']");
	By price = By.xpath("//*[@placeholder=\"Rent\"]");
	By unit1 = By.xpath("//*[@role ='tablist' and @class='MuiTabs-flexContainer']//*[text()='Unit 1']");
	By rentalFrquency = By.xpath("//*[text()='Rental Frequency']");
	By rentalFrquencyPerMonth = By.xpath("//*[text()='Per month']");
	By insertImages = By.xpath("//*[text()='Attach Images']");
	By insertFloorPlan = By.xpath("//*[text()='Attach Floorplans']");
	By duplicate = By.xpath("//*[contains(@class,'jss512')]");
	By upload = By.xpath("//*[text()='Upload']");
	By ok = By.xpath("//*[text()='OK']");
	public uploadPropety(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	public WebElement getselectListingType() {
		
		return driver.findElement(selectListingType);
	}
	public WebElement getselectListingTypeRent() {
		
		return driver.findElement(selectListingTypeRent);
	}
	public WebElement getselectPropertyType() {
		
		return driver.findElement(selectPropertyType);
	}
	public WebElement getselectPropertyTypeTerraced() {
		
		return driver.findElement(selectPropertyTypeTerraced);
	}
	public WebElement getaddress() {
		
		return driver.findElement(address);
	}
	public WebElement getdescription() {
		
		return driver.findElement(description);
	}
	public WebElement getnext() {
		
		return driver.findElement(next);
	}
	public WebElement getaddNoOfBathrooms() {
		
		return driver.findElement(addNoOfBathrooms);
	}
	public WebElement getaddNoOfFloors() {
		
		return driver.findElement(addNoOfFloors);
	}
	public WebElement getaddNoOfBedrooms() {
		
		return driver.findElement(addNoOfBedrooms);
	}
	public WebElement getincreaseNumberOfUnits() {
		
		return driver.findElement(increaseNumberOfUnits);
	}
	public WebElement getavailableDate() {
		
		return driver.findElement(availableDate);
	}
	public WebElement getincreaseAvailableDate() {
		
		return driver.findElement(increaseAvailableDate);
	}
	public WebElement getselectDate() {
	
	return driver.findElement(selectDate);
	}
	public WebElement getselectAmenities() {
		
		return driver.findElement(selectAmenities);
	}
	public WebElement getfurnishedAmenities() {
		
		return driver.findElement(furnishedAmenities);
	}
	public WebElement getyogaRoomAmenities() {
		
		return driver.findElement(yogaRoomAmenities);
	}
	public WebElement getprice() {
		
		return driver.findElement(price);
	}
	public WebElement getunit1() {
		
		return driver.findElement(unit1);
	}
	public WebElement getrentalFrquency() {
		
		return driver.findElement(rentalFrquency);
	}
	public WebElement getrentalFrquencyPerMonth() {
		
		return driver.findElement(rentalFrquencyPerMonth);
	}
	public WebElement getinsertImages() {
		
		return driver.findElement(insertImages);
	}
	public WebElement getinsertFloorPlan() {
		
		return driver.findElement(insertFloorPlan);
	}
	public WebElement getduplicate() {
		
		return driver.findElement(duplicate);
	}
	public WebElement getupload() {
		
		return driver.findElement(upload);
	}
	public WebElement getok() {
		
		return driver.findElement(ok);
	}
	

}
