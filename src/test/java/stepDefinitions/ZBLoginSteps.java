package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.ZBLogin;
import utilities.GWD;

public class ZBLoginSteps {
    ZBLogin zblogin = new ZBLogin();

    @Given("Navigate to website")
    public void navigateToWebsite() {
        GWD.getDriver().get("http://zero.webappsecurity.com/login.html");
    }

    @And("Enter username that as {string} and password that as {string}")
    public void enterUsernameThatAsAndPasswordThatAs(String username, String password) {
        zblogin.mySendKeys(zblogin.username, username);
        zblogin.mySendKeys(zblogin.password, password);
    }

    @When("Click login button")
    public void clickLoginButton() {
        zblogin.myClick(zblogin.signInButton);
        GWD.getDriver().navigate().back();
    }

    @Then("Verify that user logged in")
    public void verifyThatUserLoggedIn() {
        Assert.assertTrue(zblogin.userIcon.isEnabled());
    }
}
