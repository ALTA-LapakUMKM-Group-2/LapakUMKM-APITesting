@Team2
Feature: Feature Category


  Scenario: Delete Category With valid id
    Given Delete category with valid 25
    When Send delete category
    Then Status code should be 200 OK

  Scenario: Delete category with invalid id
    Given Delete category with invalid 1000
    When  Send delete category
    Then Status code should be 404 Not Found