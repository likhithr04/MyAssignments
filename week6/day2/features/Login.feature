Feature: Login functionality of TestLeaf Application

 Scenario: Login with valid creds
    Given Launch the browser
    And Load the url
    And username as Demomanager
    And password as crmfsa
    When click on enter button
    Then it should be able to login
    
    