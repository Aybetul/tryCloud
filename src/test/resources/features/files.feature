Feature: files tab test

  Background: user is on the landing page
    Given user is on login page
    When user enters username and password
  Scenario: Verify page title
    Given user is on files tab
    Then user verifies that title is "Files - Trycloud"

  Scenario: Verify column names
    Given user is on files tab
    Then user verifies that column names are displayed
      | All files    |
      | Recent       |
      | Favorites    |
      | Shares       |
      | Tags         |
      | Deleted files|
    Then user verifies "Settings" tab displayed
    # We skipped Shares sub tabs but we could write test steps for it too



  Scenario: Verify that file is uploaded
    Given user clicks on plus sign
    And clicks on "Upload file"
    When user uploads file
    And user clicks on "Recent" tab
    Then user verifies that file is there