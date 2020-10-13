Feature: Calender page

  Background: user is on the landing page
    Given user is on login page
    When user enters username and password
    And user clicks on "Calender" tab

  Scenario: user can create an event
    Then user clicks on "Month" button
    Then user clicks on New Calendar button
    And user enters calender name
    And user clicks on arrow to select a month
    And user chooses a day form calender
    Then user types meeting name
    And user chooses calender name from dropdown
    And user chooses starts day and time from popup calender
    And user chooses ends day and time from popup calender
    And user clicks on Create button
    Then verify that meeting is created
    # when we create a meeting with same conditions system should display warning messages
  Scenario: create a calendar
    When