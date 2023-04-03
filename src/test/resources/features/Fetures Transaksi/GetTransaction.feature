Feature: Get Transaksi

  @transaction @get
  Scenario: Get list all data transaction
    Given Get list data transaction
    When  Send get list data transaction
    Then Status code should be 200 OK
    And Validate get list data transaction resource json schema


  Scenario: Get by transaction id
    Given Get by id with valid 54
    When Send get single data transcation
    Then Status code should be 200 OK
    And Validate get single data resource json schema

 Scenario: Get by transaction invalid id
    Given Get by with invalid 100
    When Send get single data transaction
    Then Status code should be 404 Not Found
    And Validate get single data resource json schema

  Scenario: detail transaction by id
    Given Get single data transaction with valid id 2
    When Send get single data transaction
    Then Status code should be 200 OK
    And Validate get single data resource json schema

  Scenario: detail transaction by invalid id
    Given Get Detail Transaction By Invalid 150
    When Send get single data transaction
    Then Status code should be 404 Not Found
    And Validate get single data resource json schema

#
#    Scenario: Post create
#      Given Create new transaction
#      When  Send transaction
#      Then Status code should be 201 Created
#      And Validate new transaction resource json schema
#
#
