package step_defs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.CheckoutPage;
import pages.InventoryPage;

public class CheckoutSteps {
    WebDriver driver = step_defs.LoginSteps.driver;
    CheckoutPage checkoutPage = new CheckoutPage(driver);


    @And("user should click on the checkout button")
    public void userShouldClickOnTheCheckoutButton() {
        checkoutPage.checkOut();
    }

    @Then("user should see the checkout information page")
    public void userShouldSeeTheCheckoutInformationPage() {
        Assert.assertTrue(checkoutPage.checkOutInformationPage());
    }

    @And("user Enter {string}, {string},{string}")
    public void userEnter(String name, String surname, String code) {
        checkoutPage.firstName(name);
        checkoutPage.lastName(surname);
        checkoutPage.zipCode(code);

    }

    @Then("user should click on the continue button")
    public void userShouldClickOnTheContinueButton() {
        checkoutPage.continueButton();
    }

    @Then("user should see the checkout overview")
    public void userShouldSeeTheCheckoutOverview() {
        Assert.assertTrue(checkoutPage.checkoutOverview());
    }

    @And("user clicks on the  finish button")
    public void userClicksOnTheFinishButton() {
        checkoutPage.finishButton();
    }

    @Then("user should see the thank you message")
    public void userShouldSeeTheThankYouMessage() {
        Assert.assertTrue(checkoutPage.thankYouMsg());

    }
}