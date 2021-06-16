package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.support.PageFactory.initElements;

public class NavBar extends BasePage{
    @FindBy(xpath = "//a[contains(text(),'Contact')]")
    WebElement contactBtn;

    @FindBy(xpath = "//a[contains(text(),'Log in')]")
    WebElement loginBtn;

    @FindBy( id = "nameofuser")
    WebElement profileName;

    @FindBy(xpath = "//a[contains(text(),'Cart')]")
    WebElement cart;


    public NavBar() {
        initElements(driver, this);
    }

    public String getUserName(){
        return this.profileName.getText();
    }

    public void navigateToLogIn(){
        this.loginBtn.click();
        waitFor(3);
    }

    public void navigateToContact(){
        this.contactBtn.click();
        waitFor(3);
    }

    public void navigateToCart(){
        this.cart.click();
        waitFor(5);
    }

}
