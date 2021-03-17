package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.logging.Level;

public class BasePage {

    public static WebDriver driver;

    public void setDriver() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/driver/chromedriver");

        // getting rid of the logging msg
        System.setProperty("webdriver.chrome.silentOutput", "true");
        java.util.logging.Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);

        driver = new ChromeDriver();
        driver.get("https://automationstepbystep.com/");
    }

    public void closeBrowser() {
        if (driver != null)
            driver.quit();
    }
}
