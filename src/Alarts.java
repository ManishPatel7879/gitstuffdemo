import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alarts {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();

//		driver.findElement(By.id("name")).sendKeys("Manish");      //either we can enter name via this sendkeys method or we can store the value in string then we can use
//		driver.findElement(By.id("name")).clear();                 //to clear input field

//		Alert type 1 : where need to click on OK button , no other option

		String text = "Rahul";
		driver.findElement(By.id("name")).sendKeys(text);
		driver.findElement(By.id("alertbtn")).click();

		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept(); // Ok is positive in nature so accept as click on OK button // this method
											// will switch webdriver to alert understandable and accept that alert

//   Alert Type 2 : Where you can have OK and Cancel button to click 

		driver.findElement(By.id("name")).sendKeys("Manish");
		driver.findElement(By.id("confirmbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss(); // to click on cancel button
		driver.close();
        driver.quit();
    	driver.close();
    	driver.close();
    	driver.close();
        driver.quit();
        driver.quit();
	}

}
