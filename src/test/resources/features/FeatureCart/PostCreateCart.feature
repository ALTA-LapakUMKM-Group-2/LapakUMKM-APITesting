#Feature: Post Create Card

 Scenario: Post create new cart
  Given create new data with request body cart
  When  Send cart
  Then Status code should be 201 Created
  And Validate new cart resource json schema
#
#    Scenario:
#Given Create new cart empty value (invalid)
#When  Send cart
#Then Status code should be 400 Bad Request