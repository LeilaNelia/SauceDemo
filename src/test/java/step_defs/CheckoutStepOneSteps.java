package step_defs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.CheckoutStepOnePage;

public class CheckoutStepOneSteps {
    WebDriver driver = step_defs.LoginSteps.driver;
    CheckoutStepOnePage checkoutStepOnePage = new CheckoutStepOnePage(driver);

    @And("user clicks on the checkout button")
    public void userClicksOnTheCheckoutButton() {
        checkoutStepOnePage.checkOut();
    }

    @Then("user should see the checkout information page")
    public void userShouldSeeTheCheckoutInformationPage() {
        Assert.assertTrue(checkoutStepOnePage.checkOutInformationPage());
    }

    @And("user Enter {string}, {string},{string}")
    public void userEnter(String name, String surname, String code) {
        checkoutStepOnePage.firstName(name);
        checkoutStepOnePage.lastName(surname);
        checkoutStepOnePage.zipCode(code);

    }


    @And("the cancel button is working")
    public void theCancelButtonIsWorking() {
        checkoutStepOnePage.cancelButton();
    }

    @Then("user should lan in the cart page")
    public void userShouldLanInTheCartPage() {
Assert.assertTrue(checkoutStepOnePage.cartPage());
    }

    @And("user should land in checkout step two page")
    public void userShouldLandInCheckoutStepTwoPage() {
      Assert.assertTrue(checkoutStepOnePage.checkoutStepTwopage());

    }
    @Then("user should see the error message")
    public void userShouldSeeTheErrorMessage() {
        Assert.assertTrue(checkoutStepOnePage.errorMsg());
    }

    @And("user clicks on the continue button")
    public void userClicksOnTheContinueButton() {
        checkoutStepOnePage.continueButton();

    }
}

