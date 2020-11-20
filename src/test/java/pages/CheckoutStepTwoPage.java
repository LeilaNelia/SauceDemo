package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutStepTwoPage {
    WebDriver driver;

    public CheckoutStepTwoPage(WebDriver driver) {
        this.driver = driver;
    }


    public boolean checkoutOverview(){
        return driver.findElement(By.xpath("//div[text()='Checkout: Overview']")).isDisplayed();
    }
    public boolean description(){
        return driver.findElement(By.xpath("//div[text()='DESCRIPTION']")).isDisplayed();
    }

    public void finishButton(){

        driver.findElement(By.xpath("//a[text()='FINISH']")).click();
    }
public boolean checkoutCompletePage(){
       return driver.getCurrentUrl().contains("checkout-complete");

}

}