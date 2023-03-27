Feature: GET data discussion from product id

  @Team2 @Discussion @Positive
  Scenario: Get data discussion from product id  with valid id
    Given Get data discussion from product id  with valid id 27
    When  Send get data form product
    Then Status code should be 200 OK
    And Validate get data from product data resource json schema

