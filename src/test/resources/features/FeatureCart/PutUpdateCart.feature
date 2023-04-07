Feature: Put edit cart

  Scenario: Put edit cart
    Given Put edit new data with request body cart with id 126
    When Send edit new cart
    Then Status code should be 200 OK

#  Scenario: Put edit cart with invalid id
#    Given Put edit new data with request body cart with id 1000
#    When Send edit new cart
#    Then Status code should be 404 Not Found