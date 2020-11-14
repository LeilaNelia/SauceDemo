package step_defs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.CartPage;
import pages.InventoryPage;

public class CartSteps {
    WebDriver driver = step_defs.LoginSteps.driver;
    CartPage cartPage = new CartPage(driver);
    
    
    @And("user should be able to add a product to the cart")
    public void userShouldBeAbleToAddAProductToTheCart(){
        cartPage.addAProductToCart();
    }

    @Then("user should see the remove button")
    public void userShouldSeeTheRemoveButton() {
        Assert.assertTrue(cartPage.removeButton());
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
}


