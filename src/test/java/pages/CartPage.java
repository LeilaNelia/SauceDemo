package pages;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {

        WebDriver driver;
        public CartPage(WebDriver driver) {
            this.driver = driver;
        }

    public void CartContainer(){
        driver.findElement(By.id("shopping_cart_container")).click();
    }
    public boolean cartBadge(){
            return driver.findElement(By.xpath("//span[@class=\"fa-layers-counter shopping_cart_badge\"]")).isDisplayed();
    }
    public boolean checkOutButton() {
        return driver.findElement(By.xpath("//a[@class='btn_action checkout_button']")).isDisplayed();

    }
    public void continueShopping(){
        driver.findElement(By.xpath("//a[text()='Continue Shopping']")).click();
    }
public boolean inventoryItemPage(){
            return driver.getCurrentUrl().contains("inventory-item");
}
 public void removeButton() {
            driver.findElement(By.xpath("//button[text()='REMOVE']")).click();
 }

 public boolean  checkoutStepOnePage(){
            return driver.getCurrentUrl().contains("checkout-step-one");
 }
}
