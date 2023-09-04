@Smoke
Feature: F02_Login | users could use login functionality to use their accounts

  Background:
    Given user clicks on the login button

  Scenario: user could login with valid email and password
    When user login with valid email
    And user login with valid password
    And user press on login button
    Then user login to the system successfully

  Scenario: user could login with invalid email and password
    When user login with invalid email
    And user login with invalid password
    And user press on login button
    Then The user could not login to his account



