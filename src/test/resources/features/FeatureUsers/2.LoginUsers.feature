Feature: Login User

  @Team2 @Users @Positive
  Scenario: Post login with valid user json
    Given Login with valid user json
    When Send request post login use
    Then Should return status code 200
    And Validate json schema login user