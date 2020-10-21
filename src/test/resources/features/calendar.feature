Feature: Calendar page
 #bug->today button doesn't work

  
  Background: user is on the landing page
    Given user is on login page
    When user enters username and password
    And user clicks on "Calendar" tab

  Scenario: user can create an event
    Then user clicks on "Month" button
    Then user clicks on New Calendar button
    And user enters calender name
    And user clicks on arrow to select a month
    And user chooses a day form calender
    Then user types meeting name
    And user chooses calendar name from dropdown
    And user chooses starts day and time from popup calendar
    And user chooses ends day and time from popup calendar
    And user clicks on Create button
    Then verify that meeting is created

    # when we create a meeting with same conditions system should display warning messages

  Scenario: create a calendar
    When user clicks New Calendar
    And user types a calendar name
    And user clicks check sign
    Then user verifies calendar is created


# current day format->Oct 13,2020
  Scenario Outline: verify day, week, month is displayed
    When user clicks "<button>"
    Then user verifies "<current date>"



    Examples:
      | button | current date                             |
      | Day    | current_day                              |
      | Week   | Week current_week_number of current_year |
      | Month  | current_month current_year               |













