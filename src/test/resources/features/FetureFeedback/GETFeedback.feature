Feature: GET Feedback Data

  @Team2 @Feedback @Positive
  Scenario: Get list feedback data
    Given Get list data feedback
    When  Send get list data
    Then Status code should be 200 OK
    And Validate get list data resource json schema


  @Team2 @Feedback @Positive
  Scenario: Get single data with valid id
    Given Get single data feedback with valid id 24
    When Send get single data feedback
    Then Status code should be 200 OK
    And Validate get single data resource json schema


  @Team2 @Feedback @Negative
  Scenario: Get single data with invalid id special character
    Given Get single data feedback with invalid id special character "###"
    When Send get single data feedback
    Then Status code should be 404 Not Found
    And Validate get single data invalid feedback id resource json schema


  @Team2 @Feedback @Negative
  Scenario: Get single data with invalid id special character
    Given Get single data feedback with invalid id alphabet "AAA"
    When Send get single data feedback
    Then Status code should be 404 Not Found
    And Validate get single data invalid feedback id resource json schema


  @Team2 @Feedback @Negative
  Scenario: Get single data with id not registered
    Given Get single data feedback with not registered id 100000000
    When Send get single data feedback
    Then Status code should be 404 Not Found
    And Validate get single data invalid feedback id resource json schema
