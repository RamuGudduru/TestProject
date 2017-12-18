Feature: Facebook Login Functionality
	

  Scenario: Facebook Login with valid data
    Given Launch Facebook Application
    When User enter username and password
    And Click on login button
    Then User should login into Facebook application
    
    
  Scenario: 2 Facebook Login with second valid data
    Given Launch Facebook Application
    When User enter username and password
    And Click on login button
    Then User should login into Facebook application
    
    @last
    Scenario: 3 Facebook Login with third valid data
    Given Launch Facebook Application
    When User enter username and password
    And Click on login button
    Then User should login into Facebook application
    