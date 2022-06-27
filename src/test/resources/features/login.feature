@login_functionality
Feature: User should be able to login

  @smoke @positive_scenario
  Scenario: Login as a valid user
    Given the user on the login page
    When the user enters the valid user
    Then the user should be able to login

  @negative_scenario
  Scenario:  Unable to login with invalid credentials
    Given the user on the login page
    When the user enters the invalid user
    Then the user should be able to login
  @smoke @negative_scenario
  Scenario:  Unable to login with invalid credentials 2
    Given the user on the login page
    When the user enters the invalid user 2
    Then the user should be able to login