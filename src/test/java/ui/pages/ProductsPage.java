package ui.pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.support.PageFactory.initElements;

public class ProductsPage extends BasePage{
    @FindBy(xpath = "//h2")
    WebElement productName;

    @FindBy(xpath = "//h2[contains(text(),'Thank you for your purchase!')]")
    WebElement confirmationMsg;

    @FindBy(id = "name")
    WebElement name;

    @FindBy(id = "country")
    WebElement country;

    @FindBy(id = "city")
    WebElement city;

    @FindBy(id = "card")
    WebElement card;

    @FindBy(id = "month")
    WebElement month;

    @FindBy(id = "year")
    WebElement year;

    @FindBy(xpath = "//a[contains(text(),'Add to cart')]")
    WebElement addToCartBtn;

    @FindBy(xpath = "//button[contains(text(),'Place Order')]")
    WebElement placeOrderBtn;

    @FindBy(xpath = "//button[contains(text(),'Purchase')]")
    WebElement purchaseBtn;

    public ProductsPage(){
        initElements(driver, this);
    }

    public void clickType(String typeName){
        driver.findElement(By.xpath("//a[contains(text(),'" + typeName + "')]")).click();
        waitFor( 4);
    }

    public void clickProduct(String productName){
        driver.findElement(By.xpath("//a[contains(text(),'" + productName + "')]")).click();
        waitFor( 4);
    }

    public String getProductName(){
        return this.productName.getText();
    }

    public void addProductToCart(){
        this.addToCartBtn.click();
        dismissAlert();
    }

    public void orderProduct(){
        this.placeOrderBtn.click();
        Faker faker = new Faker();
        waitFor(1);
        this.name.sendKeys(faker.name().firstName());
        this.city.sendKeys(faker.address().city());
        this.country.sendKeys(faker.address().country());
        this.month.sendKeys("April");
        this.card.sendKeys("1234566789");
        this.year.sendKeys("1234");
        this.purchaseBtn.click();
        waitFor(2);
    }

    public boolean verifyOrderConfirmation(){
        return this.confirmationMsg.isDisplayed();
    }

}
