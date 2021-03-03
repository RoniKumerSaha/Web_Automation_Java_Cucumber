package features.steps;


import cucumber.api.java.en.*;
import org.junit.Assert;
import pages.CategoryPage;
import pages.HomePage;

public class HomeStep {

    @Given("I go to the home page")
    public void iStartBrowser() {
        new HomePage();
    }

    @Then("I should see home page")
    public void i_should_see_home_page() {
        Assert.assertEquals("Automation Step by Step", new HomePage().getPageTitle());
    }

    @And("I select API category")
    public void iSelectACategory() {
        new HomePage().selectCategory();
    }

    @Then("^I should see the \"([^\"]*)\" category$")
    public void iShouldSeeTheCategory(String category){
        Assert.assertEquals(category,new CategoryPage().getCategory());
    }
}
