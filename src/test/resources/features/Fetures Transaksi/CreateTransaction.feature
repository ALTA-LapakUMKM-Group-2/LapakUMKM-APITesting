@Team2
Feature: Create Transaksi

  @transaction @get
    Scenario: Post create new transaction
    Given Post create new data with request body transaction
    When  Send create new transaction
    Then Status code should be 201 created
    And Validate new transaction resource json schema

  Scenario: Post  create new transaction and empty value (invalid)
      Given Create new transaction empty value (invalid)
      When  Send transaction
      Then Status code should be 400 Bad Request
#
#
