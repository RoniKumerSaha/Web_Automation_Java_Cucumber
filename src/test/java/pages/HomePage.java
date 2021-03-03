package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.support.PageFactory.initElements;

public class HomePage extends BasePage {

    @FindBy(xpath = "//a[@id='logo']")
    WebElement element1;

    @FindBy(linkText = "API")
    WebElement category;

    public HomePage() {
        initElements(driver, this);
    }

    public void selectCategory(){
        category.click();
    }

    public String getPageTitle() {
        return element1.getText();
    }
}
