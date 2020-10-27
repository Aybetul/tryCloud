@Login
Feature: login as a user
  <<<<<<< HEAD

  @Login
  Scenario: login as a valid user
    Given user is on login page
    When user enters "username" and "password"
    Then user should log in
    And user should log out
#neyi verify edecez?

  @Login_valid
  Scenario: login as a valid user
    Given user is on login page
    When user enters username and password
    Then user should log in
    And user should log out

  @Login_invalid
  Scenario Outline: login as a invalid user
    Given user is on login page
    When user enters invalid "<username>" and "<password>"
    Then user should not log in

    Examples: credentials
      | username | password    |
      | user     | Userpass123 |
      | 12345    | user@#$     |
      | User1    | user123     |
    #alt+ctrl+l => to line up


  @Error_message
  Scenario Outline: login with missing credentials and verify error message
    Given user is on login page
    When user enters invalid "<username>" and "<password>"
    Then validate "Please fill out this field." error message should displayed
   # And user should log out
    Examples: credentials
      | username | password |
      |          | 1234567  |
      | 1234567  |          |
      |          |          |

