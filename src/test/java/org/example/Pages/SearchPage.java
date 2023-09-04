package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.StepDef.Hooks.driver;

public class SearchPage {
    public static WebElement SearchField() {
        return driver.findElement(By.id("small-searchterms"));
    }

    public static WebElement SearchButtonClickable() {
        return driver.findElement(By.cssSelector("button[class=\"button-1 search-box-button\"]"));
    }

    public static WebElement ProductDetails() {
        return driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[1]/div/div[1]/a/img"));
    }

    public static WebElement AddToCartButton() {
        return driver.findElement(By.xpath("//*[@id=\"add-to-cart-button-4\"]"));
    }

    public static WebElement AddToCartUpButton() {
        return driver.findElement(By.xpath("//*[@id=\"topcartlink\"]/a"));
    }


}
