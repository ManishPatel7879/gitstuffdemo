import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		
		//Giving location of webdriver 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manish.Patel\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));       //implicit wait - to wait for 5sec . in seconds we are passing the values
		
		 // Singup page with wrong information 
		 Thread.sleep(2000);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");         
		driver.findElement(By.id("inputUsername")).sendKeys("Rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("abc");
		Thread.sleep(5000);
		driver.findElement(By.className("signInBtn")).click();
	System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
	Thread.sleep(2000);
	driver.findElement(By.linkText("Forgot your password?")).click();
	    
	    //Forgot Password
	    
	    driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Ram");
	   driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("abs@gmail.com");
	   driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("7894561235");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
	   Thread.sleep(2000);
	   System.out.println(driver.findElement(By.xpath("//p[@class='infoMsg']")).getText());
	 driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();
	 
	 //Singup page with correct information 
	 
	driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys("Ansi ByteCode");
    driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("rahulshettyacademy");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@id='chkboxOne']")).click();
    driver.findElement(By.xpath("//input[@id='chkboxTwo']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//button[@type='submit']")).click();

    System.out.println(driver.findElement(By.xpath("/html/body/div/div/div/div/p")).getText());
	   
    Thread.sleep(2000);
    driver.findElement(By.xpath("//button[@class='logout-btn']")).click();

    System.out.println("You have successfully Loggedout.");

    Thread.sleep(2000);
    driver.close();
	    
		
	}

}
