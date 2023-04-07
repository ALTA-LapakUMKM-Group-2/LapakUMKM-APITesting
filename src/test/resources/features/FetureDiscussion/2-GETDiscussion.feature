Feature: Get Discussion

  @Team2 @Discussion @Positive
  Scenario: Get list data discussion
    Given Get list data discussion
    When  Send get list data
    Then Status code should be 200 OK
    And Validate get list data resource json schema


  @Team2 @Discussion @Positive
  Scenario: Get single data with valid id
    Given Get single data discussion with valid id 12
    When Send get single data discussion
    Then Status code should be 200 OK
    And Validate get discussion single data resource json schema

  @Team2 @Discussion @Negative
  Scenario: Get single data with invalid id special character
    Given Get single data discussion with invalid id special character "#&*"
    When Send get single data discussion
    Then Status code should be 404 Not Found
    And Validate get single data invalid id resource json schema

  @Team2 @Discussion @Negative
  Scenario: Get single data with invalid id special character
    Given Get single data discussion with invalid id alphabet "AAA"
    When Send get single data discussion
    Then Status code should be 404 Not Found
    And Validate get single data invalid id resource json schema

  @Team2 @Discussion @Negative
  Scenario: Get single data with id not registered
    Given Get single data discussion with not registered id 2000000
    When Send get single data discussion
    Then Status code should be 404 Not Found
    And Validate get single data invalid id resource json schema
