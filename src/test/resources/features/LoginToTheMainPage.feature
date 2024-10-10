
Feature: Add new user

  Scenario: Add new user to our website
    Given User navigates to the website homepage
    And User navigates to Register Page
    When User gives firstName
    And User gives lastName
    And User gives sSN
    And User click button register
    And User has errors fields
    And User gives address
    And User gives city
    And User gives state
    And User gives zip code
    And User gives username
    And User gives password
    And User confirm password
    And User has account confirmation
    Then User closes the window

  Scenario: Add dublicate user
    Given User navigates to the website homepage
    And User navigates to Register Page
    When User gives firstName
    And User gives lastName
    And User gives sSN
    And User click button register
    And User has errors fields
    And User gives address
    And User gives city
    And User gives state
    And User gives zip code
    And User gives username
    And User gives password
    And User confirm password
    And User has account duplication error
    Then User closes the window

  Scenario: User log in succesful
    Given User navigates to the website homepage
    When User insert username
    And User insert password
    And User click login
    And User has entry confirmation
    Then User closes the window
  @Run
  Scenario: User open new account
    Given User navigates to the website homepage
    When User insert username
    And User insert password
    And User click login
    And User open new account
    And User click type field
    And User click saving type
    And User click open new account
    And User has open account confirmation
    Then User closes the window