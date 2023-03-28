Feature: Feature Category

  @category
  Scenario: Get list data Categories
    Given Get list data categories
    When  Send get list data
    Then Status code should be 200 OK
    And Validate get list resources json schema

#  Scenario: Post create new categories
#    Given Create new categories
#    When  Send categories
#    Then Status code should be 201 Created
#    And Validate new categories resource json schema
#
#  Scenario: Post  create new categories and empty value (invalid)
#    Given Create new categories empty value (invalid)
#    When  Send categories
#    Then Status code should be 400 Bad Request
#
#  Scenario: Post  create categories  long value
#    Given Create new categories long value
#    When  Send get list data
#    Then Status code should be 400 Bad Request
#    And Validate get list data resource json schema
#
#  Scenario: Get single data Categories with valid ID
#    Given Get single data categories with valid id
#    When  Send get single categories
#    Then Status code should be 200 OK
#    And Validate get single data resource json schema
#
#  Scenario: Get a single data Categories with invalid ID
#    Given Get single categories with invalid id
#    When  Send get single categories
#    Then Status code should be 404 Not Found (di swager 400)
#    And Validate get single data resource json schema