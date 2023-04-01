Feature:Delete Products

  @Team2
  Scenario: [Products-A027]Delete product with valid parameter
    Given Delete product with valid parameter
    When Send delete product parameter
    Then Status code should be 200 OK
    And Validate delete product valid resources json schema
  @Team2
  Scenario: [Products-A028]Delete product valid parameter without auth token
    Given Delete product valid parameter without auth token
    When Send delete product parameter
    Then Status code should be 401 Unauthorized
    And Validate delete product without auth token resources json schema
  @Team2
  Scenario: [Products-A029]Delete product valid parameter without auth token
    Given Delete product with invalid parameter
    When Send delete product parameter
    Then Status code should be 404 Not Found
    And Validate delete product invalid resources json schema