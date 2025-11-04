import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;   // <-- Add this import

public class BrowserInvokeWithDriverManager {

    public static void main(String[] args) {

        // Setup Chrome Driver automatically
        WebDriverManager.chromedriver().setup();

        // Create ChromeDriver instance
        WebDriver driver = new ChromeDriver();

        // Open a website
        driver.get("https://www.google.com");

        // Print the page title
        System.out.println("Page title is: " + driver.getTitle());

        // Close the browser
        driver.quit();
    }
}
