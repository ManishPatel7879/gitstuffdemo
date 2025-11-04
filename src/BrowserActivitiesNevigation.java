import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserActivitiesNevigation {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.driver.chromedriver","C:\\Users\\Manish.Patel\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver");
		WebDriver driver = new ChromeDriver();
	
		driver.manage().window().maximize();                                                        //maximize the window
		driver.get("https://www.google.com");                                                       //enter url 
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");                 //navigating to another url : https://rahulshettyacademy.com/AutomationPractice/
		driver.navigate().back();                                                                   //again navigating to google.com
		driver.navigate().forward();                                                                //again come to url : https://rahulshettyacademy.com/AutomationPractice/
		
		driver.close();
		
	}

}
