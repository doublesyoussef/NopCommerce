package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.StepDef.Hooks.driver;

public class CheckOutPage {
    public static WebElement FirstNameBillingAddress() {
        return driver.findElement(By.id("BillingNewAddress_FirstName"));
    }

    public static WebElement LastNameBillingAddress() {
        return driver.findElement(By.id("BillingNewAddress_LastName"));
    }

    public static WebElement EmailBillingAddress() {
        return driver.findElement(By.id("BillingNewAddress_Email"));
    }

    public static WebElement CompanyBillingAddress() {
        return driver.findElement(By.id("BillingNewAddress_Company"));
    }

    public static WebElement CountryBillingAddress() {
        return driver.findElement(By.id("BillingNewAddress_CountryId"));
    }

    public static WebElement StateBillingAddress() {
        return driver.findElement(By.id("BillingNewAddress_StateProvinceId"));
    }

    public static WebElement CityBillingAddress() {
        return driver.findElement(By.id("BillingNewAddress_City"));
    }

    public static WebElement AddressBillingAddress() {
        return driver.findElement(By.id("BillingNewAddress_Address1"));
    }

    public static WebElement ZipCodeBillingAddress() {
        return driver.findElement(By.id("BillingNewAddress_ZipPostalCode"));
    }

    public static WebElement PhoneNumberBillingAddress() {
        return driver.findElement(By.id("BillingNewAddress_PhoneNumber"));
    }

    public static WebElement FaxBillingAddress() {
        return driver.findElement(By.id("BillingNewAddress_FaxNumber"));
    }

    public static WebElement ContinueBillingAddressButton() {
        return driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/button[4]"));
    }

    public static WebElement ShippingMethod() {
        return driver.findElement(By.id("shippingoption_1"));
    }

    public static WebElement ContinueShippingMethodButton() {
        return driver.findElement(By.cssSelector("button[class=\"button-1 shipping-method-next-step-button\"]"));
    }

    public static WebElement CreditCardPaymentMethod() {
        return driver.findElement(By.id("paymentmethod_1"));
    }

    public static WebElement ContinuePaymentMethodButton() {
        return driver.findElement(By.cssSelector("button[class=\"button-1 payment-method-next-step-button\"]"));
    }

    public static WebElement SelectCC_CreditCardPM() {
        return driver.findElement(By.id("CreditCardType"));
    }

    public static WebElement CardholderName_CreditCardPM() {
        return driver.findElement(By.id("CardholderName"));
    }

    public static WebElement CardNumber_CreditCardPM() {
        return driver.findElement(By.id("CardNumber"));
    }

    public static WebElement ExpirationMonth_CreditCardPM() {
        return driver.findElement(By.id("ExpireMonth"));
    }

    public static WebElement ExpirationYear_CreditCardPM() {
        return driver.findElement(By.id("ExpireYear"));
    }

    public static WebElement CardCode_CreditCardPM() {
        return driver.findElement(By.id("CardCode"));
    }

    public static WebElement ContinuePaymentInformationButton() {
        return driver.findElement(By.cssSelector("button[class=\"button-1 payment-info-next-step-button\"]"));
    }

    public static WebElement ConfirmOrderButton() {
        return driver.findElement(By.cssSelector("button[class=\"button-1 confirm-order-next-step-button\"]"));
    }

    public static WebElement OrderDetails() {
        return driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div/div[2]/div[2]/a"));
    }
}
