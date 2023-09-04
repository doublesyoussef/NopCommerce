@Smoke
Feature: F01_Register | users could register with new accounts

  Background:
    Given user clicks on the registration button

  Scenario: guest user could register with valid data successfully
    When user selects gender type
    And user enters first name and last name
    And user enters date of birth
    And user enters email field
    And user enters the company name
    And user unselect the newsletter
    And user fills password and confirm password fields
    And user clicks on register button
    And success message is displayed

