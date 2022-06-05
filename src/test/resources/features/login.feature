Feature: login
  Salesforce login test

  Background: 
    Given user goes to url "https://login.salesforce.com"

  Scenario: invalid login with valid username and blank password
    When user enters "aanay@tekarch.com" in username field
    And user enters "" in password field
    And user clicks on login button
    Then error message should be "Please enter your password."

  Scenario: valid login with valid username and password
    When user enters "aanay@tekarch.com" in username field
    And user enters "yamini1990" in password field
    And user clicks on login button
    Then home tab should be displayed as "Home"

  Scenario: check username in login page after successful logout
    When user enters "aanay@tekarch.com" in username field
    And user enters "yamini1990" in password field
    And user clicks on RememberMe button
    And user clicks on login button
    And user clicks on logout button under profile after successful login
    Then username field should display "aanay@tekarch.com" in the login page

  Scenario: verify forgot password page functionality
    When user clicks forgotpassword button
    And user enters "aanay@tekarch.com" in forgot password page username field
    And user clicks on continue button
    Then forgot password form message should be "Check Your Email"

  Scenario: invalid login with invalid username and password
    When user enters "12345" in username field
    And user enters "12345" in password field
    And user clicks on login button
    Then error message should be "Please check your username and password. If you still can't log in, contact your Salesforce administrator."

  Scenario: verify My Profile navigation menu after successful login
    When user enters "aanay@tekarch.com" in username field
    And user enters "yamini1990" in password field
    And user clicks on login button
    Then user navigation menu items should contain "My Profile"
