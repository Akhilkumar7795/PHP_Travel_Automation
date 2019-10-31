package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {
	public WebDriver driver;
	public Properties prop;
	public WebDriver initializerDriver() throws Exception {
		
 prop = new Properties();
FileInputStream fis = new FileInputStream("C:\\New folder\\MavenSelenium\\src\\main\\java\\resources\\data.properties");
prop.load(fis);
String browsername= prop.getProperty("browser");
if(browsername.equals("chrome")) { 
	System.setProperty("webdriver.chrome.driver","C:\\chromedrivr\\chromedriver.exe");
	driver = new ChromeDriver();
}
else if(browsername.equals("firefox")) {
	System.setProperty("webdriver.gecko.driver","C:\\geckodriver\\geckodriver.exe");
	driver = new FirefoxDriver();
}
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
return driver;
	
	
	
	
	
	
	
	}}
