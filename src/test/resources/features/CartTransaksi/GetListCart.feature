Feature: Get List Cart

Scenario: Get List Cart
  Given Get list todos with valid parameter
  When Send request get list cart
  Then Should return status code 200 OK
  And Validate json schema list cart

  Scenario:Get single cart with valid id
    Given Get single data cart with valid id
    When  Send get single cart
    Then Status code should be 200 OK
    And Validate get single data resource json schema

  Scenario:
    Feature