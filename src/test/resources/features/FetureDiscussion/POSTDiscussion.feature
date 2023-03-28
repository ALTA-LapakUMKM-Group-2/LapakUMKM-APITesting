Feature: POST Create new discussion data

  @Team2 @Discussion @Positive
  Scenario: Post create new data with valid json
    Given Post create new data with request body valid id product and discussion
    When Send post for create new data
    Then Status code should be 201 Created
    And Validate post create new data resources json schema

  @Team2 @Discussion @Positive
  Scenario: Post Create new data with parent id  is blank
    Given Post create new data with request body parent id is blank
    When Send post for create new data
    Then Status code should be 201 Created
    And Validate post create new data resources json schema


  @Team2 @Discussion @Negative
  Scenario: Post Create new data with invalid parent id
    Given Post Create new data with request body invalid parent id
    When Send post for create new data
    Then Status code should be 400 Bad Request
    And Validate post discussion invalid create new data resource json schema


  @Team2 @Discussion @Negative
  Scenario: Post Create new data with id not registered
    Given Post Create new data with product id not registered
    When Send post for create new data
    Then Status code should be 400 Bad Request
    And Validate post discussion invalid create new data resource json schema


  @Team2 @Discussion @Negative
  Scenario: Post Create new data with invalid json
    Given Post Create new data with invalid id product and discussion
    When Send post for create new data
    Then Status code should be 400 Bad Request
    And Validate post discussion invalid create new data resource json schema


  @Team2 @Discussion @Negative
  Scenario: Post Create new data with product id is blank
    Given Post Create new data with request body product id is blank
    When Send post for create new data
    Then Status code should be 400 Bad Request
    And Validate post discussion invalid create new data resource json schema


  @Team2 @Discussion @Negative
  Scenario: Post Create new data with discussion id is blank
    Given Post Create new data with request body discussion id is blank
    When Send post for create new data
    Then Status code should be 400 Bad Request
    And Validate post discussion invalid create new data resource json schema
