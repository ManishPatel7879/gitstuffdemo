import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locator2 {

	public static void main(String[] args) throws InterruptedException {
		
		//Giving location of webdriver 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manish.Patel\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));       //implicit wait - to wait for 5sec . in seconds we are passing the values
		
		 // Singup page with wrong information 
		 Thread.sleep(2000);
		driver.get("https://rahulshettyacademy.com/locatorspractice/"); 
		
		 //Singup page with correct information 
		 
		driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys("Ansi ByteCode");
	    driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("rahulshettyacademy");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@id='chkboxOne']")).click();
	    driver.findElement(By.xpath("//input[@id='chkboxTwo']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[@type='submit']")).click();

	    // if there is only one tag name then there is multiple ways to write locators.
	   Thread.sleep(2000);
	
	    //Assetion to fatch welcome text
	    Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
	    
	     System.out.println(driver.findElement(By.tagName("p")).getText());
	     System.out.println("test Case pass without error");
	     
	     driver.close();
	    
	}

}
