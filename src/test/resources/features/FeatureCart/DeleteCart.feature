Feature: Delete cart

  Scenario: Delete cart
    Given Delete cart with id 126
    When Send delete cart
    Then Status code should be 200 OK

  Scenario: Put edit cart with invalid id
    Given Delete cart with id 1000
    When Send delete cart
    Then Status code should be 404 Not Found