Feature: Home features
  @tk
  Scenario: I want to see home page
    Given I go to the home page
    Then I should see home page

  Scenario: I want to select an category
    Given I go to the home page
    And I select API category
    Then I should see the "API" category