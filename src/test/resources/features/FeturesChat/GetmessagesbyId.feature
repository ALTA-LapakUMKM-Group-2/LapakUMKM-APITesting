Feature: GET Data users by id

  @Chat
  Scenario: Get list data Categories
    Given Get messages data by chatroom parameter valid Id "R1553"
    When Send get messages by chatroom valid Id
    Then Status code should be 200 OK
    And Validate get messages by chatroom with valid id resources json schema

  @Chat
  Scenario: Get single data categories with invalid id
    Given Get messages data by chatroom parameter alphabet invalid Id "AAA"
    When Send get messages by chatroom invalid Id
    Then Status code should be 404 Not Found
    And Validate get messages by chatroom with invalid id resources json schema


  @Chat
  Scenario: GET messages by chatroom special character Id
    Given Get messages data by chatroom parameter special character invalid Id "%%$#"
    When Send get messages by chatroom invalid Id
    Then Status code should be 404 Not Found
    And Validate get messages by chatroom with invalid id resources json schema


  @Chat
  Scenario: GET messages by chatroom unregister Id
    Given Get messages data by chatroom parameter unregister Id 12345678
    When Send get messages by chatroom valid Id
    Then Status code should be 404 Not Found
    And Validate get messages by chatroom with invalid id resources json schema
