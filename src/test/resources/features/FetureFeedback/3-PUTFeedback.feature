Feature: PUT Update data Feedback

  @Team2 @Feedback @Positive
  Scenario: Put update feedback data with valid json
    Given Given Put update data request body with valid json 210
    When Send put update data feedback
    Then Status code should be 200 OK
    And Validate put update data feedback resource json schema


  @Team2 @Feedback @Positive
  Scenario: Put update data feedback
    Given Put update data request body feedback id 210
    When Send put update data feedback
    Then Status code should be 200 OK
    And Validate put update data feedback resource json schema


  @Team2 @Feedback @Positive
  Scenario: Put update feedback data product id
    Given Put update data request body product id 210
    When Send put update data feedback
    Then Status code should be 200 OK
    And Validate put update data feedback resource json schema


  @Team2 @Feedback @Negative
  Scenario: Put update feedback data invalid product id
    Given Put update data request body invalid product id 210
    When Send put update data feedback
    Then Status code should be 200 OK
    And Validate put update data feedback resource json schema

  @Team2 @Feedback @Negative
  Scenario: Put update feedback data with product id is blank
    Given Put update data with request body product feedback id is blank id 210
    When Send put update data feedback
    Then Status code should be 200 OK
    And Validate put update data feedback resource json schema


  @Team2 @Feedback @Negative
  Scenario: Put update feedback data with product id is blank
    Given Put update data with request body product feedback id is blank id 210
    When Send put update data feedback
    Then Status code should be 200 OK
    And Validate put update data feedback resource json schema


  @Team2 @Feedback @Negative
  Scenario: Put update feedback data with feedback is blank
    Given Put update data with feedback id is blank id 210
    When Send put update data feedback
    Then Status code should be 200 OK
    And Validate put update data feedback resource json schema


  @Team2 @Feedback @Negative
  Scenario: Put Create feedback new data with request body rating is blank
    Given Put Create new data with request body rating is blank id 210
    When Send put update data feedback
    Then Status code should be 200 OK
    And Validate put update data feedback resource json schema


  @Team2 @Feedback @Negative
  Scenario: Put Create feedback new data with request body invalid rating
    Given Put Create new data with request body invalid rating id 210
    When Send put update data feedback
    Then Status code should be 400 Bad Request
    And Validate put invalid update data feedback resource json schema


