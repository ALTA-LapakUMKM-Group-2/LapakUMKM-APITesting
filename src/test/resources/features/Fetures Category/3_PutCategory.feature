@Team2
Feature: Feature Category


  Scenario: Put update category with valid id
    Given Put update category with valid 24
    When  Send put update category
    Then Status code should be 200 OK
    And Validate put update category resource json schema

  Scenario: Put update category with invalid id
    Given Put update category with invalid 100
    When  Send put update category
    Then Status code should be 404 Not Found

  Scenario: Put update category with valid id and empty value
    Given Put Update category with valid 11 input empty value
    When  Send put update category
    Then Status code should be 400 Bad Request
    And Validate put update category resource json schema