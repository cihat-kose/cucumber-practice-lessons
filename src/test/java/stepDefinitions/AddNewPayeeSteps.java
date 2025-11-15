package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import pages.OnlineBanking;

import java.util.ArrayList;
import java.util.List;

public class AddNewPayeeSteps {

    OnlineBanking onlineBanking = new OnlineBanking();

    @When("Click on the element in OnlineBanking")
    public void clickOnTheElementInOnlineBanking(DataTable links)  {

        List<String> linksList = links.asList();

        for (int i = 0; i < linksList.size(); i++) {
            WebElement element = onlineBanking.getWebElement(linksList.get(i));
            onlineBanking.myClick(element);
        }
    }

    @And("User sending name, address, account and details in OnlineBanking")
    public void userSendingNameAddressAccountAndDetailsInOnlineBanking(DataTable dataTable) {

        List<List<String>> items = dataTable.asLists();

        for (int i = 0; i < items.size(); i++) {
            WebElement element = onlineBanking.getWebElement(items.get(i).get(0));
            onlineBanking.mySendKeys(element, items.get(i).get(1));
        }
    }

    @When("Click to add button")
    public void clickToAddButton() {
        onlineBanking.myClick(onlineBanking.addButton);
    }

    @Then("Verify that the transaction was successful")
    public void verifyThatTheTransactionWasSuccessful() {
        onlineBanking.verifyContainsText(onlineBanking.successMessage, "success");
    }
}
