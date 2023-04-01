Feature: Feature Category

  @category @get
  Scenario: Get list data Categories
    Given Get list data categories
    When  Send get list data
    Then Status code should be 200 OK
    And Validate get list resources json schema

    Scenario: Get single data categories with valid id
    Given Get single data categories with valid 2
    When  Send get single categories
    Then Status code should be 200 OK
    And Validate get single data resource json schema

    Scenario: Get single data Categories with invalid ID
    Given Get single data categories with invalid 100
    When  Send get single categories
    Then Status code should be 404 Not Found
