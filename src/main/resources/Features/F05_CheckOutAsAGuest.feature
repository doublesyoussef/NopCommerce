@Smoke
Feature: F05_Check out as guest |users can check out the products and make a payment

  Background:
    Given User clicks on search field, searches for a product, clicks on search button, clicks on the product, clicks on add to cart button, navigates to shopping cart page

  Scenario: The user can check out the products in his shopping cart and with check/money order
    When User agrees to the terms and conditions and click on the Check out button
    And User clicks on Checkout as a guest button
    And User adds his details: First, Last name, Email, Company "Amit" , selects the country and state, adds city, address details, Phone number and Fax
    And User clicks on Continue
    And User selects the shipping method and clicks on Continue
    And User selects the payment method as check money order and clicks on Continue
    And User clicks on Continue on the payment information section
    And User clicks on Confirm
    And The order is confirmed message
    Then User can navigate to order details

  Scenario: The user can check out the products in his shopping cart and with credit card
    When User agrees to the terms and conditions and click on the Check out button
    And User clicks on Checkout as a guest button
    And User adds his details: First, Last name, Email, Company "Amit" , selects the country and state, adds city, address details, Phone number and Fax
    And User clicks on Continue
    And User selects the shipping method and clicks on Continue
    And User selects the payment method as credit card and clicks on Continue
    And User adds the credit card payment information details and clicks on Continue
    And User clicks on Confirm
    And The order is confirmed message
    Then User can navigate to order details
