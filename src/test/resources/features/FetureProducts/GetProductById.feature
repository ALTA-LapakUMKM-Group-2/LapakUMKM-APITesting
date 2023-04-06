Feature: Get Product By id
  @Team2
  Scenario: Get product by id with valid parameter
   Given Get product by id 1 with valid parameter
    When Send get product by id parameter
    Then Status code should be 200 OK
    And Validate product by id valid parameter product resources json schema
  @Team2
    Scenario Outline: Get product by id with invalid parameter
      Given Get product by id with invalid parameter id <id>
      When Send get product by id parameter
      Then Status code should be 404 Not Found
      And Validate get product by id invalid parameter product resources json schema
      Examples:
        | id |
        | 565 |
        | 13132 |
        | 67676 |