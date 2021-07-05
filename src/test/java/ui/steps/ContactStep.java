package ui.steps;

import cucumber.api.java.en.*;
import org.junit.Assert;
import ui.pages.ContactPage;
import ui.pages.NavBar;

public class ContactStep {

    @And("^I go to the Contact page$")
    public void iGoToTheContactPage() {
        new NavBar().navigateToContact();
    }

    @When("^I fill up the form and submit the message$")
    public void iFillUpTheFormAndSubmitTheMessage() {
        new ContactPage().fillUpFeedBackForm();
    }

    @Then("^I should be submitted successfully$")
    public void iShouldBeSubmittedSuccessfully() {
        Assert.assertTrue((new ContactPage().getAlertText().contains("Thanks for the message")));
    }
}
