Feature: POST Create New Feedback Data

  @Team2 @Feedback @Positive
  Scenario: Post create new data with valid json
    Given Post create new data with request body valid id product and feedback
    When Send post for create new data
    Then Status code should be 201 Created
    And Validate post create new data resources json schema


  @Team2 @Feedback @Negative
  Scenario: Post Create new data with parent id  is blank
    Given Post create new data with request body parent id is blank
    When Send post for create new data
    Then Status code should be 400 Bad Request
    And Validate post invalid create new data resources json schema


  @Team2 @Feedback @Negative
  Scenario: Post Create new data with parent id  is blank
    Given Post create new data with request body parent id is blank
    When Send post for create new data
    Then Status code should be 400 Bad Request
    And Validate post invalid create new data resources json schema



  @Team2 @Feedback @Negative
  Scenario: Post Create new data with parent id  is blank
    Given Post create new data with request body parent id is blank
    When Send post for create new data
    Then Status code should be 400 Bad Request
    And Validate post invalid create new data resources json schema