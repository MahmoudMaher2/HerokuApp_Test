@RegressionTest
Feature: Test Login Feature

  Scenario: Validate successful login using valid credentials
    Given User navigate to login page
    When  User login with credentials "tomsmith" "SuperSecretPassword!"
    Then  User should login successfully

Scenario Outline: Validate Error message appearance when using invalid username or password
    Given User navigate to login page
    When  User enters Username "<username>"
    And   User enters Password "<password>"
    And   User clicks login Button
    Then  Error message Should be displayed

  Examples:
    | username | password             |
    | tomsmith | Invalid              |
    | Invalid  | SuperSecretPassword! |
    | Invalid  | Invalid              |
    |          |                      |
    | A        | A                    |
    | @$#      | @$#                  |