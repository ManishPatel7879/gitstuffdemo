import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2AllUIThings {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		
		
		//there are three method also how to write css selector and xpath . any method you can use
		
		driver.findElement(By.cssSelector("input.form-control")).sendKeys("Manish Kumar Patel");
		
//		driver.findElement(By.xpath("//input[contains(@class, 'form-control')]")).sendKeys("Manish Kumar Patel");
		
//		driver.findElement(By.cssSelector("input.form-control.ng-pristine.ng-invalid.ng-touched")).sendKeys("Manish Kumar Patel");

		driver.findElement(By.xpath("(//input[contains(@class, 'form-control')])[2]")).sendKeys("Ram@gmail.com");

//		driver.findElement(By.xpath("(//input [contains (@class, 'form-control')])[3]")).sendKeys("Test@123");
  	    driver.findElement(By.id("exampleInputPassword1")).sendKeys("Test@123");
		
       driver.findElement(By.id("exampleCheck1")).click();
       driver.findElement(By.id("exampleFormControlSelect1")).click();
       
       driver.findElement(By.xpath("//*[@id=\"exampleFormControlSelect1\"]/option[1]")).click();     
       driver.findElement(By.xpath("//input[@id='inlineRadio1']")).click();
		driver.findElement(By.xpath("/html/body/app-root/form-comp/div/form/div[7]/input")).sendKeys("25/10/2030");
	}

}
