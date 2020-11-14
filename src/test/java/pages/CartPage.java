package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {

        WebDriver driver;
        public CartPage(WebDriver driver) {
            this.driver = driver;
        }
    public void addAProductToCart() {
        WebElement product = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
        WebElement addToCart = driver.findElement(By.xpath("(//button[text()='ADD TO CART']) [1]"));
        addToCart.click();
    }


    public boolean removeButton() {
        return driver.findElement(By.xpath("//button[text()='REMOVE']")).isDisplayed();
    }
    public void CartContainer(){
        driver.findElement(By.id("shopping_cart_container")).click();
    }
    public boolean checkOutButton() {
        return driver.findElement(By.xpath("//a[@class='btn_action checkout_button']")).isDisplayed();

    }
    public void continueShopping(){
        driver.findElement(By.xpath("//a[text()='Continue Shopping']")).click();
    }

}
