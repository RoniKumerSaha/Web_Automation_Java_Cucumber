package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.support.PageFactory.initElements;

public class NavBar extends BasePage{
    @FindBy(xpath = "//a[contains(text(),'Contact')]")
    WebElement contactBtn;

    @FindBy(xpath = "//a[contains(text(),'Log in')]")
    WebElement loginBtn;


    public NavBar() {
        initElements(driver, this);
    }

    public void navigateToLogIn(){
        this.loginBtn.click();
        waitFor(3);
    }

}
