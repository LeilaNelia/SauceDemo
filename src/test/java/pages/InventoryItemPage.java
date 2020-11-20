package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InventoryItemPage {

    WebDriver driver;
    public InventoryItemPage(WebDriver driver) {
        this.driver = driver;
    }
    public void productLink() {
         driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).click();
    }

    public boolean productName(){
        return driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).isDisplayed();
    }
    public void addToCartButton(){
        driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
    }
    public boolean removeButton() {
        return driver.findElement(By.xpath("//button[text()='REMOVE']")).isDisplayed();
    }
    public void goBackButton(){
        driver.findElement(By.xpath("//button[text()='<- Back']")).click();
    }
    public void link(String link) {
        driver.findElement(By.linkText(link)).click();
    }
    public boolean idNumber(String Id){
        return driver.getCurrentUrl().contains(Id);
    }



}
