Feature: Put edit cart

  Scenario: Put edit cart
    Given Put edit new data with request body cart with id 126
    When Send edit new cart
    Then Status code should be 200 OK