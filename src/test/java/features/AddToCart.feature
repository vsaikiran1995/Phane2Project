@Sanity
Feature: Add Items in to the cart

  Background: 
    Given I have launched the application from browser
    When I enter username as "standard_user"
    And I enter password as "secret_sauce"
    And I have click on login button
    Then I should land on home page
    
    Scenario: Add the product in the cart
    When I select the product and add to cart button
    And I click on cart symbol 
    Then validate the product is "Sauce Labs Backpack" 
