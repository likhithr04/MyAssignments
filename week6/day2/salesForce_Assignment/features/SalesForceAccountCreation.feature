Feature: Salesforce Account Creation
  As a Salesforce user
  I want to create a new Account
  So that I can verify it is successfully saved

  Scenario: Create a new Account with valid details
    When the user logs in with valid credentials
    And the user clicks on the toggle menu button from the left corner
    And the user clicks on 'View All' and selects 'Sales' from App Launcher
    And the user navigates to the Accounts tab
    And the user clicks on the New button
    And the user enters "Likhith" as account name
    And the user selects Ownership as "Public"
    And the user clicks on Save
    Then the account name should be displayed as "Likhith"
