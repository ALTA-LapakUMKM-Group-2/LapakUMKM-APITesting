Feature: Get product by user
  @Team2
  Scenario: [Products-A007]Get product by user id with valid parameter
    Given Get product by user id with valid parameter
    When Send get product by user id parameter
    Then Status code should be 200 OK
    And Validate product by user id parameter product resources json schema
  @Team2
  Scenario: [Products-A008]Get product by user id with invalid parameter
    Given Get product  by user id  with invalid parameter
    When Send get product by user id parameter
    Then Status code should be 404 Not Found
    And Validate product by user id invalid parameter product resources json schema