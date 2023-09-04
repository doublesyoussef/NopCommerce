package org.example.StepDef;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.*;

import static org.example.StepDef.Hooks.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.time.Duration;

public class CheckOutAsAGuestTest {
    Faker faker = new Faker();

    @Given("User clicks on search field, searches for a product, clicks on search button, clicks on the product, clicks on add to cart button, navigates to shopping cart page") //Step 1: User clicks on search field, type the product name in the search field, clicks on search button, opens the product details, clicks on add to cart button, then goes to the add to cart page
    public void PreCheckingOut() {
        HomePage.SearchFieldClickable().click();
        SearchPage.SearchField().sendKeys("MacBook");
        SearchPage.SearchButtonClickable().click();
        SearchPage.ProductDetails().click();
        SearchPage.AddToCartButton().click();
        SearchPage.AddToCartUpButton().click();
    }

    @When("User agrees to the terms and conditions and click on the Check out button") //Step 2: The guest user agrees to the terms and conditions and click on the Check out button
    public void userAgreesToTheTermsAndConditionsAndClickOnTheCheckOutButton() {
        ShoppingCartPage.AgreementCheckBox().click();
        ShoppingCartPage.CheckOutButton().click();
    }

    @And("User clicks on Checkout as a guest button") //Step 3: User clicks on checkout as a guest button
    public void userClicksOnCheckoutAsAGuestButton() {
        ShoppingCartPage.CheckOutAsAGuestButton().click();
    }

    @And("User adds his details: First, Last name, Email, Company {string} , selects the country and state, adds city, address details, Phone number and Fax") //Step 4: User fills fields in billing address section
    public void userAddsHisDetailsFirstLastNameEmailCompanySelectsTheCountryAndStateAddsCityAddressDetailsPhoneNumberAndFax(String arg0) {

        String firstNameFaker = faker.name().firstName();
        String lastNameFaker = faker.name().lastName();
        String emailFaker = faker.internet().emailAddress();
        String cityFaker = faker.address().city();
        String addressFaker = faker.address().fullAddress();
        String zipCodeFaker = faker.number().digit();
        String phoneNumberFaker = faker.phoneNumber().phoneNumber();
        String faxFaker = faker.address().fullAddress();

        CheckOutPage.FirstNameBillingAddress().sendKeys(firstNameFaker);
        CheckOutPage.LastNameBillingAddress().sendKeys(lastNameFaker);
        CheckOutPage.EmailBillingAddress().sendKeys(emailFaker);
        CheckOutPage.CompanyBillingAddress().sendKeys(arg0);
        CheckOutPage.CountryBillingAddress().sendKeys("United States");
        Select selectState = new Select(CheckOutPage.StateBillingAddress());
        selectState.selectByVisibleText("Alaska");
        CheckOutPage.CityBillingAddress().sendKeys(cityFaker);
        CheckOutPage.AddressBillingAddress().sendKeys(addressFaker);
        CheckOutPage.ZipCodeBillingAddress().sendKeys(zipCodeFaker);
        CheckOutPage.PhoneNumberBillingAddress().sendKeys(phoneNumberFaker);
        CheckOutPage.FaxBillingAddress().sendKeys(faxFaker);
    }

    @And("User clicks on Continue") //Step 5:  The user clicks on Continue on the billing address section
    public void userClicksOnSaveAndContinue() {
        CheckOutPage.ContinueBillingAddressButton().click();
    }

    @And("User selects the shipping method and clicks on Continue") //Step 6: The user selects the shipping method and clicks on Continue
    public void userSelectsTheShippingMethodAndClicksOnContinue() {
        CheckOutPage.ShippingMethod().click();
        CheckOutPage.ContinueShippingMethodButton().click();
    }

    @And("User selects the payment method as check money order and clicks on Continue") //Step 7: The user selects the payment method and clicks on Continue
    public void userSelectsThePaymentMethodAsAsCheckMoneyOrderAndClicksOnContinue() {
        CheckOutPage.ContinuePaymentMethodButton().click();
    }

    @And("User clicks on Continue on the payment information section") //Step 8: The user clicks on Continue in the payment method information section
    public void userClicksOnContinueOnThePaymentInformationSection() {
        CheckOutPage.ContinuePaymentInformationButton().click();
    }

    @And("User clicks on Confirm") //Step 9: The guest user clicks on Confirm
    public void userClicksOnConfirm() {
        CheckOutPage.ConfirmOrderButton().click();
    }

    @And("The order is confirmed message") //Step 10: Order is confirmed (assertion point)
    public void theOrderIsConfirmedMessage() {
        String expectedConfirmMessage = "Your order has been successfully processed!";
        String actualConfirmMessage = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div/div[1]/strong")).getText();
        Assert.assertEquals(actualConfirmMessage, expectedConfirmMessage);
    }

    @Then("User can navigate to order details") //Step 11: User can navigate to order details
    public void userCanNavigateToOrderDetails() {
        CheckOutPage.OrderDetails().click();

    }

    @And("User selects the payment method as credit card and clicks on Continue") //Step 7: The user selects the payment method and clicks on Continue
    public void userSelectsThePaymentMethodAsCreditCardAndClicksOnContinue() {
        CheckOutPage.CreditCardPaymentMethod().click();
        CheckOutPage.ContinuePaymentMethodButton().click();
    }

    @And("User adds the credit card payment information details and clicks on Continue") //Step 8: The user fills the credit card information details and clicks on Continue in the payment method information section
    public void userAddsTheCreditCardPaymentInformationDetailsAndClicksOnContinue() {
        String CardholderNameFaker = faker.name().name();
        String CardCodeFaker = faker.number().digits(4);
        int min = 0;
        int maxCC = 3;
        int maxMonth = 12;
        int maxYear = 14;
        Select selectCC = new Select(CheckOutPage.SelectCC_CreditCardPM());
        int randomCCSelection = (int) Math.floor(Math.random() * (maxCC - min + 1) + min);
        selectCC.selectByIndex(randomCCSelection);
        CheckOutPage.CardholderName_CreditCardPM().sendKeys(CardholderNameFaker);
        CheckOutPage.CardNumber_CreditCardPM().sendKeys("5555555555554444");
        Select selectExpirationMonth = new Select(CheckOutPage.ExpirationMonth_CreditCardPM());
        Select selectExpirationYear = new Select(CheckOutPage.ExpirationYear_CreditCardPM());
        int randomExpirationMonth = (int) Math.floor(Math.random() * (maxMonth - min + 1) + min);
        int randomExpirationYear = (int) Math.floor(Math.random() * (maxYear - min + 1) + min);
        selectExpirationMonth.selectByIndex(randomExpirationMonth);
        selectExpirationYear.selectByIndex(randomExpirationYear);
        CheckOutPage.CardCode_CreditCardPM().sendKeys(CardCodeFaker);
        CheckOutPage.ContinuePaymentInformationButton().click();
    }
}
