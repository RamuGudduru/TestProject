Feature: Facebook Login Functionality
	
@Ram	
Scenario: Facebook Login with valid data
    Given Launch Facebook Application
    When User enter username and password
    And Click on login button
    Then User should login into Facebook application
    
    
Scenario: 2 Facebook Login with valid data
    Given Launch Facebook Application
    When User enter username and password
    And Click on login button
    Then User should login into Facebook application