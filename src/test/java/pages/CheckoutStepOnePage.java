package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutStepOnePage {
    WebDriver driver;

    public CheckoutStepOnePage(WebDriver driver) {
        this.driver = driver;
    }

    public void checkOut() {
        driver.findElement(By.xpath("//a[@class='btn_action checkout_button']")).click();
    }

    public boolean checkOutInformationPage() {
        return driver.findElement(By.xpath("//div[text()='Checkout: Your Information']")).isDisplayed();
    }

    public void firstName(String name) {

        driver.findElement(By.id("first-name")).sendKeys(name);
    }

    public void lastName(String surname) {
        driver.findElement(By.id("last-name")).sendKeys(surname);
    }

    public void zipCode(String code) {
        driver.findElement(By.id("postal-code")).sendKeys(code);
    }

   public void cancelButton(){
        driver.findElement(By.xpath("//a[text()='CANCEL']")).click();
   }
   public boolean cartPage(){
        return driver.getCurrentUrl().contains("cart");
   }
   public boolean checkoutStepTwopage(){
        return driver.getCurrentUrl().contains("checkout-step-two");
   }
   public boolean errorMsg(){
        return driver.findElement(By.xpath("//h3[@data-test=\"error\"]")).isDisplayed();
   }
   public void continueButton(){
        driver.findElement(By.xpath("//input[@value=\"CONTINUE\"]")).click();
   }
}