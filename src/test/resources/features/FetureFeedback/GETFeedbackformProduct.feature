Feature: Todos Delete Id API Automation Testing

  @ProjectTeam4 @PositiveCase
  Scenario: Delete user with valid parameter
    Given Get data feedback from product id  with valid id 27
    When  Send  Get data feedback from product
    Then Status code should be 200 OK
    And Validate feedback from product resource json schema
