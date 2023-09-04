package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.StepDef.Hooks.driver;

public class ShoppingCartPage {
    public static WebElement QuantityField() {
        return driver.findElement(By.cssSelector("input[class=\"qty-input\"]"));
    }

    public static WebElement UpdateButton() {
        return driver.findElement(By.id("updatecart"));
    }

    public static WebElement AgreementCheckBox() {
        return driver.findElement(By.id("termsofservice"));
    }

    public static WebElement CheckOutButton() {
        return driver.findElement(By.xpath("//*[@id=\"checkout\"]"));
    }

    public static WebElement CheckOutAsAGuestButton() {
        return driver.findElement(By.cssSelector("button[class=\"button-1 checkout-as-guest-button\"]"));
    }
}
