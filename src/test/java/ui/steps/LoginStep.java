package ui.steps;


import cucumber.api.java.en.*;
import org.junit.Assert;
import ui.pages.LoginPage;
import ui.pages.NavBar;

public class LoginStep {

    @Given("^I am in the website$")
    public void iAmInTheWebsite() {
        (new LoginPage()).goToSite();
    }

    @When("^I log in using username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void iTryToLogInUsingUsernameAndPassword(String username, String password){
        (new NavBar()).navigateToLogIn();
        (new LoginPage()).login(username, password);
    }

    @Then("^I should be able to login successfully and see username \"([^\"]*)\"$")
    public void iShouldBeAbleToLoginSuccessfullyAndSeeUsername(String username){
        Assert.assertTrue(new NavBar().getUserName().contains(username));
    }
}
