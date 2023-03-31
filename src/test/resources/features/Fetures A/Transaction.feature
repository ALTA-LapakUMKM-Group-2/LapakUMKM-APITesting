Feature: Get Transaksi
  Scenario: Get by id
    Given Get single data transcation with valid id <12>
    When Send get single data transcation
    Then Statuscode should be 200 OK
    And Validate get single data resource json schema