package stepDefinitions;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.OnlineBanking;

public class ForeignCurrencyPurchase {

    OnlineBanking onlineBanking = new OnlineBanking();

    @When("User clicks on the Online Banking section")
    public void userClicksOnTheOnlineBankingSection() {
        onlineBanking.myClick(onlineBanking.onlineBanking);
    }

    @And("User clicks on Pay Bills")
    public void userClicksOnPayBills() {
        onlineBanking.myClick(onlineBanking.payBills);
    }

    @And("User clicks on Purchase Foreign Currency")
    public void userClicksOnPurchaseForeignCurrency() {
        onlineBanking.myClick(onlineBanking.purchaseForeignCurrency);
    }

    @And("User selects currency as {string}")
    public void userSelectsCurrencyAs(String currency) {
        onlineBanking.wait.until(ExpectedConditions.elementToBeClickable(onlineBanking.currencySelect));
        Select select = new Select(onlineBanking.currencySelect);
        select.selectByValue(currency);
    }

    @And("User enters amount as {string}")
    public void userEntersAmountAs(String amount) {
        onlineBanking.mySendKeys(onlineBanking.amount, amount);
    }

    @And("User clicks on U.S. dollar checkbox")
    public void userClicksOnUSDollarCheckbox() {
        onlineBanking.myClick(onlineBanking.dollarCheckbox);
    }

    @And("User clicks on Calculate Costs button")
    public void userClicksOnCalculateCostsButton() {
        onlineBanking.myClick(onlineBanking.calculateCostsButton);
    }

    @And("User clicks on Purchase")
    public void userClicksOnPurchase() {
        onlineBanking.myClick(onlineBanking.purchaseButton);
    }
}
