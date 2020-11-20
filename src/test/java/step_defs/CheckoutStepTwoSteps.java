package step_defs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.CheckoutStepTwoPage;

public class CheckoutStepTwoSteps {
    WebDriver driver = step_defs.LoginSteps.driver;
    CheckoutStepTwoPage checkoutStepTwoPage=new CheckoutStepTwoPage(driver);


    @Then("user should see the checkout overview")
    public void userShouldSeeTheCheckoutOverview() {
        Assert.assertTrue(checkoutStepTwoPage.checkoutOverview());
    }

    @And("user clicks on the  finish button")
    public void userClicksOnTheFinishButton() {
        checkoutStepTwoPage.finishButton();
    }


    @And("the description should be visible")
    public void theDescriptionShouldBeVisible() {
Assert.assertTrue(checkoutStepTwoPage.description());
    }

    @Then("user should land ine the checkout complete page")
    public void userShouldLandIneTheCheckoutCompletePage() {
        Assert.assertTrue(checkoutStepTwoPage.checkoutCompletePage());
    }

    @And("user clicks on a product linka")
    public void userClicksOnAProductLinka() {

    }
}
