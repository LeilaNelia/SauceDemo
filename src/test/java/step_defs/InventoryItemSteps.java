package step_defs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.InventoryItemPage;

public class InventoryItemSteps {
    WebDriver driver = step_defs.LoginSteps.driver;
    InventoryItemPage inventoryItemPage = new InventoryItemPage(driver);
    
    
    @And("user clicks on a product link")
    public void userClicksOnAProductLink() {
        inventoryItemPage.productLink();
    }
    @Then("the product name should be displayed")
    public void theProductNameShouldBeDisplayed() {
        Assert.assertTrue(inventoryItemPage.productName());
    }
    @And("user clicks on a  {string}")
    public void userShouldBeAbleClickOnA(String link) {
        inventoryItemPage.link(link);
    }

    @And("user clicks on add to cart button")
    public void userClicksOnAddToCartButton() {
        inventoryItemPage.addToCartButton();
    }

    @Then("user should see the remove button")
    public void userShouldSeeTheRemoveButton() {
        inventoryItemPage.removeButton();
    }

    @And("user clicks on the go back button")
    public void userClicksOnTheGoBackButton() {
        inventoryItemPage.goBackButton();
    }

    @Then("the link should contain a specific {string}")
    public void theLinkShouldContainASpecific(String Id) {
        Assert.assertTrue(inventoryItemPage.idNumber(Id));
    }
}