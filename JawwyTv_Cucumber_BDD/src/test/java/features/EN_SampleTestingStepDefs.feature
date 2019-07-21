#Author: khaledmostafakm2021@gmail.com
Feature: Verify sample tests for home and login screen for Jawwytv Web Application with English Interface

  Background: 
    Given Jawwytv site opens successfully
    When User changes language in welcome screen
    And User clicks on seven days free subscribe now button

  @toptest
  Scenario: Validate user navigates back to subscribe now page
    Then User clicks on Click here link in create your account section
    And User clicks on Subscribe link in Existing User section
    Then User should navigate to Create your account section

  @toptest
  Scenario: Validate terms and conditions page
    Then User clicks on Terms and Conditions link in create your account section
    Then User should see that Terms & Conditions section is displayed
    When User enters "<username>","<password>"
    And User clicks on continue button

  @bottomtest
  Scenario: Validate back button on payment screen on entering username and password
    Then User should see back button displayed on payment screen

  @bottomtest
  Scenario: Validate that one single payment method is available for Lebanon country
    And User should selects Lebanon from country dropdown menu
    Then User should see that only credit card payment method is displayed

  @bottomtest
  Scenario: Validate that two payment methods are available for Bahrain country
    And User should selects Bahrain from country dropdown menu
    Then User should see that two payment methods are displayed
      | username        | password |
      | testuser@gm.com | 12345678 |
