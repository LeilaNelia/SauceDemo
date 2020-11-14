package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
    WebDriver driver;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
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
}