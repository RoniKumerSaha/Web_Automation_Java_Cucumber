Feature: Contact feature

  Scenario: User can send feedback via contact page
    Given I am in the website
    And I go to the Contact page
    When I fill up the form and submit the message
    Then I should be submitted successfully

    Scenario: User can visit contact page
      Given I am in the website
      When I click Contact button
      Then I should be on Contact page