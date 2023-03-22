Feature: Get list user

  Scenario: Get list user with valid parameter
  Given Get list user with valid parameter
  When Send get list user parameter
  Then Status code should be 200 OK
  And Validate get list resources json schema

  Scenario Outline: Get list user with valid page paramater
    Given Get list user with page <id> valid parameter
    When Send get list user parameter page
    Then Status code should be 200 OK
    And Validate get list resources json schema
  Examples:
    | id |
    | 2  |
    | 3  |
    | 4  |

  Scenario Outline: Get list user with invalid paramater
    Given Get list user invalid parameter "<string>"
    When Send get list user parameter
    Then Status code should be 404 Not Found
  Examples:
  |   string   |
  |   waws     |
  |  28372     |
  |  @#MD12    |

  Scenario Outline: Get list user with invalid page paramater
    Given Get list user invalid page parameter <id>
    When Send get list user parameter page
    Then Status code should be 404 Not Found
  Examples:
    | id   |
    | 100  |
    | 5087 |
    | 1000 |




