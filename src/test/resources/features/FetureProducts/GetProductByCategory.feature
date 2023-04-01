Feature: Get product by category
  @Team2
  Scenario: [Products-A009]Get product by category with valid parameter
    Given Get product by category with valid parameter
    When Send get product by category parameter
    Then Status code should be 200 OK
    And Validate product by category  parameter product resources json schema
  @Team2
  Scenario: [Products-A010]Get product by category with invalid parameter
    Given Get product by category with invalid parameter
    When Send get product by category parameter
    Then Status code should be 404 Not Found
    And Validate product by category invalid parameter product resources json schema