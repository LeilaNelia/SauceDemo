package step_defs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.InventoryPage;

public class InventorySteps {

    WebDriver driver = step_defs.LoginSteps.driver;
    InventoryPage inventoryPage = new InventoryPage(driver);

    @Then("user should land on the Inventory page")
    public void userShouldLandOnThePage() {
        Assert.assertTrue(inventoryPage.CheckElementIsVisible());

    }

    @And("the navigation menu should be visible")
    public void theNavigationMenuShouldBeVisible() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(inventoryPage.checkMenuIsVisible());
    }

    @Then("user opens the menu")
    public void userOpensTheMenu() {
        inventoryPage.openMenu();
        Assert.assertTrue(inventoryPage.menuItems()==4);
    }

    @And("user navigates to {string}")
    public void userNavigatesTo(String link) {
        inventoryPage.navigatetoLink(link);
    }

    @Then("all the products should be available")
    public void allTheProductsShouldBeAvailable() {
        Assert.assertTrue(inventoryPage.checkProducts()==6);
    }

    @And("sort by {string}")
    public void sortBy(String option) {
        inventoryPage.selectOption(option);

    }

    @And("the first listed product should be {string}")
    public void theFirstListedProductShouldBe(String productName) {
        Assert.assertTrue(inventoryPage.checkFirstproduct().equals(productName));
    }

    @And("user should be able to add a product to the cart")
    public void userShouldBeAbleToAddAProductToTheCart(){
        inventoryPage.addAProductToCart();

    }


    @Then("user should see the remove button")
    public void userShouldSeeTheRemoveButton() {
        Assert.assertTrue(inventoryPage.removeButton());
    }


    @Then("user should see the checkout button")
    public void userShouldSeeTheCheckoutButton() {
        Assert.assertTrue(inventoryPage.checkOutButton());
    }

    @And("user navigates to the {string}")
    public void userNavigatesToThe(String cart) {
        inventoryPage.navigateToCart();
    }

    @And("user should click on the checkout button")
    public void userShouldClickOnTheCheckoutButton() {
        inventoryPage.checkOut();
    }

    @Then("user should see the checkout information page")
    public void userShouldSeeTheCheckoutInformationPage() {
        Assert.assertTrue(inventoryPage.checkOutInformationPage());
    }

    @And("user Enter {string}, {string},{string}")
    public void userEnter(String name, String surname, String code) {
        inventoryPage.firstName(name);
        inventoryPage.lastName(surname);
        inventoryPage.zipCode(code);

    }

    @Then("user should click on the continue button")
    public void userShouldClickOnTheContinueButton() {
        inventoryPage.continueButton();
    }

    @Then("user should see the checkout overview")
    public void userShouldSeeTheCheckoutOverview() {
        Assert.assertTrue(inventoryPage.checkoutOverview());
    }

    @And("user clicks on the  finish button")
    public void userClicksOnTheFinishButton() {
        inventoryPage.finishButton();
    }

    @Then("user should see the thank you message")
    public void userShouldSeeTheThankYouMessage() {
        Assert.assertTrue(inventoryPage.thankYouMsg());

    }

    @And("user clicks on the continue shopping button")
    public void userClicksOnTheContinueShoppingButton() {
        inventoryPage.continueShopping();
    }
}



