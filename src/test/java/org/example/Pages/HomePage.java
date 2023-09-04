package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.StepDef.Hooks.driver;

public class HomePage {
    public static WebElement RegisterButtonClickable() {
        return driver.findElement(By.cssSelector("a[class=\"ico-register\"]"));
    }

    public static WebElement LoginButtonClickable() {
        return driver.findElement(By.cssSelector("a[class=\"ico-login\"]"));
    }

    public static WebElement SearchFieldClickable() {
        return driver.findElement(By.id("small-searchterms"));
    }
}
