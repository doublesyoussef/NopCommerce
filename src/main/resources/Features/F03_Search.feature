@Smoke
Feature: F03_Search| users can use the search function in the website

  Background:
    Given User clicks on the search field

  Scenario: User can search for products and returns the correct results
    When User types a search word in the appropriate search field
    And User clicks on the search button
    Then The website returns some results
