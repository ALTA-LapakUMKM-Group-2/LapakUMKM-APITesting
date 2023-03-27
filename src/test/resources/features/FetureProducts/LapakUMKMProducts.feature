Feature: Get List Todos

Scenario: Get list all product valid parameter
  Given Get list all product with valid parameter
  When Send get list all product parameter
  Then Status code should be 200 OK
  And Validate get list all valid parameter product resources json schema