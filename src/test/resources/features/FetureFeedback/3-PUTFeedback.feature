Feature: PUT Update data Feedback

  @Team2 @Feedback @Positive
  Scenario: Put update data with valid json
    Given Given Put update data request body with valid json 43
    When Send put update data
    Then Status code should be 200 OK
    And Validate put update data resource json schema


  @Team2 @Feedback @Positive
  Scenario: Put update data feedback
    Given Put update data request body feedback id 43
    When Send put update data
    Then Status code should be 200 OK
    And Validate put update data resource json schema


  @Team2 @Feedback @Positive
  Scenario: Put update data product id
    Given Put update data request body product id 43
    When Send put update data
    Then Status code should be 200 OK
    And Validate put update data resource json schema


  @Team2 @Feedback @Negative
  Scenario: Put update data invalid product id
    Given Put update data request body invalid product id 43
    When Send put update data
    Then Status code should be 200 OK
    And Validate put update data resource json schema

  @Team2 @Feedback @Negative
  Scenario: Put update data with product id is blank
    Given Put update data with request body product id is blank id 43
    When Send put update data
    Then Status code should be 200 OK
    And Validate put update data resource json schema


  @Team2 @Feedback @Negative
  Scenario: Put update data with product id is blank
    Given Put update data with request body product id is blank id 43
    When Send put update data
    Then Status code should be 200 OK
    And Validate put update data resource json schema


  @Team2 @Feedback @Negative
  Scenario: Put update data with feedback is blank
    Given Put update data with feedback id is blank id 4
    When Send put update data
    Then Status code should be 404 Not Found
    And Validate put invalid update data resource json schema


  @Team2 @Feedback @Negative
  Scenario: Put Create new data with request body rating is blank
    Given Put Create new data with request body rating is blank id 43
    When Send put update data
    Then Status code should be 200 OK
    And Validate put update data resource json schema


  @Team2 @Feedback @Negative
  Scenario: Put Create new data with request body invalid rating
    Given Put Create new data with request body invalid rating id 43
    When Send put update data
    Then Status code should be 400 Bad Request
    And Validate put invalid update data resource json schema


