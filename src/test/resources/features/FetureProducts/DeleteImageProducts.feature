Feature:Delete Products

@Test
  Scenario: [Products-A029]Delete image product with valid parameter
  Given Delete image product with valid parameter
  When Send delete image product parameter
  Then Status code should be 200 OK
  And Validate delete image product valid resources json schema

  Scenario: [Products-A030]Delete image product with invalid parameter
    Given Delete image product with invalid parameter
    When Send delete image product invalid parameter
    Then Status code should be 404 Not Found
    And Validate delete image product invalid resources json schema

  Scenario: [Products-A031]Delete image product valid parameter without auth token
    Given Delete image product without auth token
    When Send delete image product parameter
    Then Status code should be 401 Unauthorized
    And Validate delete image product without auth token resources json schema