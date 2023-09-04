package org.example.StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.HomePage;
import org.example.Pages.SearchPage;
import org.example.Pages.ShoppingCartPage;
import org.openqa.selenium.By;

public class AddToCartTest {
    @Given("user searches for a product and clicks on the search button") //Step 1: User clicks on search field, type the product name in the search field and clicks on search button
    public void Search() {
        HomePage.SearchFieldClickable().click();
        SearchPage.SearchField().sendKeys("MacBook");
        SearchPage.SearchButtonClickable().click();
    }

    @When("User opens the product") //Step 2: User opens the product that he searched for
    public void userOpensTheProductAndAddsTheProductToTheShoppingCart() {
        SearchPage.ProductDetails().click();
    }

    @And("User adds the product to the shopping cart") //Step 3: User add the product to the shopping cart
    public void userAddsTheProductToTheShoppingCart() {

        SearchPage.AddToCartButton().click();
    }

    @And("User can navigates to the shopping cart to confirm that the product is added") //Step 4: User can navigate to the shopping cart to confirm that the product is added
    public void userCanNavigatesToTheShoppingCartToConfirmThatTheProductIsAdded() {
        SearchPage.AddToCartUpButton().click();
    }

    @And("User can updates the quantity from the shopping cart") //Step 5: User update the quantity from the shopping cart.
    public void userCanUpdatesTheQuantityFromTheShoppingCart() {
        ShoppingCartPage.QuantityField().click();
        ShoppingCartPage.QuantityField().clear();
        ShoppingCartPage.QuantityField().sendKeys("7");
    }

    @Then("User confirms the updated the quantity") //Step 6: clicks on the update quantity button
    public void userConfirmsTheUpdatedTheQuantity() {
        ShoppingCartPage.UpdateButton().click();
    }
}

