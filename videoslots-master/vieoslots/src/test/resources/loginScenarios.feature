Feature: Login
  Scenario: Successful login using email
    Given user opens a webpage "https://evernote.com/"
    When user clicks on "Log in" button
    And user fills the email field with "tester23testerqa@gmail.com"
    And clicks Continue button
    And user fills the password field with "12345qwert!"
    And user clicks on "Sign in" button
    Then user sees personal account being logged in

  Scenario: Unsuccessful login using email
    Given user opens a webpage "https://evernote.com/"
    When user clicks on "Log in" button
    And user fills email field with invalid data "testnumbertwo"
    And user clicks on Continue button
    Then user sees error message

  Scenario: Login and write a note followed by a logout
      Given user opens a webpage "https://evernote.com/"
      When user clicks on "Log in" button
      And user fills the email field with "tester23testerqa@gmail.com"
      And clicks Continue button
      And user fills the password field with "12345qwert!"
      And user clicks on "Sign in" button
      Then user sees personal account being logged in
      When user clicks "All notes" button
      And user clicks "Add new note" button
      And user types "First title" into new note title
      And user logs out
      And user confirms logging out
      Then user is on main page and user sees Log in button

  Scenario: Login again and make sure you open the note create in step 3
    Given user opens a webpage "https://evernote.com/"
    When user clicks on "Log in" button
    And user fills the email field with "tester23testerqa@gmail.com"
    And clicks Continue button
    And user fills the password field with "12345qwert!"
    And user clicks on "Sign in" button
    Then user sees personal account being logged in
    When user clicks "All notes" button
    Then note title has "First title" in it

