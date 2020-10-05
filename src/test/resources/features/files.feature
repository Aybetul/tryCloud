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

    Scenario: Verify that new folder is created
      Given user clicks on plus sign
      And clicks on "New Folder"
      Then user names the folder
      And user clicks the arrow
      Then user clicks on "Recent" tab
      Then user verifies that new folder is created


      Scenario: Verify that new text file is created
        Given user clicks on "New text file"
        When user names the file
        And user clicks the arrow
        And user closes the file
        Then user clicks on "Recent" tab
        Then user verifies that new text file is created


        Scenario: Verify that user can choose an item as Favorites

          Given user is on "All files" page
          When user clicks on more icon on an item
          And user clicks on "Add to favorites"
          Then user clicks on "Favorites" tab
          Then user verifies that the item is added to Favorites


          Scenario:





