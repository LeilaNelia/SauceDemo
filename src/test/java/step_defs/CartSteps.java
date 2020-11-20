package step_defs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.CartPage;


public class CartSteps {
    WebDriver driver = step_defs.LoginSteps.driver;
    CartPage cartPage = new CartPage(driver);



    @And("cart badge should be displayed")
    public void cartBadgeShouldBeDisplayed() {
        Assert.assertTrue(cartPage.cartBadge());
    }

    @Then("user should see the checkout button")
    public void userShouldSeeTheCheckoutButton() {
        Assert.assertTrue(cartPage.checkOutButton());
    }
    @And("user clicks on the continue shopping button")
    public void userClicksOnTheContinueShoppingButton() {
        cartPage.continueShopping();
    }


    @And("user navigates to the {string}")
    public void userNavigatesToThe(String Cart) {
        cartPage.CartContainer();
    }


    @Then("user should land in the inventory item page")
    public void userShouldLandInTheInventoryItemPage() {
        Assert.assertTrue(cartPage.inventoryItemPage());
    }

    @And("the remove button is working")
    public void theRemoveButtonIsWorking() {
        cartPage.removeButton();

    }

    @Then("user should land in the checkout step one page")
    public void userShouldLandInTheCheckoutStepOnePage() {
        Assert.assertTrue(cartPage.checkoutStepOnePage());
}

    @And("user clicks on the remove button")
    public void userClicksOnTheRemoveButton() {
    }
}


