#Feature: Post creat new user
#
#  Scenario: Post create new user valid parameter and json with auth token
#    Given Post create new user valid paramater and json with auth token
#    When Send post create new user parameter
#    Then Status code should be 201 Created
#    And Respons body should be name "ALTA GOREST", gender "male" and Status "active"
#    And Validate post create new user resources json schema
#
#  Scenario: Post create new user valid parameter and json without auth token
#    Given Post create new user valid parameter and json without auth token
##    When Send post create new user parameter
#    Then Status code should be 401 Unauthorized
#    And Respons body should be message "Authentication failed"
#    And Validate post create new user resources json schema without auth token
#
#  Scenario: Post create new user valid parameter and empty name json
#    Given Post create new user valid parameter and empty name json with auth token
#    When Send post create new user parameter
#    Then Status code should be 422 Unprocessable Entity
#    And Respons body should be field "name" message "can't be blank"
#    And Validate post create new user empty name resources json schema
#
#    Scenario: Post create new user valid parameter and empty email json
#      Given Post create new user valid parameter and empty email json with auth token
#      When Send post create new user parameter
#      Then Status code should be 422 Unprocessable Entity
#      And Respons body should be field "email" message "can't be blank"
#      And Validate post create new user empty email resources json schema
#
#      Scenario: Post create new user valid parameter and empty gender json
#        Given Post create new user valid parameter and empty gender json with auth token
#        When Send post create new user parameter
#        Then Status code should be 422 Unprocessable Entity
#        And Respons body should be field "gender" message "can't be blank, can be male of female"
#        And Validate post create new user empty gender resources json schema
#
#    Scenario: Post create new user valid parameter and empty status json
#      Given Post create new user valid parameter and empty status json with auth token
#      When Send post create new user parameter
#      Then Status code should be 422 Unprocessable Entity
#      And Respons body should be field "status" message "can't be blank"
#      And Validate post create new user empty status resources json schema
#
#  Scenario Outline: Post create new user with invalid parameter
#        Given Post create new user invalid parameter "<string>" with auth token
#        When Send post create new user parameter
#        Then Status code should be 404 Not Found
#    Examples:
#      | string |
#      | dwdw   |
#      | 23453  |
#      | @#MD12 |
#
#    Scenario: Post create new user with email regitered
#      Given Post create new user valid paramater and json with email registered
#      When Send post create new userr parameter
#      Then Status code should be 422 Unprocessable Entity
#      And Respons body should be field "email" message "has already been taken"
#      And Validate post create new user email registered resources json schema
#
#
