Feature: login as a user

  Scenario: login as a valid user
    Given user is on login page
    When user enters "username" and "password"
    Then user should log in
    And user should log out

