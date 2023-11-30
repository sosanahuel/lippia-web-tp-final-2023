Feature: As a user, I want to test the log-in

  Background:
    Given The user is on the page practice automation testing
    When the user clicks on MyAccount

  @LoginFailed
  Scenario Outline: Error log-in
    When enters the <email> or <password> incorrect
    Then the login should fail due to <error>
    Examples:
      | email                             | password         | error                                                                            |
      | crowdar.academy.2023@gmail.com    | 12AaSsDd112233$$ | Lost your password?                                                              |
      | 123crowdar.academy.2023@gmail.com | AaSsDd112233$$   | Error: A user could not be found with this email address.not found email address |


  @LoginIn
  Scenario Outline: Logout account
    When enters the correct <email> and <password>
    And the user logs out
    And presses the back button
    Then the user successfully exits the site
    Examples:
      | email                          | password       |
      | crowdar.academy.2023@gmail.com | AaSsDd112233$$ |