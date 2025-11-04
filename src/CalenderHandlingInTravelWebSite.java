import java.sql.DriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalenderHandlingInTravelWebSite {

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();            //chrome driver manager setup now no need to downlaod chrome driver and give path , manager will handle
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manish.Patel\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");     //no need to give this path when use webdriver manager
		
		WebDriver driver = new ChromeDriver();                                      //Creating Webdriver Object
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");            //To enter Url
		driver.manage().window().maximize();                                        //To Maximaize the window
		
		
		    Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();                   //Click on Second way radio button
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_0']")).click();                   //click on one way radio button
			driver.findElement(By.name("ctl00$mainContent$chk_SeniorCitizenDiscount")).click();                      //click on senior citizen discount
			Thread.sleep(2000);
			
		
			driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();      //click on origin station dropdown
			driver.findElement(By.xpath("//a[@value='GWL']")).click();                                            //click on Gwalior from dropdown
			driver.findElement(By.xpath("//a[@value='BOM']")).click();                                            //click on bangluru departure station
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//a[contains(@class, 'ui-state-default') and contains(@class, 'ui-state-active')]")).click();
            driver.findElement(By.xpath("//div[@id='divpaxinfo']")).clear();
            driver.findElement(By.xpath("")).click();
            driver.findElement(By.xpath("//input[@id='btnclosepaxoption']")).click();
            Thread.sleep(2000);
            driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
         
         
		
			      
		
			
			
		
	}

}
