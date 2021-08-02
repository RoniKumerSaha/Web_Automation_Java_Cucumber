package ui.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import ui.util.MyWebdriverEventListener;

import java.util.logging.Level;

public class BasePage {

    public static WebDriver driver;
    public static Logger logger = LogManager.getLogger(BasePage.class);

    public void setDriver() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/driver/chromedriver");

        // getting rid of the logging msg
        System.setProperty("webdriver.chrome.silentOutput", "true");
        java.util.logging.Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);

        ChromeOptions options = new ChromeOptions();
        options.setHeadless(true);
        driver = new ChromeDriver(options);
        driver = setEventListener(driver);
        logger.info("Chrome driver Started");
    }

    public WebDriver setEventListener(WebDriver driver){
        EventFiringWebDriver eventFiringWebDriver = new EventFiringWebDriver(driver);
        MyWebdriverEventListener myWebdriverEventListener = new MyWebdriverEventListener();
        eventFiringWebDriver.register(myWebdriverEventListener);
        return eventFiringWebDriver;
    }

    public void goToSite(){
        driver.get("https://www.demoblaze.com/");
    }

    public void closeBrowser() {
        if (driver != null)
            driver.quit();
        logger.info("Chrome driver Stopped \n\n");
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

    public void dismissAlert(){
        waitFor(3);
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
}
