Feature: POST Create New Feedback Data

  @Team2 @Feedback @Positive
  Scenario: Post create new data with valid json
    Given Post create new data with request body valid id product and feedback
    When Send post for create new data feedback
    Then Status code should be 201 Created
    And Validate post create feedback new data resources json schema


  @Team2 @Feedback @Negative
  Scenario: Post Create new data with parent id  is blank
    Given Post create new data with request body parent id is blank feedback
    When Send post for create new data feedback
    Then Status code should be 400 Bad Request
    And Validate post feedback invalid create new data resources json schema


  @Team2 @Feedback @Negative
  Scenario: Post Create new data with invalid parent id
    Given Post Create new data with request body invalid parent id feedback
    When Send post for create new data feedback
    Then Status code should be 400 Bad Request
    And Validate post feedback invalid create new data resources json schema



  @Team2 @Feedback @Negative
  Scenario: Post Create data with product id not registered
    Given Post Create new data with product id not registered feedback
    When Send post for create new data feedback
    Then Status code should be 400 Bad Request
    And Validate post feedback invalid create new data resources json schema


  @Team2 @Feedback @Negative
  Scenario: Post Create new data with invalid json
    Given Post Create new data with invalid id product and feedback
    When Send post for create new data feedback
    Then Status code should be 400 Bad Request
    And Validate post feedback invalid create new data resources json schema


  @Team2 @Feedback @Negative
  Scenario: Post Create new data with product id is blank
    Given Post Create new data with request body product id is blank feedback
    When Send post for create new data feedback
    Then Status code should be 400 Bad Request
    And Validate post feedback invalid create new data resources json schema


  @Team2 @Feedback @Negative
  Scenario: Post Create new data with feedback id is blank
    Given Post Create new data with request body feedback id is blank
    When Send post for create new data feedback
    Then Status code should be 400 Bad Request
    And Validate post feedback invalid create new data resources json schema


  @Team2 @Feedback @Negative
  Scenario: Post Create new data with feedback id is blank
    Given Post Create new data with request body rating is blank
    When Send post for create new data feedback
    Then Status code should be 400 Bad Request
    And Validate post feedback invalid create new data resources json schema


  @Team2 @Feedback @Negative
  Scenario: Post Create new data with invalid rating
    Given Post Create new data with request body invalid rating
    When Send post for create new data feedback
    Then Status code should be 400 Bad Request
    And Validate post feedback invalid create new data resources json schema