Feature: Login features

  Scenario: User can log in using valid credentials
    Given I am in the website
    When I log in using username "test2" and password "test2"
    Then I should be able to login successfully and see username "test2"
