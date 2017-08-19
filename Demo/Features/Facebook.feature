Feature: Test Facebook

  Scenario: Login functionality exists
    Given I have opened the browser
    When I open Facebook website
    Then Login button should exists
    When user enter valid Facebook credentilas "ramakrishna" and "Ram9446"