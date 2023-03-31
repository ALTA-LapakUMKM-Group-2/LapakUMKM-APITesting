Feature: Delete Data Discussion

  @Team2 @Discussion @Positive
  Scenario: Delete data discussion with valid id
    Given Delete data discussion with valid id 29
    When Send delete data discussion
    Then Status code should be 200 OK
    And Validate delete data discussion recourse json schema


  @Team2 @Discussion @Negative
  Scenario: Delete data discussion with invalid id alphabet
    Given Delete data discussion with invalid alphabet "AAA"
    When Send delete invalid data discussion
    Then Status code should be 404 Not Found
    And Validate delete data invalid id discussion recourse json schema


  @Team2 @Discussion @Negative
  Scenario: Delete data discussion with invalid id special character
    Given Delete data discussion with invalid special character "###"
    When Send delete data discussion
    Then Status code should be 404 Not Found
    And Validate delete data invalid id discussion recourse json schema


  @Team2 @Discussion @Negative
  Scenario: Delete data discussion with no registered id
    Given Delete data discussion with no registered id 1000000
    When Send delete data discussion
    Then Status code should be 404 Not Found
    And Validate delete data invalid id discussion recourse json schema
