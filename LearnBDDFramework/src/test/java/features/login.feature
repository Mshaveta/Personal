Feature: Login

Scenario: Login with valid Credentials
  Given The user launches the application
  When The user enters the username and password
  And The user clicks on Login button
  Then The user verify Home page is displayed
  And The user verify the Logout link availability


  Scenario: Login with invalid Credentials
    Given The user launches the application
    When The user enters the inVlaid username and invalid Password
    And The user clicks on Login button
    Then The user should not be able to see the Home page
