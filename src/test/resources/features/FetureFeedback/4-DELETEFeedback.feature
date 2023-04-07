Feature: DELETE Data feedback

  @Team2 @Feedback @Positive
  Scenario: Delete data feedback with valid id
    Given Delete data feedback with valid id 236
    When Send delete data feedback
    Then Status code should be 200 OK
    And Validate delete data feedback recourse json schema


  @Team2 @Feedback @Negative
  Scenario: Delete data feedback with invalid id alphabet
    Given Delete data feedback with invalid alphabet "AAAAA"
    When Send delete data feedback
    Then Status code should be 404 Not Found


  @Team2 @Feedback @Negative
  Scenario: Delete data feedback with invalid id special character
    Given Delete data feedback with invalid special character "%%$%"
    When Send delete data feedback
    Then Status code should be 404 Not Found


  @Team2 @Feedback @Negative
  Scenario: Delete data feedback with no registered id
    Given Delete data feedback with no registered id 1000000000
    When Send delete data feedback
    Then Status code should be 404 Not Found

