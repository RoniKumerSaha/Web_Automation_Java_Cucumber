package ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.support.PageFactory.initElements;

public class LoginPage extends BasePage {
    @FindBy(id = "loginusername")
    WebElement usernameField;

    @FindBy(id = "loginpassword")
    WebElement passwordField;

    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement submitBtn;

    public LoginPage() {
        initElements(driver, this);
    }

    public void login(String user, String pass){
        this.usernameField.sendKeys(user);
        this.passwordField.sendKeys(pass);
        this.submitBtn.click();
        waitFor(5);
    }
}
