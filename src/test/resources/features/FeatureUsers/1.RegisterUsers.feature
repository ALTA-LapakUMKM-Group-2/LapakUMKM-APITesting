Feature: Register User

  @Team2 @Users @Positive
  Scenario: Post register data
    Given Post register user with valid json
    When Send request post register user
    Then Should return status code 500
  ##  And Validate json schema register

    @Team2 @Users @Negative
    Scenario: Post register new user with invalid email
      Given Post register user with invalid email json
      When Send request post register user
      Then Should return status code 500

    @Team2 @Users @Negative
    Scenario: Post register new user with invalid password
      Given Post register user with invalid password json
      When Send request post register user
      Then Should return status code 500
      And Validate invalid register json schema

    @Team2 @Users @Negative
    Scenario: Post register new user with invalid email and password
      Given Post register user with invalid email and password
      When Send request post register user
      Then Should return status code 400
      And Validate invalid json schema register