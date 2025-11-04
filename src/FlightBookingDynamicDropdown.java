import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlightBookingDynamicDropdown {

	public static void main(String[] args) throws InterruptedException {


	 WebDriverManager.chromedriver().setup();
	 WebDriver driver = new ChromeDriver();
	 
	 driver.manage().window().maximize();
	 driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	 
	 //Dynamic DropDown for Departure City and Arrival City

	 driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
	 Thread.sleep(2000);	
	 driver.findElement(By.xpath("//a[@value='BHO']")).click();                                     
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("(//a[@value='DEL'])[2]")).click();
	 
	  
	 
//	 //Another way if donot want to use indexs then use xpath travers from parent to child : parent xpath then single space then child xpath
//	 
//	 driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")).click();



		Thread.sleep(2000);
		driver.close();
		
	}

}
