Feature: As a user, I want to test the registration

  Background: The user enters the login
    Given The user is on the page practice automation testing
    When the user clicks on MyAccount

  @RegistrationFailed
  Scenario Outline: Registration with empty fields
    When the user enters <email> or <password> empty in registration
    And clicks on the button register
    Then the user should receive a message of <error>
    Examples:
      | email                             | password | error                                        |
      | crowdar.academy.2023-01@gmail.com |          | Error: Please enter an account password.     |
      |                                   |          | Error: Please provide a valid email address. |