Feature: Feature Category

  @category @delete
  Scenario: Delete Category With valid id
    Given Delete category with valid 20
    When Send delete category
    Then Status code should be 200 OK

  Scenario: Delete category with invalid id
    Given Delete category with invalid 1000
    When  Send delete category
    Then Status code should be 404 Not Found