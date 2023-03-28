Feature: POST create product

  Scenario: [Products-A011]Post create product valid json request body with auth token
    Given Post create product valid json request body with auth token
    When Send post create product parameter
    Then Status code should be 201 Created
    And Validate post create new user with auth token resources json schema

  Scenario: [Products-A012]Post create product valid json request body without auth token
    Given Post create product valid json request body without auth token
    When Send post create product parameter
    Then Status code should be 401 Unauthorized
    And Validate post create new user without auth token resources json schema

  Scenario: [Products-A013]Post create product without json request body
    Given Post create product without json request body
    When Send post create product parameter
    Then Status code should be 400 Bad Request
    And Validate create product without json request body resources json schema

  Scenario: [Products-A014]Post create product with empty string field json request body
    Given Post create product with empty field json request body
    When Send post create product parameter
    Then Status code should be 400 Bad Request
    And Validate create product with empty field json request body resources json schema

  Scenario:[Products-A015]Post create product with invalid parameter
    Given Post create product with invalid parameter
    When Send post create product parameter
    Then Status code should be 404 Not Found
    And Validate create product with invalid parameter resources json schema
