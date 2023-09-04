package org.example.StepDef;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.HomePage;
import org.example.Pages.RegisterPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import static org.example.StepDef.Hooks.driver;

public class RegisterTest {
    Faker faker = new Faker();

    @Given("user clicks on the registration button") //Step 1 user goes to register page
    public void RegisterButtonClickable() {
        HomePage.RegisterButtonClickable().click();
    }

    @When("user selects gender type") // Step 2 user selects gender type
    public void userSelectsGenderType() {
        RegisterPage.GenderRadioButton().click();
    }

    @And("user enters first name and last name") //Step 3 user enters first name and last name
    public void userEntersFirstNameAndLastName() {
        String firstNameFaker = faker.name().firstName();
        String lastNameFaker = faker.name().firstName();
        RegisterPage.firstName().sendKeys(firstNameFaker);
        RegisterPage.lastName().sendKeys(lastNameFaker);
    }

    @And("user enters date of birth") //Step 4 user enters date of birth
    public void userEntersDateOfBirth() {
        int min = 1;
        int maxDay = 31;
        int maxMonth = 12;
        int minYear = 1913;
        int maxYear = 2023;
        Select selectDay = new Select(RegisterPage.BirthDay());
        Select selectMonth = new Select(RegisterPage.BirthMonth());
        Select selectYear = new Select(RegisterPage.BirthYear());
        int randomDay = (int) Math.floor(Math.random() * (maxDay - min + 1) + min);
        int randomMonth = (int) Math.floor(Math.random() * (maxMonth - min + 1) + min);
        int randomYear = (int) Math.floor(Math.random() * (maxYear - minYear + 1) + minYear);
        selectDay.selectByValue(randomDay + "");
        selectMonth.selectByIndex(randomMonth);
        selectYear.selectByValue(randomYear + "");
    }

    @And("user enters email field") //Step 5 user enters email field
    public void userEntersEmailField() {
        String email = faker.internet().emailAddress();
        RegisterPage.Email().sendKeys(email);
    }

    @And("user enters the company name") //Step 6 user enters *amit* in company name field
    public void userEntersTheCompanyName() {
        RegisterPage.CompanyName().sendKeys("amit");
    }

    @And("user unselect the newsletter") //Step 7 user clicks on the newsletter checkbox
    public void userUnselectTheNewsletter() {
        RegisterPage.NewsletterCheckBox().click();
    }

    @And("user fills password and confirm password fields") //Step 8 user fills Password and confirm password fields "P@ssw0rd" "P@ssw0rd"

    public void userFillsPasswordAndConfirmPasswordFields() {
        String password = faker.internet().password();
        RegisterPage.Password().sendKeys(password);
        RegisterPage.ConfirmPassword().sendKeys(password);
    }

    @And("user clicks on register button") //Step 9 user clicks on register button
    public void userClicksOnRegisterButton() {
        RegisterPage.RegisterNowButton().click();
    }


    @Then("success message is displayed") //Step 10 success message is displayed and assertion point
    public void successMessageIsDisplayed() {
        String expectedRegistrationComplete = "Your registration completed";
        String actualRegistrationComplete = By.cssSelector("div[class=\"result\"]").findElement(driver).getText();
        Assert.assertEquals(actualRegistrationComplete, expectedRegistrationComplete);
    }
}
