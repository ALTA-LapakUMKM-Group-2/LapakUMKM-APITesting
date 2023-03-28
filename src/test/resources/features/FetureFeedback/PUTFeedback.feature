Feature: PUT Update data Feedback

  @ProjectTeam4 @PositiveCase
  Scenario: Put update data with valid json
    Given Put update data request body with valid json id 24
    When Send put update data
    Then Status code should be 200 OK
    And Validate put update data resource json schema
