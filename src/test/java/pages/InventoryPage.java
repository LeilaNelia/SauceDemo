package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class InventoryPage {

    WebDriver driver;


    public InventoryPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean CheckElementIsVisible() {
        return driver.findElement(By.xpath("//div[@class='peek']")).isDisplayed();
    }

    public void openMenu() {
        driver.findElement(By.xpath("//button[text()='Open Menu']")).click();
    }

    public boolean checkMenuIsVisible() {

        return driver.findElement(By.xpath("//button[text()='Open Menu']")).isDisplayed();


    }

    public int menuItems() {
        List<WebElement> items = driver.findElements(By.xpath("//nav/a"));
        return items.size();
    }

    public void navigatetoLink(String link) {
        if (link.equalsIgnoreCase("Cart")) {
            driver.findElement(By.id("shopping_cart_container")).click();
        }
        driver.findElement(By.linkText(link)).click();
    }

    public int checkProducts() {
        return driver.findElements(By.xpath("//div[@class='inventory_item']")).size();

    }

    public void selectOption(String option) {
        WebElement dropdown = driver.findElement(By.xpath("//select"));
        Select select = new Select(dropdown);
        select.selectByVisibleText(option);
    }

    public String checkFirstproduct() {
        WebElement first = driver.findElements(By.xpath("//div[@class='inventory_item']")).get(1);
        return first.findElement(By.xpath("//div[@class='inventory_item_name']")).getText();

    }

    public void navigateToCart() {
        driver.findElement(By.id("shopping_cart_container")).click();

    }

    public void addAProductToCart() {
        WebElement product = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
        WebElement addToCart = driver.findElement(By.xpath("(//button[text()='ADD TO CART']) [1]"));
        addToCart.click();
    }

    public boolean removeButton() {
        return driver.findElement(By.xpath("//button[text()='REMOVE']")).isDisplayed();
    }

    public boolean checkOutButton() {
        return driver.findElement(By.xpath("//a[@class='btn_action checkout_button']")).isDisplayed();

    }

    public void checkOut() {
        driver.findElement(By.xpath("//a[@class='btn_action checkout_button']")).click();
    }

    public boolean checkOutInformationPage() {
        return driver.findElement(By.xpath("//div[text()='Checkout: Your Information']")).isDisplayed();
    }
    public void firstName(String name){
        driver.findElement(By.id("first-name")).sendKeys(name);
    }
    public void lastName(String surname){
        driver.findElement(By.id("last-name")).sendKeys(surname);
    }
    public void zipCode(String code){
        driver.findElement(By.id("postal-code")).sendKeys(code);
    }
    public void continueButton(){
        driver.findElement(By.xpath("//input[@value='CONTINUE']")).click();
    }
    public boolean checkoutOverview(){
        return driver.findElement(By.xpath("//div[text()='Checkout: Overview']")).isDisplayed();
    }
    public void finishButton(){
        driver.findElement(By.xpath("//a[text()='FINISH']")).click();
    }
    public boolean thankYouMsg(){
        return driver.findElement(By.xpath("//h2[text()='THANK YOU FOR YOUR ORDER']")).isDisplayed();
    }
    public void continueShopping(){
        driver.findElement(By.xpath("//a[text()='Continue Shopping']")).click();
    }


}