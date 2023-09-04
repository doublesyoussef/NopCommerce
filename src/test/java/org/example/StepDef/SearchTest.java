package org.example.StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.HomePage;
import org.example.Pages.SearchPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import static org.example.StepDef.Hooks.driver;

public class SearchTest {

    @Given("User clicks on the search field") //Step 1: User clicks on the search field
    public void SearchFieldClickable() {

        HomePage.SearchFieldClickable().click();
    }

    @When("User types a search word in the appropriate search field") //Step 2: User type a search for the product
    public void userTypesASearchWordInTheAppropriateSearchField() {

        SearchPage.SearchField().sendKeys("MacBook");
    }

    @And("User clicks on the search button") //Step 3: User clicks on the search button
    public void userClicksOnTheSearchButton() {
        SearchPage.SearchButtonClickable().click();
    }

    @Then("The website returns some results") //Step 4: The website returns some results (assertion point)
    public void theWebsiteReturnsSomeResults() {
        String expectedResults = "Search";
        String actualResults = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[1]/h1")).getText();
        Assert.assertEquals(actualResults, expectedResults);
    }
}
