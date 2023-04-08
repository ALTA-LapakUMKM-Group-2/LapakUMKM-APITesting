Feature: Get Discussion

  @Team2 @Users @Positive
  Scenario: Get Users
    Given Get users data
    When  Send get users
    Then Should return status code 200
    And Validate get users json schema

    @Team2 @Users @Negative
  Scenario: Get Users With Invalid Parameter
      Given Get users data with invalid parameter
      When Send get users
      Then Should return status code 401
  ##    And Validate get users invalid parameter json schema