import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class FlightBookingAutoSuggestiveDropDown {
         public static void main(String[] args) throws InterruptedException {
          WebDriverManager.chromedriver().setup();
          WebDriver driver =new ChromeDriver();

         driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
         driver.findElement(By.id("autosuggest")).sendKeys("ind");                                                //first we are entering value in input field like IND
         Thread.sleep(3000);
          List<WebElement> options =driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));            //Storing all possible result into a variable 

for(WebElement option :options)                                                                                 //Run a loop to pick one by one option 

{

if(option.getText().equalsIgnoreCase("India"))                                                                 //Match all option with required one. example we required india

{

option.click();

break;


}

}

















}



}

