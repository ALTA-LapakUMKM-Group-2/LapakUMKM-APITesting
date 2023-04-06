@Chat
Feature: POST create new chat

  Scenario: POST create new chat with valid data
    Given Post create new data chat with valid data json
    When Send post create new chat
    Then Status code should be 201 Created
    And Validate post create new data chat resources json schema


  Scenario: POST create new chat with invalid data
    Given Post create new data chat with invalid data json
    When Send post create new chat
    Then Status code should be 400 Bad Request
    And Validate post create new data invalid chat resources json schema


  Scenario: POST create new chat without recipient_id
    Given Post create new data chat with recipient_id is blank
    When Send post create new chat
    Then Status code should be 400 Bad Request
    And Validate post create new data invalid chat resources json schema


  Scenario: POST create new chat without text
    Given Post create new data chat with text is blank
    When Send post create new chat
    Then Status code should be 201 Created
    And Validate post create new data chat resources json schema


