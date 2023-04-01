Feature: Get List All Product
  @Team2
  Scenario: Get list all product valid parameter
    Given Get list all product with valid parameter
    When Send get list all product parameter
    Then Status code should be 200 OK
    And Validate get list all valid parameter product resources json schema
  @Team2
  Scenario Outline: Get list all product with invalid parameter
    Given Get list all product with invalid parameter id "<string>"
    When Send get list all product parameter
    Then Status code should be 404 Not Found
    And Validate get list all product invalid parameter product resources json schema
  Examples:
  |   string |
  |   waws   |
  |  28372   |
  |   @#MD12 |