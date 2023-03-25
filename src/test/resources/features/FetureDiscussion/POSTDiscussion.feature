Feature: Get List Todos

Scenario: Get List Todos
  Given Get list todos with valid parameter
  When Send request get list todos
  Then Should return status code 200 OK
  And Validate json schema list todos