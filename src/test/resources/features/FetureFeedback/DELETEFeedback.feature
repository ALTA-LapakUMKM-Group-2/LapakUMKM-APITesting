Feature: DELETE Data feedback

  @Team2 @Feedback @Positive
  Scenario: Delete data feedback with valid id
    Given Delete data feedback with valid id 16
    When Send delete data feedback
    Then Status code should be 200 OK
    And Validate delete data feedback recourse json schema
