package PHP;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Operations extends LaunchBrowser{

		  By MyAccountButton = By.xpath("//div[@class='dropdown dropdown-login dropdown-tab']//a[@id='dropdownCurrency']");
		  By SignUpButton = By.xpath("//a[@class='dropdown-item tr']");
		  By Firstname = By.xpath("//input[@placeholder='First Name']");
		  By Lastname = By.xpath("//input[@placeholder='Last Name']");
		  By MobileNumber = By.xpath("//input[@placeholder='Mobile Number']");
		  By EMailId = By.xpath("//input[@placeholder='Email']");
		  By Password = By.xpath("//input[@placeholder='Password']");
		  By ConformPassword = By.xpath("//input[@placeholder='Confirm Password']");
		  By SignUp = By.xpath("//button[@class='signupbtn btn_full btn btn-success btn-block btn-lg']");
		  Logger log = Logger.getLogger("Registration");
		  
		  
		  
		  public void SignUpPage() throws Exception 
		  {

			  PropertyConfigurator.configure("C:\\Users\\Online Test\\git\\PHPTravels\\MavenSelenium\\log4j.properties");
			  driver.findElement(MyAccountButton).click();
			  driver.findElement(SignUpButton).click();
			  driver.findElement(Firstname).sendKeys(prop.getProperty("Firstname"));
			  driver.findElement(Lastname).sendKeys(prop.getProperty("Lastname"));
			  driver.findElement(MobileNumber).sendKeys(prop.getProperty("MobileNumber"));
			  driver.findElement(EMailId).sendKeys(prop.getProperty("EMailId"));
			  driver.findElement(Password).sendKeys(prop.getProperty("Password"));
			  driver.findElement(ConformPassword).sendKeys(prop.getProperty("ConformPassword"));
			 // Thread.sleep(3000);
			  driver.findElement(SignUp).sendKeys(Keys.ENTER);
			  
			  
			 // String Validation = driver.findElement(By.xpath("//h3[@class='text-align-left']")).getText();
			 // System.out.println(Validation);
		      // if(Validation.equalsIgnoreCase(prop.getProperty("Registraion")))
		         {
		       //     System.out.println("PASS");
		           
		         }
		      //    else
		      //   {
		            //  System.out.println("FAIL");
		            
		          }
			// log.info("succesfully registered");
		  }
	
	
	
	
	
	
	
	
	

