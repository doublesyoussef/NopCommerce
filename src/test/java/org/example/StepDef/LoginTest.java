package org.example.StepDef;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.HomePage;
import org.example.Pages.LoginPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import static org.example.StepDef.Hooks.driver;

public class LoginTest {
    Faker faker = new Faker();

    //Step 1 user go to login page
    @Given("user clicks on the login button")
    public void LoginButtonClickable() {
        HomePage.LoginButtonClickable().click();

    }

    //Step 2 user login with "valid" email (can't be done with the java faker library, you've to create an account (register) then login with it's data)
    @When("user login with valid email")
    public void userLoginWithValidEmail() {
        LoginPage.LoginEmail().sendKeys("email1@example.com");
    }

    //Step 3 user login with "valid" password (can't be done with the java faker library, you've to create an account (register) then login with it's data)
    @And("user login with valid password")
    public void userLoginWithValidPassword() {
        LoginPage.LoginPassword().sendKeys("password");
    }

    //Step 4 user press on login button
    @And("user press on login button")
    public void userPressOnLoginButton() {
        LoginPage.LoginNow().click();
    }

    //Step 5 user login to the system successfully and assertion points
    @Then("user login to the system successfully")
    public void userLoginToTheSystemSuccessfully() {
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "https://demo.nopcommerce.com/");
        String expectedUserLoggedSuccessfully = "My account";
        String actualUserLoggedSuccessfully = driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).getText();
        Assert.assertEquals(actualUserLoggedSuccessfully, expectedUserLoggedSuccessfully);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertAll();
    }

    //Second Scenario
    //Step 2 user login with "invalid" email
    @When("user login with invalid email")
    public void userLoginWithInvalidEmail() {
        String tempEmail = faker.internet().emailAddress();
        String email = tempEmail + "hotmail";
        LoginPage.LoginEmail().sendKeys(email);
    }

    //Step 3 user login with "invalid" password
    @And("user login with invalid password")
    public void userLoginWithInvalidPassword() {
        String passwordFaker = faker.internet().password();
        LoginPage.LoginPassword().sendKeys(passwordFaker);
    }

    //Step 5 user could not log to the system and assertion points
    @Then("The user could not login to his account")
    public void theUserCouldNotLoginToHisAccount() {
        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String actualErrorMessage = driver.findElement(By.cssSelector("div[class=\"message-error validation-summary-errors\"]")).getText();
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
    }
}
