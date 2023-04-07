Feature: Login User

  @Team2 @Users @Positive
  Scenario: Post login with valid user json
    Given Login with valid user json
    When Send request post login user
    Then Should return status code 200
    And  Validate json schema login user

  @Team2 @Users @Negative
  Scenario: Post login with invalid user email json
    Given Login with invalid user email json
    When Send request post login user
    Then Should return status code 400

  @Team2 @Users @Negative
  Scenario: Post login with invalid user password json
    Given Login with invalid user password json
    When Send request post login user
    Then Should return status code 400
    And Validate invalid login json schema

  @Team2 @Users @Negative
  Scenario: Post login with invalid email and password
    Given Login with invalid email and password json
    When Send request post login user
    Then Should return status code 400
    And Validate invalid email and password json schema