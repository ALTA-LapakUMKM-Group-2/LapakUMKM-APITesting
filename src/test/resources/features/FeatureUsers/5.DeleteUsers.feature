Feature: Delete Users

  @Team2 @Users @Positive
  Scenario: Delete Users
    Given Delete users with valid parameter
    When Send delete users
    Then Should return status code 400
  ## And Validate delete users recourse json schema

  @Team2 @Users @Negative
    Scenario: Delete Users Invalid Param
    Given Delete users with invalid parameter
    When Send delete users
    Then Should return status code 400