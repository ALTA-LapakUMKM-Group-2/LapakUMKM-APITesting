Feature:


  Scenario: [Products-A005]Get image by product id valid parameter
    Given Get image by product id 10 valid parameter
    When Send get image by products id parameter
    Then Status code should be 200 OK
    And Validate image by products resources json schema

  Scenario Outline: [Products-A006]Get image by product id invalid parameter
    Given Get image by product id invalid parameter id <id>
    When Send get image product by id parameter
    Then Status code should be 404 Not Found
    And Validate get image product by id invalid parameter product resources json schema
    Examples:
      | id     |
      | 8080   |
      | 377383 |
      | 38373      |