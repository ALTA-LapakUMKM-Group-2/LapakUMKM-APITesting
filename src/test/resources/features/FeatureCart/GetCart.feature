@Team2
Feature: Get Cart

Scenario: Get List Cart
  Given Get list data cart valid parameter
  When Send request get list cart
  Then Status code should be 200 OK
  And Validate json schema list cart

