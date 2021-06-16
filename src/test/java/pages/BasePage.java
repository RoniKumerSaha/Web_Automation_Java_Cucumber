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
        options.setHeadless(false);
        driver = new ChromeDriver(options);
    }

    public void goToSite(){
        driver.get("https://www.demoblaze.com/");
    }

    public void closeBrowser() {
        if (driver != null)
            driver.quit();
    }

    public String getAlertText(){
      return driver.switchTo().alert().getText();
    }

    public void waitFor(int second){
        try {
            Thread.sleep(second * (100 * 10));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
