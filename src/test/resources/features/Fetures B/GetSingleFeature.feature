#Feature:Get single user
#
#  Scenario Outline: Get single user detail registered
#    Given Get single user detail registered <id>
#    When Send get single user parameter
#    Then Status code should be 200 OK
#    And Respons body should be <id> user
#    And Validate get single user detail resources json schema
#   Examples:
#     | id     |
#     | 424068 |
#     | 424066 |
#     | 423967 |
#
#    Scenario Outline: Get single user detail unregitered id
#      Given Get single user detail unregistered <id>
#      When Send get single user parameter
#      Then Status code should be 404 Not Found
#      And Respons body should error "Resource not found"
#      And Validate json schema
#      Examples:
#        | id    |
#        | 12    |
#        | 13132 |
#        | 67676 |
#
