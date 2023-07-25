@regression
Feature: Mens page Test
  As a user I want to verify mens cart menu
  @smoke
  Scenario: User should add Mens product successfully to shopping cart
    Given I am on home page
    When I mouse hoover on Men Menu
    And I mouse hoover on Bottoms
    And I click on Pants
    And I mouse hoover and click on size
    And I mouse hoover and click on colour
    And I click on add to cart buttons
    And I can verify the product added"You added Cronus Yoga Pant to your shopping cart."
    And I click on shopping cart link into message
    Then I should verify the shopping cart Text"Shopping Cart"
    And I should verify the Product"Cronus Yoga Pant"
    And I should verify the product size"32"
    And I should verify the products colour"Black"