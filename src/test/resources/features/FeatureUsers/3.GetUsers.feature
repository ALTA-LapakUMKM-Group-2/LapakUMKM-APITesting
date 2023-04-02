Feature: Get Discussion

  @Team2 @Discussion @Positive
  Scenario: Get Users
    Given Get users data
    When  Send get users
    Then Should return status code 200
    And Validate get users json schema