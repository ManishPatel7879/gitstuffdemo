import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;

public class CalenderHandleFlightBooking {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        Thread.sleep(2000);
        // Select today’s date
        driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
        driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-active']")).click();

        Thread.sleep(2000);
        // Check before enabling
        System.out.println("Before selecting Round Trip: " +
            driver.findElement(By.id("Div1")).getAttribute("style"));
        Thread.sleep(2000);
        
        // Select Round Trip
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
        Thread.sleep(2000);
        
        // Check after enabling
        String style = driver.findElement(By.id("Div1")).getAttribute("style");
        System.out.println("After selecting Round Trip: " + style);
        Thread.sleep(2000);

        if (style.contains("1")) {
            System.out.println("✅ Return date calendar is enabled");
            Assert.assertTrue(true);
        } else {
            System.out.println("❌ Return date calendar did NOT enable");
            Assert.fail("Return date calendar not enabled!");
        }

        Thread.sleep(5000);
        driver.quit();
    }
}
