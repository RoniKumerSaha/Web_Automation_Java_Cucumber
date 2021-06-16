package features.steps;


import cucumber.api.java.en.*;
import pages.LoginPage;
import pages.NavBar;

public class LoginStep {

    @Given("^I am in the website$")
    public void iAmInTheWebsite() {
        (new LoginPage()).goToSite();
    }

    @When("^I try to log in using username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void iTryToLogInUsingUsernameAndPassword(String username, String password){
        (new NavBar()).navigateToLogIn();
        (new LoginPage()).login(username, password);
    }

    @Then("^I should be able to login successfully$")
    public void iShouldBeAbleToLoginSuccessfully() {
    }
}
