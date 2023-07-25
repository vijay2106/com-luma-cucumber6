@regression
Feature: Gear page Test
  As a user I can verify the cart menu
  @sanity
  Scenario: User should add product into cart successful
    Given I am on home page
    When I mouse hoover on gear menu
    And I click on bags tab
    And I click on overnight duffle product
    And I verify the product text "Overnight Duffle"
    And I change quantity"3"
    And I click on add to cart button
    And I verify the text"You added Overnight Duffle to your shopping cart."
    And I click on shopping cart link from message
    And I verify the product name "Overnight Duffle"
    And I verify the quantity "3"
    And I verify the product price "$135.00"
    And I change the quantity "5"
    And I click on update shopping cart
    Then I can verify the price "$225.00"