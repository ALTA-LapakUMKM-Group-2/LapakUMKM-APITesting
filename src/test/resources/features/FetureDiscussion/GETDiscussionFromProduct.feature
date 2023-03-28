Feature: GET data discussion from product id

  @Team2 @Discussion @Positive
  Scenario: Get data discussion from product id  with valid id
    Given Get data discussion from product id  with valid id 27
    When  Send get data form product
    Then Status code should be 200 OK
    And Validate get data discussion from product data resource json schema


  @Team2 @Discussion @Negative
  Scenario: Get data discussion from product id with no registered id
    Given Get data discussion from product id with no registered id 122222222
    When  Send get data invalid id form product
    Then Status code should be 404 Not Found
    And Validate get invalid data discussion from product data resource json schema


  @Team2 @Discussion @Negative
  Scenario: Get data discussion from  product id with invalid special character id
    Given Get data discussion from  product id with invalid id "%%$#"
    When  Send get data invalid id form product
    Then Status code should be 404 Not Found
    And Validate get invalid data discussion from product data resource json schema


  @Team2 @Discussion @Negative
  Scenario: Get data discussion from  product id with invalid alphabet id
    Given Get data discussion from  product id with invalid alphabet id "AAA"
    When  Send get data invalid id form product
    Then Status code should be 404 Not Found
    And Validate get invalid data discussion from product data resource json schema


  @Team2 @Discussion @Negative
  Scenario: Get data discussion from  product id  without id
    Given Get data discussion from  product id  without id
    When  Send get data without id form product
    Then Status code should be 404 Not Found
    And Validate get invalid data discussion from product data resource json schema
