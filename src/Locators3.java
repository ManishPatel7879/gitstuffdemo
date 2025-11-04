import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manish.Patel\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Sibling - parent travel (parent to child travel to identify xpath)
		// for now traverse form child to parent
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//div/button[1]/following-sibling::button[1]")).click();
	System.out.println(driver.findElement(By.xpath("//div/button[1]/following-sibling::button[1]")).getText());
	
		
		
	}

}
