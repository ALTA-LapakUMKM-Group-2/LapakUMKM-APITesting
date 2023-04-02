Feature: Register User

  @Team2 @Users @Positive
  Scenario: Post register data
    Given Post register user with valid json
    When Send request post register user
    Then Should return status code 200
    And Validate json schema register