Feature: Feature Category

  @category @post
  Scenario: Post create new categories
    Given Post create new data with request body categories
    When Send create new categories
    Then Status code should be 201 Created

  Scenario: Post  create new categories and empty value (invalid)
    Given Post create new categories empty value
    When  Send create new categories
    Then Status code should be 400 Bad Request

  Scenario: Post  create categories  long value (invalid)
    Given Post create new categories long value
    When  Send create new categories
    Then Status code should be 400 Bad Request