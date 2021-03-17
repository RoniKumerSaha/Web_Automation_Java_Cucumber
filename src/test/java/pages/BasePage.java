package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.logging.Level;

public class BasePage {

    public static WebDriver driver;

    public void setDriver() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/driver/chromedriver");

        // getting rid of the logging msg
        System.setProperty("webdriver.chrome.silentOutput", "true");
        java.util.logging.Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);

        ChromeOptions options = new ChromeOptions();
        options.setHeadless(true);
        driver = new ChromeDriver(options);
        driver.get("https://automationstepbystep.com/");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void closeBrowser() {
        if (driver != null)
            driver.quit();
    }
}
