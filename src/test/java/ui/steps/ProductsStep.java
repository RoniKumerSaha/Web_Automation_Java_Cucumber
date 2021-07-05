package ui.steps;

import cucumber.api.java.en.*;
import org.junit.Assert;
import ui.pages.NavBar;
import ui.pages.ProductsPage;

public class ProductsStep {


    @When("^I click \"([^\"]*)\" named \"([^\"]*)\"$")
    public void iClickNamed(String type, String product){
        new ProductsPage().clickType(type);
        new ProductsPage().clickProduct(product);
    }

    @Then("^I should see details of \"([^\"]*)\"$")
    public void iShouldSeeDetailsOf(String product){
        Assert.assertTrue((new ProductsPage().getProductName().contains(product)));
    }

    @When("^I add product in the cart$")
    public void iAddProductInTheCart() {
        new ProductsPage().addProductToCart();
    }

    @And("^I place an order for the product$")
    public void iPlaceAnOrderForTheProduct() {
        new NavBar().navigateToCart();
        new ProductsPage().orderProduct();
    }

    @Then("^I should see the order is completed$")
    public void iShouldSeeTheOrderIsCompleted() {
        Assert.assertTrue(new ProductsPage().verifyOrderConfirmation());
    }
}
