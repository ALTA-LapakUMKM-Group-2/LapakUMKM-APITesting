Feature: Get Discussion

  @Team2 @Discussion @Positive
  Scenario: Get list data discussion
    Given Get list data discussion
    When  Send get list data
    Then Status code should be 200 OK
    And Validate get list data resource json schema


  @Team2 @Discussion @Positive
  Scenario: Get single data with valid id
    Given Get single data discussion with valid id 26
    When Send get single data discussion
    Then Status code should be 200 OK
    And Validate get single data resource json schema

