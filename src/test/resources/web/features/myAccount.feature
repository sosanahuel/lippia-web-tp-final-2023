Feature: As a user, I want to see the details of my account

  Background: the user login account
    Given The user is on the page practice automation testing
    When the user clicks on MyAccount
    And enters valid username and password
    And clicks on the button login
    And the user logs in successfully
    And the user clicks on MyAccount

  @AccountDetails
  Scenario: My Accounts-Account Details
    When the user clicks on Account details
    Then the user can see the details where they can change the password

  @AccountLogout
  Scenario: My Accounts-Log-Out
    When the user clicks on the button logout
    Then the user successfully exits the site