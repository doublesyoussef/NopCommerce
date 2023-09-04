package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.StepDef.Hooks.driver;

public class LoginPage {

    public static WebElement LoginEmail() {
     return driver.findElement(By.id("Email"));
    }

    public static WebElement LoginPassword() {
        return driver.findElement(By.id("Password"));
    }

    public static WebElement LoginNow() {
        return driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button"));
    }
}
