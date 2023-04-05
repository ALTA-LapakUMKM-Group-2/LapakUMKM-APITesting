Feature: Post Update Users

  @Team2 @Users @Positive
  Scenario: Post update users
    Given Post update data request body
    When Send put update data
    Then Should return status code 200
  ##  And Validate post update users resource json schema