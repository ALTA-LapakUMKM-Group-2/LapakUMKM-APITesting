Feature: Put Update Discussion

@Team2 @Discussion @Positive
Scenario: Put update data discussion
  Given Put update data request body discussion id 31
  When Send put update data
  Then Status code should be 200 OK
  And Validate put update data resource json schema