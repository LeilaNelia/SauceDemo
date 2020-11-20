package step_defs;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.CheckoutCompletePage;

public class CheckoutCompleteSteps {
    WebDriver driver = step_defs.LoginSteps.driver;
    CheckoutCompletePage checkoutCompletePage = new CheckoutCompletePage(driver);

    @Then("user should see the thank you message")
    public void userShouldSeeTheThankYouMessage() {
        Assert.assertTrue(checkoutCompletePage.thankYouMsg());

    }
}
