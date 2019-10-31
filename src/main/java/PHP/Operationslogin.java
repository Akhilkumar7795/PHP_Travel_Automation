package PHP;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;

public class Operationslogin extends LaunchBrowser{

	By MyAccountButton = By.xpath("//div[@class='dropdown dropdown-login dropdown-tab']//a[@id='dropdownCurrency']");
	By LoginButton = By.xpath("//a[@class='dropdown-item active tr']");
    By EMailId = By.xpath("//input[@placeholder='Email']");
	By Password = By.xpath("//input[@placeholder='Password']");
	By Login = By.xpath("//button[@class='btn btn-primary btn-lg btn-block loginbtn']");
	Logger log = Logger.getLogger("Login");
	
	 public void Loginpage() throws Exception 
	  {
		 PropertyConfigurator.configure("C:\\Users\\Online Test\\git\\PHPTravels\\MavenSelenium\\log4j.properties");
		  driver.findElement(MyAccountButton).click();
		  driver.findElement(LoginButton).click();
		  driver.findElement(EMailId).sendKeys(prop.getProperty("EMailId"));
		  driver.findElement(Password).sendKeys(prop.getProperty("Password"));
		  driver.findElement(Login).click();
		  log.info("succesfully login");
	
}}
