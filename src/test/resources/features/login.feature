Feature: login as a user


  Scenario: login as a valid user
    Given user is on login page
    When user enters username and password
    Then user should log in
    And user should log out

  Scenario Outline: login as a invalid user
    Given user is on login page
    When user enters "<username>" and "<password>"
    Then user should not log in
    And user should log out
    Examples: credentials
      | username | password    |
      | user     | Userpass123 |
      | 12345    | user@#$     |
      | User1    | user123     |
    #alt+ctrl+l => to line up

  Scenario Outline: login with missing credentials and verify error message
    Given user is on login page
    When user enters "<username>" and "<password>"
    Then validate "Please fill out this field." error message should displayed
    And user should log out
    Examples: credentials
      |          | 1234567     |
      | 1234567  |             |
      |          |             |

