Feature: gallery tab test

#BUG
# When user clicks the grid on gallery page, system navigates to file page

  # Requirement can be added: When user uploads other than picture, error message could be given

  Background: user is on the landing page
    Given user is on login page
    When user enters username and password

  Scenario: adding new picture to gallery
    Given user clicks on gallery tab
    And user clicks on plus sign
    And clicks on "Upload"
    When user uploads picture
    Then user verifies that picture is there

  Scenario: ascending and descending order
    Given user clicks on gallery tab
    And user clicks on AZ icon
    Then user verifies that pictures are ordered by name

  Scenario: pictures are ordered based on date and time
    Given user clicks on gallery tab
    And user clicks on calendar icon
    Then user verifies that pictures are ordered by date


  Scenario: upload pictures appears in the gallery page
    Given user clicks on plus sign
    And clicks on "Upload file"
    When user uploads file
    And user clicks on "Gallery" tab
    Then user verifies that picture is there