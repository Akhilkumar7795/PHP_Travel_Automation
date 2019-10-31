package PHP;



import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import net.bytebuddy.implementation.FieldAccessor.PropertyConfigurable;



	public class LaunchBrowser {
		
		public static WebDriver driver;
		public static Properties prop=new Properties();
		Logger log = Logger.getLogger("LaunchBrowser");
	
		public void browser() throws Exception {
			
			
		    PropertyConfigurator.configure("C:\\Users\\Online Test\\git\\PHPTravels\\MavenSelenium\\log4j.properties");

			FileInputStream fis=new FileInputStream("C:\\Users\\Online Test\\git\\PHPTravels\\MavenSelenium\\src\\main\\java\\PHP\\data.properties");
			prop.load(fis);
		
			if(prop.getProperty("browser").equals("chrome")){
				System.setProperty("webdriver.chrome.driver", "C:\\chromedrivr\\chromedriver.exe");
		        driver = new ChromeDriver();
		        driver.manage().window().maximize();
		        driver.get(prop.getProperty("baseURL"));
			}
			log.info("succesfully launch");
			//else if(prop.getProperty("browser").equals("firefox")) {
				//System.setProperty("webdriver.firefox.driver","C:\\geckodriver\\geckodriver.exe");
				//driver=new FirefoxDriver();
		//	}
			//else
			//{
			//	driver=new InternetExplorerDriver();
		//	}
			
		//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     //  return driver;

			
			
		}

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

