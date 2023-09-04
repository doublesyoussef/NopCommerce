package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.StepDef.Hooks.driver;

public class RegisterPage {
    public static WebElement GenderRadioButton() {
        WebElement GenderRadioButton = driver.findElement(By.cssSelector("input[type=\"radio\"]"));
        return GenderRadioButton;
    }

    public static WebElement firstName() {
        WebElement firstName = driver.findElement(By.id("FirstName"));
        return firstName;
    }

    public static WebElement lastName() {
        WebElement lastName = driver.findElement(By.id("LastName"));
        return lastName;
    }

    public static WebElement BirthDay() {
        WebElement BirthDay = driver.findElement(By.cssSelector("select[name=\"DateOfBirthDay\"]"));
        return BirthDay;
    }

    public static WebElement BirthMonth() {
        WebElement BirthMonth = driver.findElement(By.cssSelector("select[name=\"DateOfBirthMonth\"]"));
        return BirthMonth;
    }

    public static WebElement BirthYear() {
        WebElement BirthYear = driver.findElement(By.cssSelector("select[name=\"DateOfBirthYear\"]"));
        return BirthYear;
    }

    public static WebElement Email() {
        WebElement Email = driver.findElement(By.id("Email"));
        return Email;
    }

    public static WebElement CompanyName() {
        WebElement CompanyName = driver.findElement(By.cssSelector("input[type=\"text\"][id=\"Company\"]"));
        return CompanyName;
    }

    public static WebElement NewsletterCheckBox() {
        WebElement NewsletterCheckBox = driver.findElement(By.cssSelector("input[type=\"checkbox\"][name=\"Newsletter\"][id=\"Newsletter\"]"));
        return NewsletterCheckBox;
    }

    public static WebElement Password() {
        WebElement Password = driver.findElement(By.id("Password"));
        return Password;
    }

    public static WebElement ConfirmPassword() {
        WebElement ConfirmPassword = driver.findElement(By.id("ConfirmPassword"));
        return ConfirmPassword;
    }

    public static WebElement RegisterNowButton() {
        WebElement RegisterNowButton = driver.findElement(By.id("register-button"));
        return RegisterNowButton;
    }
}
