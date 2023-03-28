Feature: Todos Delete Id API Automation Testing

  @Team2 @Feedback @Positive
  Scenario: Delete user with valid parameter
    Given Get data feedback from product id  with valid id 27
    When  Send Get data feedback from product
    Then Status code should be 200 OK
    And Validate feedback from product resource json schema

  @Team2 @Feedback @Negative
  Scenario: Get data feedback from product id with no registered id
    Given Get data feedback from product id with no registered id 10000000
    When  Send Get data feedback from product
    Then Status code should be 404 Not Found


  @Team2 @Feedback @Negative
  Scenario: Get data feedback from  product id with id special character
    Given Get data feedback from  product id with invalid special character id "^$&$"
    When Send Get data feedback from product
    Then Status code should be 404 Not Found


  @Team2 @Feedback @Negative
  Scenario: Get data feedback from  product id with id alphabet
    Given Get data feedback from  product id with invalid alphabet id "AAAA"
    When Send Get data feedback from product
    Then Status code should be 404 Not Found


  @Team2 @Feedback @Negative
  Scenario: Get data feedback from  product id with id alphabet
    Given Get data feedback from product id without id ""
    When Send Get data feedback from product
    Then Status code should be 404 Not Found