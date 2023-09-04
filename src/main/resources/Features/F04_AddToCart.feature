@Smoke
Feature: F04_Add to Cart| users can add product to the shopping cart

  Background:
    Given user searches for a product and clicks on the search button

  Scenario: The user can add the product to the shopping cart directly
    When User opens the product
    And User adds the product to the shopping cart
    And User can navigates to the shopping cart to confirm that the product is added
    And User can updates the quantity from the shopping cart
    Then User confirms the updated the quantity
