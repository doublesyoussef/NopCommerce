package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.StepDef.Hooks.driver;

public class RegisterPage {
    public static WebElement GenderRadioButton() {
        return driver.findElement(By.cssSelector("input[type=\"radio\"]"));
    }

    public static WebElement firstName() {
        return driver.findElement(By.id("FirstName"));
    }

    public static WebElement lastName() {
       return driver.findElement(By.id("LastName"));
    }

    public static WebElement BirthDay() {
        return driver.findElement(By.cssSelector("select[name=\"DateOfBirthDay\"]"));
    }

    public static WebElement BirthMonth() {
        return driver.findElement(By.cssSelector("select[name=\"DateOfBirthMonth\"]"));
    }

    public static WebElement BirthYear() {
        return driver.findElement(By.cssSelector("select[name=\"DateOfBirthYear\"]"));
    }

    public static WebElement Email() {
        return driver.findElement(By.id("Email"));
    }

    public static WebElement CompanyName() {
        return driver.findElement(By.cssSelector("input[type=\"text\"][id=\"Company\"]"));
    }

    public static WebElement NewsletterCheckBox() {
        return driver.findElement(By.cssSelector("input[type=\"checkbox\"][name=\"Newsletter\"][id=\"Newsletter\"]"));
    }

    public static WebElement Password() {
        return driver.findElement(By.id("Password"));
    }

    public static WebElement ConfirmPassword() {
        return driver.findElement(By.id("ConfirmPassword"));
    }

    public static WebElement RegisterNowButton() {
        return driver.findElement(By.id("register-button"));
    }
}
