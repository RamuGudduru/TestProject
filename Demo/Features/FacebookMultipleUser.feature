Feature: Test Facebook

  Scenario Outline: Login functionality with one user
    Given I have opened the browser
    When I open Facebook website
    Then Login button should exists
    When user enter valid "<username>"
    And user enter valid "<password>"

    Examples: 
      | username    | password      |
      | ramakrishna | ram9951929446 |
      | narmadha1   | password123   |
      | sivasrinu   | amazon456     |
