@regression
Feature: Women Page Test
  As a user I can verify the women cart menu
  @smoke
  Scenario: verify the products are short by name
    Given I am on home page
    When I click on Women Menu
    And I click on Tops
    And I click on jacket
    And I click on product name filter"Product Name"
    Then I should verify the product name by filter

  @sanity
  Scenario: verify the product are sort by price
    Given I am on home page
    When I click on Women Menu
    And I click on Tops
    And I click on jacket
    And I select product by price filter"price"
    Then I should verify the product price by filter