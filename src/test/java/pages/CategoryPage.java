package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.support.PageFactory.initElements;

public class CategoryPage extends BasePage{
    @FindBy(xpath = "//h1[text()='API']")
    WebElement categoryName;

    public CategoryPage() {
        initElements(driver, this);
    }

    public String getCategory(){
        return  categoryName.getText();
    }
}
