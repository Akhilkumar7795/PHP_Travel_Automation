package PHP;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;


public class operationstour extends LaunchBrowser{

    
        static By Tour=By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div/div/div/div/div/nav/ul/li[3]/a");
        static By Tour_Search=By.xpath("//span[contains(text(),'Search by Listing or City Name')]");
        static By Select_City=By.xpath("//div[contains(text(),'Hurghada Sunset Desert Safari')]");
        static By Tour_Type=By.xpath("//span[contains(text(),'Select')]");
        static By Select_Type=By.xpath("//li[contains(text(),'Private')]");
        static By Check_In=By.xpath("//input[@id='DateTours']");
        static By Date=By.xpath("//div[6]//div[1]//div[1]//div[2]//div[18]");
        static By Next=By.xpath("//body[@class='with-waypoint-sticky']/div[@id='datepickers-container']/div[6]/nav[1]/div[3]/*[1]");
    
        static By Adults=By.xpath("//div[contains(@class,'col-md-12')]//button[contains(@class,'btn btn-white bootstrap-touchspin-up')][contains(text(),'+')]");
        static By Search_Button=By.xpath("//div[contains(@class,'ftab-inner menu-horizontal-content')]//button[contains(@class,'btn btn-primary btn-block')][contains(text(),'Search')]");
        static Logger log = Logger.getLogger("Tour");
    
        public static void TourPage() throws Exception
     {
            PropertyConfigurator.configure("C:\\\\Users\\\\Online Test\\\\git\\\\PHPTravels\\\\MavenSelenium\\\\log4j.properties");
            Thread.sleep(2000);
            driver.findElement(Tour).click();
            driver.findElement(Tour_Search).click();
            driver.findElement(Select_City).click();
            driver.findElement(Tour_Type).click();
            driver.findElement(Select_Type).click();
            driver.findElement(By.xpath("//input[@id='DateTours']")).click();
            driver.findElement(By.xpath("//div[6]//nav[1]//div[2]")).click();
           //driver.findElement(By.xpath("//div[contains(text(),'Nov')]")).click();
            driver.findElement(By.xpath("//div[contains(text(),'2019')]")).click();
           
	        driver.findElement(By.xpath("//div[6]//nav[1]//div[3]")).click();
	        driver.findElement(By.xpath("//div[@class='datepicker--cell datepicker--cell-year'][contains(text(),'"+prop.getProperty("year1")+"')]")).click();
	        driver.findElement(By.xpath("//div[contains(text(),'"+prop.getProperty("Month1")+"')]")).click();
            
       
            for(int i = 1 ; i<=35 ; i++) 
            {            
                 String str1 = driver.findElement(By.xpath("//div[6]//div[1]//div[1]//div[2]//div["+i+"]")).getText();            
                 if(str1.equals("1")) 
                {                
                     for(int j = i ; j<=35 ; j++) 
                     {                    
                         str1 = driver.findElement(By.xpath("//div[6]//div[1]//div[1]//div[2]//div["+j+"]")).getText();                                        
                         if(str1.equals(prop.getProperty("Day"))) 
                         {                        
                             driver.findElement(By.xpath("//div[6]//div[1]//div[1]//div[2]//div["+j+"]")).click();                        
                             break;
                         }     
                     }
                 }
            }
          
                   
           driver.findElement(Adults).click();   
           driver.findElement(Search_Button).click(); 
           String Validation =  driver.findElement(By.xpath("//h2[@id='detail-content-sticky-nav-00']")).getText();
	       System.out.println(Validation);
	       if(Validation.equalsIgnoreCase(prop.getProperty("Tourname")))
	         {
	            System.out.println("PASS");
	           
	         }
	          else
	         {
	              System.out.println("FAIL");
	             
	          }
           log.info("TourSearch");
     }
}
