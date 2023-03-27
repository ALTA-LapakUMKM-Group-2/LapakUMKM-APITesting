Feature: Delete Data Discussion


@Team2 @Discussion @Positive
Scenario: Delete data discussion with valid id
  Given Delete data discussion with valid id 26
  When Send delete data discussion
  Then Status code should be 200 OK
  And Validate delete data discussion recourse json schema