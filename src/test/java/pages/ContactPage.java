package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.support.PageFactory.initElements;

public class ContactPage extends BasePage{
    @FindBy(id = "recipient-email")
    WebElement email;

    @FindBy(id = "recipient-name")
    WebElement name;

    @FindBy(id = "message-text")
    WebElement message;

    @FindBy(xpath = "//button[contains(text(),'Send message')]")
    WebElement submit;

    public ContactPage(){
        initElements(driver, this);
    }

    public void fillUpFeedBackForm(){
        Faker faker = new Faker();
        this.email.sendKeys(faker.internet().emailAddress());
        this.name.sendKeys(faker.name().firstName());
        this.message.sendKeys(faker.lorem().sentence());
        this.submit.click();
        waitFor(3);
    }
}
