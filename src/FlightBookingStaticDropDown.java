
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlightBookingStaticDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();                                //WebDrivermanager handle everything no need to download driver and path of driver
		WebDriver driver = new ChromeDriver();    
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//DropDown with select tag - Static (when dropdown have select tag as parent tag then only this work) 
		//for currency dropdown
		
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByIndex(3);
		 Thread.sleep(2000);
		 
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("AED");
		 Thread.sleep(2000);
		 
		System.out.println(dropdown.getFirstSelectedOption().getText());
	    dropdown.selectByValue("INR");
	    Thread.sleep(2000);
	    
	    System.out.println(dropdown.getFirstSelectedOption().getText());
	
	    
	    //For Passengers dropdown
	    
	    driver.findElement(By.id("divpaxinfo")).click();
       Thread.sleep(2000);
       System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
      
       
       int i=1;
        while(i<5)
   	    
       {
        	driver.findElement(By.id("hrefIncAdt")).click();
    	   i++;
       }
	    
        
        
////we can use for loop also	  
//       
//        for (int i = 1; i<5; i++)
//        {
//        	 driver.findElement(By.id("hrefIncAdt")).click();   //click + button 4 times
//        }
//	    
        
        driver.findElement(By.id("btnclosepaxoption"));         //click on done button
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	    
	    
	    
	    
	    
	    
	    
	    
	     Thread.sleep(2000);
	    driver.close();
	}
	

}
