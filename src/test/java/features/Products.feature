Feature: Products features

  Background:
    Given I am in the website
    And I log in using username "test2" and password "test2"

  Scenario Outline: User can view products
    Given I click "<type>" named "<Product>"
    Then I should see details of "<Product>"
    Examples:
      | type      |  Product        |
      | Laptops   |  Sony vaio i5   |
      | Phones    |  Iphone 6 32gb  |
      | Monitors  |  ASUS Full HD   |

  Scenario Outline: User can order products
    Given I click "<type>" named "<Product>"
    When I add product in the cart
    And I place an order for the product
    Then I should see the order is completed
    Examples:
      | type      |  Product        |
      | Laptops   |  Sony vaio i5   |
      | Phones    |  Iphone 6 32gb  |
      | Monitors  |  ASUS Full HD   |