package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ZBLogin;

public class ZBLoginSteps {
    ZBLogin zblogin = new ZBLogin();

    @Given("Navigate to website")
    public void navigateToWebsite() {
    }

    @And("Enter username that as {string} and password that as {string}")
    public void enterUsernameThatAsAndPasswordThatAs(String username, String password) {
    }

    @When("Click login button")
    public void clickLoginButton() {
    }

    @Then("Verify that iser logged in")
    public void verifyThatIserLoggedIn() {
    }
}
