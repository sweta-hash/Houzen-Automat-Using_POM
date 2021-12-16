package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class base{
	
	public WebDriver driver;
	public Properties prop;
public WebDriver initializeDriver() throws IOException {
	prop = new Properties();
	FileInputStream fils = new FileInputStream("src\\main\\java\\resources\\data.properties");
	prop.load(fils);
	String browserName = prop.getProperty("browser");
	if (browserName.equals("sauce"))
	{
		MutableCapabilities sauceOptions = new MutableCapabilities();
		sauceOptions.setCapability("screenResolution", "1920x1080");

		ChromeOptions browserOptions = new ChromeOptions();
		browserOptions.setExperimentalOption("w3c", true);
		browserOptions.setCapability("platformName", "Windows 10");
		browserOptions.setCapability("browserVersion", "75.0");
		browserOptions.setCapability("sauce:options", sauceOptions);
		
		driver = new RemoteWebDriver(new URL("https://suketsuman:9ad65447-0562-4b5e-a704-eaab9b40dff3@ondemand.us-west-1.saucelabs.com:443/wd/hub"), browserOptions);
	driver.manage().window().maximize();
}else if (browserName.equals("chrome")) {
	System.out.println(System.getProperty("user.dir"));
	System.setProperty("webdriver.chrome.driver","chromedriver93mac/chromedriver");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
}else if(browserName.equals("IE")) {
	driver = new InternetExplorerDriver();
}
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
return driver;
}
public String getScreenShotPath(String testCaseName,WebDriver driver) throws IOException {
	TakesScreenshot ts=(TakesScreenshot) driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	String destination = System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
	FileUtils.copyFile(source,new File(destination));
	return destination;
}
}
