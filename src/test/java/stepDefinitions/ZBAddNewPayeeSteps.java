package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import pages.ZBOnlineBanking;

import java.util.List;

public class ZBAddNewPayeeSteps {

    ZBOnlineBanking zbOnlineBanking = new ZBOnlineBanking();

    @When("Click on the element in OnlineBanking")
    public void clickOnTheElementInOnlineBanking(DataTable links) {
        List<String> linksList = links.asList(String.class);

        for (int i = 0; i < linksList.size(); i++) {
            WebElement element = zbOnlineBanking.getWebElement(linksList.get(i));
            zbOnlineBanking.myClick(element);
        }
    }

    @And("User sending name, address, account and details in OnlineBanking")
    public void userSendingNameAddressAccountAndDetailsInOnlineBanking(DataTable dataTable) {

        List<List<String>> items = dataTable.asLists(String.class);

        for (int i = 0; i < items.size(); i++) {
            WebElement element = zbOnlineBanking.getWebElement(items.get(i).get(0));
            zbOnlineBanking.mySendKeys(element, items.get(i).get(1));
        }
    }

    @When("Click to add button")
    public void clickToAddButton() {
        zbOnlineBanking.myClick(zbOnlineBanking.addButton);
    }

    @Then("Verify that the transaction was successful")
    public void verifyThatTheTransactionWasSuccessful() {
        zbOnlineBanking.verifyContainsText(zbOnlineBanking.successMessage, "was successfully created.");
    }
}
