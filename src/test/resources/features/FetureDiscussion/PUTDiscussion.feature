Feature: Put Update Discussion

@Team2 @Discussion @Positive
Scenario: Put update data discussion
  Given Put update data request body discussion id 41
  When Send put update data
  Then Status code should be 200 OK
  And Validate put update data resource json schema


  @Team2 @Discussion @Negative
  Scenario: Put update data with invalid json
    Given Put update data request body with valid json 41
    When Send put update data
    Then Status code should be 400 Bad Request
    And Validate put discussion invalid update data resource json schema


  @Team2 @Discussion @Negative
  Scenario: Put update data invalid product id
    Given Put update data request body invalid product id 41
    When Send put update data
    Then Status code should be 200 OK
    And Validate put update data resource json schema


  @Team2 @Discussion @Negative
  Scenario: Put update data with product id is blank
    Given Put update data with request body product id is blank 41
    When Send put update data
    Then Status code should be 200 OK
    And Validate put update data resource json schema
