Feature: Calender page

  Scenario: user can create an event
    When user clicks on "Calender" tab
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



