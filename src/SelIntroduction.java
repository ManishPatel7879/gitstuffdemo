import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {

    public static void main(String[] args) {

        // Invoking Browser
        // Chrome - ChromeDriver class

        // 1️ Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Manish.Patel\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        // 2️ Create a new Chrome browser instance
        WebDriver driver = new ChromeDriver();

        
        //need to run on others browsers
        System.setProperty("webdriver.gecko.driver","C:\\Users\\Manish.Patel\\Downloads\\geckodriver-win64\\geckodriver.exe");
        WebDriver driver1 = new FirefoxDriver();
        
        System.setProperty("webdriver.edge.driver","C:\\Users\\Manish.Patel\\Downloads\\msedgedriver");
        WebDriver driver3 = new EdgeDriver();
        
        
        // 3️ Example: open a webpage
        driver.get("https://www.google.com");

        // 4️ Print the page title
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        // 5️ Close the browser
        driver.quit();
    }
}
